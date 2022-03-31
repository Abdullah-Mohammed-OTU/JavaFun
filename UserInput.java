import java.util.Scanner;

public class UserInput { 
    UserInput() { 
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Print a number to add: ");
        int number = myObj.nextInt(); 

        System.out.println("The number is " + number) ;
        myObj.close(); 
    }
}
class Something { 

}