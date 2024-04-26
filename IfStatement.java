public class IfStatement {
    /**
     * @param args
     */
    public static void main(String [] args){
        /*Simple if statement,takes condition/expression with boolean value */
        if(true){
            System.out.println("True statement");
        }
        if (false){
            System.out.println("Skipped statement");
        }else{
            System.out.println("False satatment");
        }
        /*If condition fails, goes to else block/scope */
        int num1 =10, num2 =20;
        if(num1>num2){
           System.out.println("Num1 is greater");
        }else{
           System.out.println("Num2 is greater");
        }
        /*if else if */
        int iNum1 =10, iNum2 =10;
        if (iNum1 == iNum2){
            System.out.println("Equal number");
        }else if(iNum1>iNum2){
            System.out.println("iNum1 is greater");
        }else{
            System.out.println("iNum2 is greater");
        }
        /*Note that else should be at least of the if satement */
        /*If Else If ladder, more that one else if */
        if(iNum1<0){
            System.out.println("iNum1 is negative");
        }else if(iNum2<0){
            System.out.println("iNum2 is negative");
        }else if(iNum1 == iNum2){
            System.out.println("Equal number");
        }else if(iNum1 < iNum2){
            System.out.println("iNum1 is less");
        }else{
            System.out.println("Defult execution if all fails");
        }
        /*Note that else is not mandatory and can be skipped */
        /*Nested if satement */
        int nNum1 =-10, nNum2 = 20;
        if (nNum1< 0){
            System.out.println("nNum1 is negative and greater");
        }else{
            if(nNum1 > nNum2){
                System.out.println("nNum1 is greater and positive");
            }else{
                System.out.println("nNum1 is positive and lesser");
            }
        }


/*task
 * Given the value below, add the total and take the average
 * if any of the marking is less then 35, print"Fail"
 * if average is less than 60, print "3rd div",
 * if average is less than 70,print"2nd div"
 * if average is less than 80,print"1st div"
 *if average is greater than or equal to 80,print"distintion"
*/
   int math = 38, science =60, english = 35;
   int total =math+science+english;
   /*make total variable and average variable */
   float average =(math+science+english)/3;
   if (average <35){
     System.out.println("Fail");
   }else if (average<=60){
      System.out.println("3rd div");
   }else if (average<=70){
     System.out.println("2nd div");
   }else if (average<=80){
     System.out.println("1st div");
   }else if(average>=80){
     System.out.println("distintion");
    }

}
}