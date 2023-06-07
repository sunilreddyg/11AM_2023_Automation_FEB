package framework.testng.listners;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class CreateReport implements IReporter
{

	public void generateReport​(java.util.List<XmlSuite> xmlSuites, java.util.List<ISuite> suites, java.lang.String outputDirectory)
	{
		System.out.println("Created Advanced report");
	}
	
	
}
