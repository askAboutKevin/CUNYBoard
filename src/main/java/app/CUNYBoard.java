package app;

import org.jdbi.v3.core.Jdbi;

import config.ServerConfiguration;
import dao.AuthorizerDAO;
import dao.ClassDAO;
import dao.StudentDAO;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.AuthorizerResource;
import resources.ClassResource;
import resources.StudentResource;
import resources.TwilioResource;
import service.authorizer.AuthorizerServiceImpl;
import service.classes.ClassServiceImpl;
import service.student.StudentServiceImpl;

public class CUNYBoard extends Application<ServerConfiguration> {
    public static void main(String[] args) throws Exception {
        new CUNYBoard().run(args);
    }

    @Override
    public String getName() {
        return "CUNYBoard App";
    }

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap) {
        // nothing to do yet
    }
    
    @Override
    public void run(ServerConfiguration configuration, Environment environment) {
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        
        final ClassDAO classDAO = jdbi.onDemand(ClassDAO.class);
        final StudentDAO studentDAO = jdbi.onDemand(StudentDAO.class);
        final AuthorizerDAO authorizerDAO = jdbi.onDemand(AuthorizerDAO.class);
      
        final StudentServiceImpl studentServiceImpl = new StudentServiceImpl(studentDAO);
        final ClassServiceImpl classServiceImpl = new ClassServiceImpl(classDAO);
        final AuthorizerServiceImpl authorizerServiceImpl = new AuthorizerServiceImpl(authorizerDAO);
        
        
        environment.jersey().register(new ClassResource(classServiceImpl));
        environment.jersey().register(new StudentResource(studentServiceImpl));
        environment.jersey().register(new AuthorizerResource(authorizerServiceImpl));
        environment.jersey().register(new TwilioResource());
        

    }

}
