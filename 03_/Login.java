package prova03redo;

abstract class Login {
	public void FazerLogin() {
		SigninWithGoogle(null);
		SigninWithFacebook(null);
		SigninWithIcloud(null);
		Login(null, null);
	}

	protected abstract void Login(String user, String password);

	protected abstract void SigninWithIcloud(String user);

	protected abstract void SigninWithFacebook(String user);

	protected abstract void SigninWithGoogle(String user);

	
}
