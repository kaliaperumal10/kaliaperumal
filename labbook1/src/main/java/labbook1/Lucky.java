package labbook1;
import java.util.Scanner;
import java.util.Random;

class Lucky
{
    public static void main(String[] args) 
    {
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=1; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
    }
}