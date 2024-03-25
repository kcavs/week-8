import java.util.*;
public class OddSum {
    public static void main(String[]args){
        int num;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a integer: ");
        num= input.nextInt();
        for(int goes=num;num>0;goes--){
            int test=num%2;
            if(test==1){
                System.out.print(num+" ");
            }
            num-=1;
        }
    }
}
