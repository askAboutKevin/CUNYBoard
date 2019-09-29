package service.authorizer;

import dao.AuthorizerDAO;
import dao.entity.Authorized;

public class AuthorizerServiceImpl {
	
	private AuthorizerDAO authorizerDAO;

	public AuthorizerServiceImpl(AuthorizerDAO authorizerDAO) {
		super();
		this.authorizerDAO = authorizerDAO;
	}
	
	public Authorized authorize(String username, String password) {
		return authorizerDAO.getAuthorizedUser(password);
	}

}
