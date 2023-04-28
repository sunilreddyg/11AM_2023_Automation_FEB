package switchCommands.windows;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindwoReusable_Methods 
{
	public WebDriver driver;
	private Map<String, Object> vars;


	public String waitForWindow(int timeout) {
	    try {
	      Thread.sleep(timeout);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    vars = new HashMap<String, Object>();
	    
	    Set<String> whNow = driver.getWindowHandles();
	    Set<String> whThen = (Set<String>) vars.get("window_handles");
	    if (whNow.size() > whThen.size()) {
	      whNow.removeAll(whThen);
	    }
	    return whNow.iterator().next();
	  }


}
