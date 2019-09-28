package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import dao.entity.Authorized;

public class AuthorizerMapper implements RowMapper<Authorized> {

	public Authorized map(ResultSet rs, StatementContext ctx) throws SQLException {
		return new Authorized(rs.getString("username"), rs.getString("password"));
	}

}
