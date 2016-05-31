
import static org.junit.Assert.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Endpoint;
import javax.ws.rs.core.Response;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.dant.db.DAOUserImpl;
import org.dant.json.JsonConnectionBean;
import org.dant.json.JsonSessionToken;
import org.dant.services.AuthenticationEndpoint;
import org.junit.Test;

public interface TestAuthenticationEndPoint extends TestCase{

}
