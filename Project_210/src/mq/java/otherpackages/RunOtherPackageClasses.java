package otherpackages;

import mq.java.methods.Book;
import mq.java.methods.RobotX;

public class RunOtherPackageClasses
{
    public static void main(String[] args)
    {
        
    	RobotX obj=new RobotX();
    	obj.Turnon();
    	obj.Walk();
    	obj.Sleep();
    	
    	Book ref=new Book();
    	ref.author();
    	ref.details();
    	
    }
}

