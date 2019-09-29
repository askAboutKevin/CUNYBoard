package service.classes;

import java.util.ArrayList;
import java.util.List;

import dao.ClassDAO;
import dao.entity.Class;
import dao.entity.Student;

public class ClassServiceImpl {

	private ClassDAO classDAO;

	public ClassServiceImpl(ClassDAO classDAO) {
		super();
		this.classDAO = classDAO;
	}
	
	public List<Class> getClassEnrolledTo(String emplID) {
		return this.classDAO.getClassEnrolledInto(emplID);
	}
	
	public List<Student> getStudentsInClass(String section) {
		List<Class> objs = this.classDAO.getEmplsForStudentsInClass(section);
		List<Student> students = new ArrayList<Student>();
		for (Class c : objs) {
			Student s = this.classDAO.getStudentInfo(c.getEmpl());
			if(s != null) {
				students.add(s);
			}
		}
		return students;
	}
}
