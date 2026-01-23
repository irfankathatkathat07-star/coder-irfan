package lec5;

public class crossspace {
    public static void main(String[] args) {
        int n =5;
        int star =n;
        int row =1;

        while(row<=n){
            int i =1;
        
            while(i<=star){
                if(row==i || i+row-1 == n){
                System.out.print("* ");

            }else{
                System.out.print("  ");
            }
            i++;

        }
        row++;
        System.out.println();
    

    }
}
}