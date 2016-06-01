package org.dant.db;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.core.Response;

import org.dant.beans.JsonConnectionBean;
import org.dant.beans.JsonSessionToken;
import org.dant.beans.User;

public interface DAOUser {
	public JsonSessionToken login(JsonConnectionBean bean);
	public Response.Status checkout(JsonSessionToken token);
	public void logout(JsonSessionToken token);
	public boolean createUser(JsonConnectionBean bean, String confirmemail);
	public boolean confirmUser(String email, String token);
	public boolean updateUser(User bean);
	public boolean deleteUser(JsonSessionToken token);
	public boolean addFriend(String me, String friend);
	public boolean deleteFriend(String me, String friend);
	public boolean userExists(String email);
	public User getUser(String email);
	public boolean requestFriend(String me, String friend);
	public boolean confirmFriend(String me, String friend);
	public boolean refuseFriend(String me, String friend);
	public ArrayList<User> getFriends(String email);
	public boolean setUserPos(String email,Date date, double lon, double lat);
	public boolean reinitPassword(String email, String password);
}
