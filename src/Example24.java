import java.util.Scanner;
public class Example24 {
    public static void main(String[] argv) {
        int x;
        long factorial = 1;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number:");
        x = inputValue.nextInt();

        for (int i = 1; i <= x; i++) {
            factorial*= i;
        }
        System.out.println("The factorial of number: "+x+" is: " +factorial);
    }
}
