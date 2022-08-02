package file_demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class File_demo1 
{

	public static void main(String[] args) 
	{
		Logger logger=Logger.getLogger(File_demo1.class);
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
		try (FileInputStream fis=new FileInputStream("applog.txt");)
		{
						
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
	//		System.out.println(fis.read());
		//	System.out.println(fis.read());
//
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println(fis.read());

//			int available=fis.available();
//			byte b[]=new byte[8];
//			
//			fis.read(b);
//			System.out.println(fis.available());
//			String s=new String(b,0,available);
//			System.out.println(s); 
//

			byte b[]=new byte[4];
			int saktthi=0;
			while((saktthi=fis.read(b))!=-1) 
			{
				System.out.println(saktthi);
				String s=new String(b,0,saktthi);
				System.out.println(s);
			}	

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
