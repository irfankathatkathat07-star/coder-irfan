package lec4;

public class trianglestar {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        while(row <=n){
            int col = 1;
            while (col <=row){
            
                System.out.print("*");
            col++;
            }
            System.out.println();
            row++;
        }
        space--;
    }
}
