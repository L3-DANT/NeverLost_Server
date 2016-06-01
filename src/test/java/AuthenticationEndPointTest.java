

import static org.junit.Assert.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Endpoint;
import javax.ws.rs.core.Response;

import org.dant.beans.JsonConnectionBean;
import org.dant.beans.JsonSessionToken;
import org.dant.services.AuthenticationEndpoint;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

public class AuthenticationEndPointTest extends TestCase{
	
	@Mock
	JsonConnectionBean jcb;
	@Mock
	AuthenticationEndpoint ed;
	@Before
	public void before(){
		JsonConnectionBean jb;
		JsonSessionToken j = new JsonSessionToken();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/login")
	@Test
	public void testauthenticateUser (JsonConnectionBean b){
		// Case 1 : it's all good
		assertEquals("Damn son, where the heck are we ?",Response.status(200),ed.authenticateUser(jcb));
		assertNotNull(ed.authenticateUser(jcb));
		// Case 2  : Something is wrong
		assertEquals("Damn son, couldn't find this!",Response.status(401),ed.authenticateUser(jcb));
	}
	

	@Test
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/logout")
	public void TestlogoutUser(JsonSessionToken token){
		assertEquals("Déconnexion réussie !",Response.status(200),ed.logoutUser(token));
	}
	
	@Test
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/checkout")
	private void TestCheckoutUser(JsonSessionToken token){
		assertEquals("Le checkout s'est bien déroulé",Response.status(200),ed.checkoutUser(token));
		assertEquals("Le checkout ne s'est pas bien déroulé",Response.status(401),ed.checkoutUser(token));
	}
	
	public static RepeatedTest suite(){
		return new RepeatedTest(new TestSuite(AuthenticationEndPointTest.class), 20);
	}
	public static void main(String[] args){
		junit.textui.TestRunner.run(suite());
		
	}

}
