package service.student;

import java.util.List;

import dao.StudentDAO;
import dao.entity.Student;

public class StudentServiceImpl {

	private StudentDAO studentDAO;
	
	
	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}

	public List<Student> getStudentsInClass(String secID) {
		return studentDAO.getAllStudents();
	}
	
	public Student getStudentInfo(String empl) {
		return studentDAO.getStudentInfo(empl);
	}

}

