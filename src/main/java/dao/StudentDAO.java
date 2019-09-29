package dao;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import dao.entity.Student;
import dao.mapper.StudentMapper;

public interface StudentDAO {

	@SqlQuery("Select name, empl, email, number FROM Students WHERE empl = ?")
	@RegisterRowMapper(StudentMapper.class)
	public Student getStudentInfo(String empl);
	
	@SqlQuery("Select name, empl, email, number FROM Students")
	@RegisterRowMapper(StudentMapper.class)
	public List<Student> getAllStudents();
	
	@SqlQuery("Select number FROM Students WHERE empl = ?")
	@RegisterRowMapper(StudentMapper.class)
	public List<String> getStudentNumbers (String section);
	
}
