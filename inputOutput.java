import java.util.Scanner;

public class inputOutput {
    static void numberPrinting() { 
        Scanner numbers = new Scanner(System.in); 
        System.out.println("Enter a number and the previous numbers will be printed");
        int number = numbers.nextInt(); 

        for (int i = number - 1; i >= 0; i--) { 
            System.out.println(i);  
        }
        numbers.close(); 
    }

    public static void main(String[] args) { 
        numberPrinting();         
    }
   
}

