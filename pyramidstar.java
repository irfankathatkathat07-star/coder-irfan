package lec5;

public class pyramidstar {
      public static void main(String[] args) {
        int n =5;
        int star=1;
        int row =1;
       int space= 4;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            space--;
            star+=2;
            row++;
            System.out.println();



        }

     }
}

