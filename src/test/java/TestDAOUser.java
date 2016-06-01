//
//import java.io.Closeable;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Date;
//
//import javax.ws.rs.Produces;
//
//import org.bson.Document;
//import org.dant.beans.JsonConnectionBean;
//import org.dant.beans.JsonSessionToken;
//import org.dant.beans.User;
//import org.dant.db.DAOUserImpl;
////import org.dant.json.JsonConnectionBean;
////import org.dant.json.JsonSessionToken;
////import org.dant.beans.User;
//import org.junit.Test;
//import org.mockito.Mock;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.result.DeleteResult;
//import com.mongodb.client.result.UpdateResult;
//
//import junit.framework.TestCase;
//
//public class TestDAOUser extends TestCase{
//	
//	private MongoClient mc = null;
//	private MongoDatabase db = null;
//	private MongoCollection<Document> usersCollection = null;
//	
//	
//	private User user;
//	private DAOUserImpl daouser;
//	
//	@Mock
//	private DAOUserImpl imp;
//	@Test	
//	public void testLoginFailed(JsonConnectionBean bean)throws IOException{
//		JsonSessionToken token = imp.login(bean);
//		assertEquals("Le token est vide",null,token);
//	}
//	
//	@Test
//	public void testLoginSuccess(JsonConnectionBean bean)throws IOException {
//		JsonSessionToken token = imp.login(bean);
//		assertNotNull(token);
//	}
//
//	
//	@Test
//	public void testCreateUserSuccess(JsonConnectionBean bean) throws IOException{
//		boolean res = imp.createUser(bean,"customString");
//		assertNotNull("L'utilisateur a été créée",res);
//	}
//	
//	@Test
//	public void testCreateUserFailed(JsonConnectionBean bean)throws IOException {
//		boolean res = imp.createUser(bean, "customString");
//		assertNull("L'utilisateur n'a pas été initialisé",res);
//	}
//	
////	@Test
////	public void testCheckoutSuccess(JsonSessionToken token) throws IOException{
////		assertTrue("Déconnection Réussie",imp.checkout(token));
////	}
////	
////	@Test
////	public void testCheckoutFailed(JsonSessionToken token) throws IOException{
////		assertFalse("Il y a eu un probllème pendant la déconnexion",imp.checkout(token));
////	}
////	
//	
//	@Test
//	public void testDeleteUserSuccess(JsonSessionToken token) throws IOException{
//		assertTrue("L'utilisateur a bien été supprimé",imp.userExists(token.getEmail()));
//	}
//	
//	@Test
//	public void testDeleteUserFailed(JsonSessionToken token) throws IOException {
//		assertFalse("L'utilisateur n'a as été supprimé",imp.userExists(token.getEmail()));
//	}
//	
//	
//	@Test
//	public void testAddFriend(JsonSessionToken token, String friend) throws IOException{
//		assertEquals("Votre ami a bien été ajouté",true,imp.addFriend(token.getEmail(), friend));
//	}
//	
//	@Test
//	public void testAddFriendFailed(JsonSessionToken token, String friend)throws IOException{
//		assertEquals("La personne que vous souhaitez ajouter n'existe pas",false,imp.addFriend(token.getEmail(), friend));
//	}
//	
//	@Test
//	public void testDeleteFriendSuccess (JsonSessionToken token, String friend)throws IOException{
//		assertEquals("Cette personne a été supprimer de vore liste d'amis",true,imp.deleteFriend(token.getEmail(), friend));
//	}
//	
//	@Test 
//	void testDeleteFriendsFailed(JsonSessionToken token, String friend)throws IOException{
//		assertEquals("Il ya eu un problème lors de la suppression de l'utilisateur",false,imp.deleteFriend(token.getEmail(),friend));
//	}
//	
//	@Test
//	public void testUserExistsSuccess(String user){
//		 assertTrue("L'utilisateur existe",imp.userExists(user));
//	}
//	
//	@Test
//	public void testUsersExistsFailed(String user){
//		assertFalse("L'utilisateur n'existe pas",imp.userExists(user));
//	}
//	
//	@Test
//	public void testGetFriendListSucceess(JsonSessionToken token){
//		assertNotNull("La liste de vos amis a bien été récupéré",imp.getFriends(token.getEmail()));
//	}
//	@Test
//	public void testGetFriendListVide(JsonSessionToken token){
//		assertTrue("Si t'as pas d'amis, prend un curly",(imp.getFriends(token.getEmail())).isEmpty());
//	}
//	
//	@Test
//	public void testGetUserSuccess(String s)throws IOException{
//		assertNotNull("L'utilisateur a été trouvé",imp.getUser(s));
//	}
//	@Test
//	public void testGetUseerFailed(String s)throws IOException {
//		assertNull("L'utilisateur n'a pas pu être trouvé",imp.getUser(s));
//	}
//
//}
