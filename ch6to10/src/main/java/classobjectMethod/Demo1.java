package classobjectMethod;
import java.io.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Demo1 {
	static Logger logger=Logger.getLogger(Demo1.class);	
	public static void main(String[] args) {
	
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Student obj=new Student();
		obj.fifth(8.5f);
		obj.array(new int[] {1,2,3});
		int z=obj.add(10 ,20);
		
		logger.info(z);
		}}
class Student{
	
	static Logger logger=Logger.getLogger(Student.class);	
	void fifth(float average )
	{
		logger.info(average);
		int Rollno=8;
		String Name="yoga"; 
		logger.info("the id is "+ Rollno);
		logger.info("Name of Student"+ Name);
	}
	void array(int a[])
	{
		for(int r:a)
		{
		logger.info("Array :" +r);
		}
	}
	int add(int i ,int j)
	{
		int z=i+j;
		return z;
	}
	
}

