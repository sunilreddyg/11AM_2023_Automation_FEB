package miniproject;

public interface CommonObjects 
{
	//By Default Interface class variables are static and Final
	String obj_login_email="//input[@name='username']";
	String obj_login_password="//input[@name='password']";
	String obj_login_Submit_button="//button[contains(.,'Login')]";

	//LoginPage
	String obj_Dashboard="//h6[contains(.,'Dashboard')]";
}
