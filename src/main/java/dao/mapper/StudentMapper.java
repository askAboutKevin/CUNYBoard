package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import dao.entity.Student;

public class StudentMapper implements RowMapper<Student> {

	public Student map(ResultSet rs, StatementContext ctx) throws SQLException {
		return new Student(rs.getString("name"), rs.getString("empl"), rs.getString("email"), rs.getString("number"), rs.getFloat(4));
	}
}

