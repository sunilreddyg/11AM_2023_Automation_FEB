package framework.junit;

import java.awt.ItemSelectable;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Asserts_In_Junit
{
	
	@Test
	public void tc001()
	{
		Assert.assertEquals("login", "login");
		System.out.println("tc001 Completed");
	}
	
	@Test
	public void tc002()
	{
		Assert.assertEquals("login", "Singin");
		System.out.println("tc002 Completed");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertTrue(true);
		System.out.println("tc003 Completed");
	}
	
	
	
	

}
