public class PrefixPostfix{
    public static void main (String[] args){
        /*Prefix,operator on  the left side */
        int prefixValue =10;
        System.out.println("Prefix remains same "+ ++prefixValue);
        System.out.println("Prefix remains same"+ prefixValue);

        /*Postfix operetor on the right side */
        int postFixValue =20;
        System.out.println("Postfix value doesnot change here"+postFixValue++)
        System.out.println("It changes in next line"+postFixValue);
    }
}
