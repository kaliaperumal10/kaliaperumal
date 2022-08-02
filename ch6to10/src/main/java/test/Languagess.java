package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Languagess {

	public static void main(String[] args) throws IOException{  
		File source = new File("InputFile.txt");
		File dest   = new File("abcd.txt");

		try{
			FileInputStream fis = new FileInputStream(source);

			FileOutputStream fos = new FileOutputStream(dest); 

			byte[] buffer = new byte[1024];
			int length;

			while ((length = fis.read(buffer)) > 0) {

				fos.write(buffer, 0, length);
		}
			System.out.println(fis);
			System.out.println(fos);
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
}