import java.util.Scanner;
// or
// import java.util.*;//import all the utils
public class InputOutput{
    public static void main(String[] args){
    /*Print/output a line with line break
        * use "sout"shortcut
        */
        System.out.println("This prints and breaks line");
        /*Print the world without line break */
        System.out.print("This will not break line");
        System.out.print("This line will continue\n");

        /*Output formating 
        * System.out.printf();
        *%s String, %f floating point, %d integral ,%b boolean
        *This will not break line TimeoutError
        */
        System.out.printf("The next word is %s", "New word");
        System.out.printf("The next int is %d",10);
        /*You can use multiple formatter */
        System.out.printf("Multiple %f %b",10.9f,false);
        /*User Input using Scanner
        *first import  the Scanner class
        *import java.util.Scanner;//at the top of the file
        */
        Scanner scan = new Scanner(System.in);//System.in is used as input 
        System.out.println("The following takes one word from sentence");
        String outWord =scan.next();
        System.out.println(outWord);
        System.out.println("The following takes whole sentence");
        String wholeSentence = scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("The following takes int");
        int intInput = scan.nextInt();
        System.out.println(intInput);
        System.out.println("The following takes bollean");
        boolean booleanInput= scan.nextBoolean();
        System.out.print(booleanInput);
        scan.close();
        
    
        Scanner scan1 = new Scanner(System.in);
        System.out.println(  "what is your name?");
        String name =scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("How many siblings do you have?");
        int sibling =scan1.nextInt();
        System.out.println("Hello,"+name);
        System.out.println("Over 18? "+ name);
        System.out.printf("You have %d number of siblings\n", sibling);
        scan1.close();    
        
        
    }
}