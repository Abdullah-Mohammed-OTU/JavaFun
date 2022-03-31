import java.util.Scanner;
import java.lang.Math;

public class Class_practice {
    public static void Rectangle_Area() {
        int x, y;  
        Scanner number = new Scanner(System.in); 
        System.out.println("Enter the length of the rectangle: ");
        x = number.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        y = number.nextInt(); 
        
        int area = x * y;

        System.out.println("The area of the rectangle is: " + area);
       
        number.close();
    }

    public static void Rectangle_Perimeter() {
        int x, y;  
        Scanner number = new Scanner(System.in); 
        System.out.println("Enter the length of the rectangle: ");
        x = number.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        y = number.nextInt(); 
        
        int perimeter = 2*x + 2*y;

        System.out.println("The area of the rectangle is: " + perimeter);
       
        number.close();
    }

    public static void Circle_Area() {
        double radius, area; 
        Scanner number = new Scanner(System.in); 
        System.out.println("Enter the radius of the circle: ");
        radius = number.nextDouble();  

        area = Math.PI * Math.pow(radius, 2);
        
        int area1 = (int)Math.round(area);  
        
        System.out.println("The area of the circle is: " + area1);
        
        number.close(); 
    } 

    public static void Circle_Perimeter() {
        double radius; 
        Scanner number = new Scanner(System.in); 
        System.out.println("Enter the radius of the circle: ");
        radius = number.nextDouble();  

        double perimeter = 2 * Math.PI * radius; 

        int finalPerimeter = (int)Math.round(perimeter); 
        
        System.out.println("The area of the circle is: " + finalPerimeter);
        
        number.close(); 
    } 

    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in); 
        System.out.println("Would you like to get perimeter or area(case sensitive): ");
        String perimeter = answer.nextLine(); 

        if (perimeter.equals("perimeter")) { 
            System.out.println("Would you like to get the perimeter of a rectangle or circle(case sensitive): ");
            String RecorCircle = answer.nextLine();
            if (RecorCircle.equals("circle")) { 
                Circle_Perimeter();
            } 
            else if (RecorCircle.equals("rectangle")) { 
                Rectangle_Perimeter(); 
            }
        }
        else if (perimeter.equals("Area")) { 
            System.out.println("Would you like to get the area of a circle or a rectangle(case sensitive): ");
            String area = answer.nextLine();  

            if (area.equals("circle") || area.equals("Circle")  || area.equals("CIRCLE")) { 
                Circle_Area(); 
            } 
            else if (area.equals("Rectangle") || area.equals("rectangle") || area.equals("RECTANGLE")) { 
                Rectangle_Area();
            }
        }
        answer.close();
    }   
}