package dao;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import dao.entity.Class;
import dao.entity.Student;
import dao.mapper.ClassMapper;
import dao.mapper.StudentMapper;

public interface ClassDAO {

	@SqlQuery("SELECT empl, section, name FROM Classes WHERE empl = ?")
	@RegisterRowMapper(ClassMapper.class)
	public List<Class> getClassEnrolledInto(String empl);
	
	@SqlQuery("Select empl, section, name FROM Classes WHERE section = ?")
	@RegisterRowMapper(ClassMapper.class)
	public List<Class> getEmplsForStudentsInClass(String section);
	
	@SqlQuery("Select name, empl, email, number FROM Students WHERE empl = ?")
	@RegisterRowMapper(StudentMapper.class)
	public Student getStudentInfo(String empl);
}
