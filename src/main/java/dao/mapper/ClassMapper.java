package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import dao.entity.Class;

public class ClassMapper implements RowMapper<Class> {

	
public Class map(ResultSet rs, StatementContext ctx) throws SQLException {
		return new Class(rs.getString("empl"), rs.getString("section"), rs.getString("name"));
	}
}
