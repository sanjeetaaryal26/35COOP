package week3;
import java.util.Scanner;

public class task3 {
    public static void main(String [] args){
        Scanner scan=new Scanner (System.in);
        //1. Write a JAVA program to find the maximum between three numbers.

        System.out.println("Enter first number:");
        double firstNum=scan.nextDouble();
        System.out.println("Enter second number:");
        double secondNum=scan.nextDouble();
        System.out.println("Enter third number:");
        double thirdNum=scan.nextDouble();

        if (firstNum>secondNum && secondNum>thirdNum){
        System.out.println(firstNum+"is greater");
        }else if (secondNum>thirdNum && thirdNum>firstNum){
        System.out.println(secondNum+"is greater");
        }else {
        System.out.println(thirdNum+"is greater");
        }

        //2. Write a JAVA program to check whether a number is negative, positive, or zero.
        System.out.println("Enter a number:");
        double numb=scan.nextDouble();
        if (numb>0){
        System.out.println(numb+"is positive number");
        }
        else if (numb<0){
        System.out.println(numb+"is negative number");
        }
        else{
        System.out.println(numb +"is zero");
        }

        //3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        System.out.println("Enter a number");
        int numb1=scan.nextInt();
        if (numb1%5==0 && numb1%11==0){
        System.out.println(numb1+" is divisible by 5 and 11");
        }else{
        System.out.println(numb1+" is not divisible by 5 and 11");
        }

        //4. Write a JAVA program to check whether a number is even or odd.
        System.out.println("Enter a number:");
        int numb2=scan.nextInt();
        if (numb2%2==0){
        System.out.println(numb2+" is even number");

        }else{
        System.out.println(numb2+ " is odd number");
        }
        

        //5. Write a JAVA program to check whether a year is a leap year or not. 
        
        System.out.println("Enter a year :");
        int y=scan.nextInt();
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
        System.out.println(y + " is a leap year");
        }
        else{
        System.out.println(y + " is not a leap year");
        }
        



        /*6. Write a JAVA program to input any alphabet 
        and check whether it is vowel or consonant. */

        Scanner cw = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = cw.next().charAt(0);
        
        // Convert the alphabet to lowercase for easier comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the entered character is a vowel or a consonant
        if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println(ch + " is a vowel.");
        } else {
        System.out.println(ch + " is a consonant.");
        }
        } else {
        System.out.println("Invalid input. Please enter an alphabet.");
        }
        
        cw.close();
         //switch case statement questions-->

        /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value. Use a switch case statement to 
        handle different grades.*/
        Scanner result = new Scanner(System.in);
        System.out.print("Enter student's grade (A, B, C, D, or F): ");
        char grade = result.next().toUpperCase().charAt(0);
        
        double gpa;
        
        switch (grade) {
        case 'A':
        gpa = 4.0;
         break;
        case 'B':
        gpa = 3.0;
         break;
        case 'C':
        gpa = 2.0;
         break;
        case 'D':
        gpa = 1.0;
         break;
        case 'F':
        gpa = 0.0;
         break;
        default:
        System.out.println("Invalid grade entered.");
        return; // Exit the program if an invalid grade is entered
        }
        
        System.out.println("Equivalent GPA: " + gpa);
        
        result.close();



        /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as 
        inputs and performs the corresponding arithmetic operation using a switch case statement.*/
        Scanner op = new Scanner(System.in);
        
        //Input first number
        System.out.print("Enter the first number: ");
        double num1 = op.nextDouble();
        
        // // Input operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = op.next().charAt(0);
        
        // // Input second number
        System.out.print("Enter the second number: ");
        double num2 = op.nextDouble();
        double result;
           
        // Perform arithmetic operation based on the operator
        switch(operator) {
        case '+':
         result = num1 + num2;
               break;
        case '-':
          result = num1 - num2;
              break;
         case '*':
         result = num1 * num2;
             break;
        case '/':
        if (num2 != 0) {
         result = num1 / num2;
        } else {
        System.out.println("Error: Division by zero.");
        return; // Exit the program if division by zero is attempted
        }
             break;
        default:
        System.out.println("Invalid operator entered.");
        return; // Exit the program if an invalid operator is entered
        }
        
        System.out.println("Result: " + result);
        
        op.close();


        /*3. Write a Java program that takes an integer input (1 to 12) representing a month and 
        prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        Scanner ritu = new Scanner(System.in);
        System.out.print("Enter a month (1 to 12): ");
        int month = ritu.nextInt();
        
        String season;
        switch (month) {
        case 1:
        case 2:
        case 3:
          season = "Winter";
          break;
        case 4:
        case 5:
        case 6:
        season = "Spring";
           break;
        case 7:
        case 8:
        case 9:
        season = "Summer";
        break;
        case 10:
        case 11:
        case 12:
         season = "Fall";
         break;
        default:
         season = "Invalid month";
        }
        
        System.out.println("The season for month " + month + " is: " + season);

        ritu.close();

        /*4. Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle)
         based on the user's choice using a switch case. */
        Scanner geometry = new Scanner(System.in);
        System.out.println("Shape Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = geometry.nextInt();

        double area = 0;

        switch (choice) {
        case 1: // Circle
          System.out.print("Enter the radius of the circle: ");
          double radius = geometry.nextDouble();
          area = Math.PI * radius * radius;
             break;
        case 2: // Rectangle
          System.out.print("Enter the length of the rectangle: ");
          double length = geometry.nextDouble();
          System.out.print("Enter the width of the rectangle: ");
          double width = geometry.nextDouble();
          area = length * width;
             break;
        case 3: // Square
          System.out.print("Enter the side length of the square: ");
          double side = geometry.nextDouble();
          area = side * side;
             break;
        case 4: // Triangle
          System.out.print("Enter the base length of the triangle: ");
         double base = geometry.nextDouble();
         System.out.print("Enter the height of the triangle: ");
          double height = geometry.nextDouble();
          area = 0.5 * base * height;
              break;
        default:
        System.out.println("Invalid choice!");
        }

        System.out.println("The area of the shape is: " + area);

        geometry.close();

    }


    


    
}
