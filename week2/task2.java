package week2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
         * 1. Write a program to check whether a person can cast a vote or not.
         * The condition is you must be over 18 years old to vote.
         */
        
        Scanner scan=new Scanner(System.in);
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        /* 2. Write a program to calculate SI. */
        int time = 5;
        float rate = 6;
        float principleamount = 400;
        float FormulaofSI = (principleamount * time * rate) / 100;
        System.out.print("The Si is:" + FormulaofSI);
        /* 3.Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;*/
        /*for cuboid:*/
        System.out.println("Enter the length of cuboid:");
        int l=scan.nextInt();

        System.out.println("Enter width of the cuboid:");
        int w=scan.nextInt();

        System.out.println("Enter height of the cuboid:");
        int h=scan.nextInt();

        System.out.println("The area of cuboid is: "+ l*w*h);

        /*for cube:*/
        
        System.out.println("enter the length:");
        int length=scan.nextInt();
        
        System.out.println("The area of cube is "+l*l*l);

            //for triangle:
        
        System.out.println("enter the base of triangle: ");
        double b=scan.nextDouble();
        System.out.println("Enter the height of triangle: ");
        double  height=scan.nextDouble();

        System.out.println("The area of triangle is "+ 0.5*b*h);
        /*4. Write the ternary operator for question no. 1 */
        System.out.println("Enter your age: ");
        int ages=scan.nextInt();

        String output=ages>18 ? "you are able to voting" : "you are not able to voting";
        System.out.println(output);
        /*5. Write a program to take two integer inputs from the user and print the sum and product of them */
        System.out.println("Enter first number: ");
        int first=scan.nextInt();
        System.out.println("Enter second number: ");
        int second=scan.nextInt();

            // //sum:
        System.out.println("The sum of two numbers is " +(first+second));
        System.out.println("The product of two number is "+ first*second);
        /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of 
        two. Finally, calculate the division of the thus obtained sum and product and print the result. */
        
        System.out.println("Enter first number: ");
        int firstNum=scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNum=scan.nextInt();

        double sum2=(firstNum+secondNum);
        double prod2=(firstNum*secondNum);

        System.out.println("the sum of two number is:"+ (sum2));
        System.out.println("the product of two number is : "+(prod2));

        double division=(sum2/prod2);
        System.out.println("The division of obtained sum and product is:"+ division);
        /*7. Take the name, roll number, and field of interest from the user and print in the format below:
         Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
         System.out.println("Enter your name:");
        String name=scan.nextLine();
        System.out.println("Enter your roll number:");
        int rollNo=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest=scan.nextLine();

        System.out.printf("Hey, my name is %s and my roll number is %d.",name,rollNo);
        System.out.printf("My field of interes are %s",interest);
        /*8. Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        // for area and perimeter of square--->>

        System.out.println("Enter the side of Square:");
        double side=scan.nextDouble();
        System.out.println("The area of the Square is:"+ (side*side));

        System.out.println("The perimeter of the square is:"+(4*side));

            // for simple interest--->
            
        System.out.println("Enter the principle:");
        int p=scan.nextInt();
        System.out.println("Enter the time:");
        double t=scan.nextDouble();
        System.out.println("Enter the rate:");
        double r=scan.nextDouble();

        System.out.println("The Simple Interest is:"+(p*t*r/100));

            ////for triangle:
        
        System.out.println("enter the base of triangle: ");
        double base=scan.nextDouble();
        System.out.println("Enter the height of triangle: ");
        double heigth=scan.nextDouble();

        System.out.println("The area of triangle is "+ 0.5*b*h);

           //for cuboid:
        System.out.println("Enter the length of cuboid:");
        int lenght=scan.nextInt();

        System.out.println("Enter width of the cuboid:");
        int width=scan.nextInt();

        System.out.println("Enter height of the cuboid:");
        int heigt=scan.nextInt();

        System.out.println("The area of cuboid is: "+ l*w*h);

           //     for cube:
            
        System.out.println("enter the length:");
        int lengh=scan.nextInt();
            
        System.out.println("The area of cube is "+l*l*l);
        /* 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.*/
        System.out.println("Enter the length of rectangle:");
        int l1=scan.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int b1=scan.nextInt();

        int area=(l1*b1);
        System.out.println("The area of rectangle is "+ area);
        /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */
        System.out.println("Enter your marks for subject one:");
        double one=scan.nextDouble();
        System.out.println("Enter marks for second subject:");
        double two=scan.nextDouble();
        System.out.println("Enter marks for third subject:");
        double three=scan.nextDouble();
        System.out.println("Enter marks for fourth subject:");
        double four=scan.nextDouble();

        double perc=((one+two+three+four)/4);
        String result=(perc>=70) ?"First Class":
        (perc>59) ? "Upper Second Class":
        (perc>49) ?"Second Class":
        (perc>39)?"third Class": "fail";

        System.out.println(result);
           
    }
    }
