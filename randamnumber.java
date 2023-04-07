import java.util.Scanner;
public class randamnumber{
    public static void main(String[]args) {
        int min=200;
        int max=400;
        // generate random value from 200 to 400
        System.out.println(" random value type of double "+min+ " to "+max+ ":");
        float a=(float)Math.random()*(max-min+1)+min;
        System.out.println(a);
        // generate random int value from 200 to 400
        System.out.println("Random value of type between " +min+ " to " +max+ " : ");
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);

    }




}
