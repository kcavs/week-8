import java.util.*;
public class Factorial{
    public static void main(String[]args){
        int num;
        int prod=1;
        Scanner input= new Scanner(System.in);
        System.out.print("enter a integer: ");
        num=input.nextInt();
        for (int goes=num;num>0;goes++){
            prod*=num;
            num-=1;
        }
        System.out.print("the product of the digits is: "+prod);
    }
}