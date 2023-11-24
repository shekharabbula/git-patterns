import java.util.Scanner;

public class evenodd {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=a.nextInt();
        

        if((num1/2)*2==(num1)){
            System.out.println("this is even number : "+num1);
        }
        else{
            System.out.println("this is odd number : " +num1);
        }

    }
    
}
