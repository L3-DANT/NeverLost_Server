//import junit.extensions.RepeatedTest;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.ManagedBean;
//import javax.inject.Inject;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import org.bson.Document;
//import org.dant.beans.JsonConnectionBean;
//import org.dant.beans.JsonSessionToken;
//import org.dant.db.DAOUserImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//
//import com.google.gson.Gson;
////@ManagedBean
//@Path("/services")
//public class TestUserServices extends TestCase{
//	
//	@Mock
//	JsonSessionToken token;
//	@Mock
//	DAOUserImpl userDAO;
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/createuser")
//	@Test
//	public void testCreateUser(JsonConnectionBean bean) throws IOException {
//		assertNull("Le token est vide",token);
//		assertEquals("L'utilisateur a été créée",Response.status(200),userDAO.createUser(bean,"customString"));
//		assertEquals("L'utilisateur n'a pas été créée",Response.status(409),userDAO.createUser(bean,"customString"));
//	}
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("/deleteuser")
//	@Test
//	public void testDeleteUser(JsonSessionToken token){
//		assertNull("Le token est vide",token);
//		assertEquals("L'utilisateur a bien été supprimé",Response.status(200),userDAO.deleteUser(token));
//		assertEquals("L'utilisateur n'a pas été supprimé",Response.status(401),userDAO.deleteUser(token));
//	} 
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("/addfriend/{emailfriend}")
//	@Test
//	public void testAddFriend(JsonSessionToken token, @PathParam("emailfriend") String emailfriend){
//		assertNull("le token est vide",token);
//		assertEquals("Votre ami a bien été ajouté",Response.status(200),userDAO.addFriend(token.getEmail(), emailfriend));
//		assertEquals("Nous n'avons pas ajouté l'utilisateur à votre iste d'amis",Response.status(409),userDAO.addFriend(token.getEmail(), emailfriend));	
//	}
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("/deletefriend/{emailfriend}")
//	@Test
//	public void deleteFriend(JsonSessionToken token, @PathParam("emailfriend") String emailfriend) {
//		assertNull("Le token est vide",token);
//		assertEquals("L'utilisateur a été supprimé de votre liste d'amis",Response.status(200),userDAO.deleteFriend(token.getEmail(), emailfriend));
//		assertEquals("Problème lors de la suppression",Response.status(409),userDAO.deleteFriend(token.getEmail(), emailfriend));
//	}
//	
////	public static RepeatedTest suite(){
////		return new RepeatedTest(new TestSuite(UserServices.class), 1);
////	}
////	
////	public static void main(String[] args){
////		junit.textui.TestRunner.run(suite());
////	}
//}