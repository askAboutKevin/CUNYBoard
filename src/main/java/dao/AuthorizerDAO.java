package dao;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import dao.entity.Authorized;
import dao.mapper.AuthorizerMapper;;

public interface AuthorizerDAO {

	@SqlQuery("SELECT username, password FROM authorized WHERE password = ?")
	@RegisterRowMapper(AuthorizerMapper.class)
	public Authorized getAuthorizedUser(String password);
	
}
