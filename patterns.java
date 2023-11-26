public class patterns {
    public static void main(String args[]){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(4);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);

    }
    
    

    static void pattern1(int n){
        for (int row=0;row<n;row++){
            for (int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("completed pattern1");
    }




    static void pattern2(int n){
        for (int row=1;row<=n;row++){
            for (int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("completed pattern2");
    }


    static void pattern3(int n){
        for (int row=1;row<=2*n-1;row++){
            int logic1=row>5?(2*n-row):row;
            for (int col=0;col<logic1;col++){
                System.out.print("* ");
            }
            System.out.println();
        
        }
        System.out.println("completed pattern 3");//by own 

    } 
    
    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            int spaces=n-row;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col+"");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+"");
            }
            System.out.println();
        }
        System.out.println("completed pattern 4");

    }


    static void pattern5(int n){
        for (int row=1;row<=2*n;row++){
            int spaces=row>n?2*n-row:row;
            for(int s=0;s<=n-spaces;s++){
                System.out.print(" ");
            }
            for (int col=spaces;col>=1;col--){
                System.out.print(col+"");
            }
            for (int col=2;col<=spaces;col++){
                System.out.print(col+"");
            }
            
            System.out.println();
        }
        System.out.println("completed pattern 5");

    }




    static void pattern6(int n){
        for (int row=1;row<2*n-1;row++){
            int spaces=row>n?2*n-row:row;
            int noofspaces=n-spaces;
            for (int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }
            for (int col=0;col<spaces;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("completed pattern 6");
    }

    static void pattern7(int n){
        for (int row=1;row<=n;row++){
            for (int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for (int col=0;col<row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("pyramid and completed the pattern 7");



    }

    static void pattern8(int n){
        for (int row=1;row<=n;row++){
            for (int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();


        }
        System.out.println("downword triangle");

    }

    static void pattern9(int n){
    
        for (int row=1;row<=n;row++){
            
            
            for (int space=1;space<row;space++){
                System.out.print(" ");
            }
            for (int col=0;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println();
            


        }
        System.out.println("reverce for above triangle");
        

    }




   
}
