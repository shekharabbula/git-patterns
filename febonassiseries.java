import java.util.Scanner;



public class febonassiseries {
    public static void main(String args[]){
        Scanner aa =new Scanner(System.in);
        int x=aa.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=x){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            System.out.println(b);
        }
        
    }
    
}
