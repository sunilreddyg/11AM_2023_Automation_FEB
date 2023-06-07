package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class Read_Data_ProviderData
{
	
	
	@Test(dataProvider="productinfo",dataProviderClass=InputData.class)
	public void ProductStatus(String phonename,double price,boolean status,int num)
	{
		System.out.println(phonename+"   "+price+"     "+status+"   "+num);
	}

}
