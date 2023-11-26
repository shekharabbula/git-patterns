public class patterns2 {
    public static void main(String args[]){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5,1);
        pattern7(5);
        pattern8(5);
        pattern9(5);
      

    }
    static void pattern1(int n){
        for (int row=1;row<=2*n-1;row++){
            int down=n>=row?row:2*n-row;
            for (int col=1;col<=down;col++){
                System.out.print(col+" ");
            }
            System.out.println();

        }
        System.out.println("pattern1 complete");

    }

    static void pattern2(int n){
        for (int row=0;row<=2*n-1;row++){
            int down=n>=row?row:2*n-row;
            for (int col=1;col<=down;col++){
                System.out.print(row+" ");
            }
            System.out.println();

        }
        System.out.println("pattern2 complete");

    }


    static void pattern3(int n){
        for (int row =1;row<=2*n-1;row++){
            int down1=n>=row?n-row:row-n;
            for (int spaces=0;spaces<down1;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                if (row==1||col==1||row==n||col==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }System.out.println("hallow patteren progeam completed");
    }



    static void pattern5(int n){
        for (int row=1;row<=n;row++){
            for (int col=0;col<row;col++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    static void pattern6(int n,int number){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println("print numbers from 1 to 15 pattern");

    }



    static void pattern7(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                int sum=row+col;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@  1,0 program completed");
        
    }

    static void pattern8(int n){
        for (int row=1;row<=n;row++){
            for (int col=n;col>=row;col--){
                System.out.print(col+" ");

            }
            System.out.println();
        }
        System.out.println("reverce triangle with numbers ");

    }
    static void pattern9(int n){
        for (int row=1;row<=n;row++){
            for (int col=n;col>n-row;col--){
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }


}

