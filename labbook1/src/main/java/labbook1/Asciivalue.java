package labbook1;

public class Asciivalue {

	public static void main(String[] args) {
		char ch = 'k'; 
        int as = ch; 
        // You can also cast char to int 
        int castAsci = (int) ch; 
        System.out.println("The ASCII value of " + ch + " is: " + as); 
        System.out.println("The ASCII value of " + ch + " is: " + castAsci);
	}

}
