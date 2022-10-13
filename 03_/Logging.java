package prova03redo;

public class Logging extends Login{
	
	@Override
	protected void Login(String user, String password) {
		System.out.println("The user" + user + "is now logged in.");
	}
	@Override
	protected void SigninWithIcloud(String user) {
		System.out.println("The user" + user + "is now logged in with your Icloud account.");
	}
	@Override
	protected void SigninWithFacebook(String user) {
		System.out.println("The user" + user + "is now logged in with your Facebook account.");
	}
	@Override
	protected void SigninWithGoogle(String user) {
		System.out.println("The user" + user + "is now logged in with your Google account.");
	}
	

}
