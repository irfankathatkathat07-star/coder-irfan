package lec5;

public class circlestar {
    public static void main(String[] args) {
        int n =5;
        int star =n;
        int row =1;

        while(row<=n){
            int i =1;
        
            while(i<=star){
                if((row==1 && i==3) || (row==2 && (i==2 || i==4)) || (row==3) || (row==4 && (i==2 || i==2)) || (row==5 && i==)){
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
