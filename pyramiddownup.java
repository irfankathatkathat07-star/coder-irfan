package lec6;

public class pyramiddownup {
    public static void main(String[] args) {
        int row = 1;
        int star = 0;
        int space = 4;
        int n = 5;
       
        while (row<n*2-1){
            int i=1;
            while(i<=space){
            System.out.print("  ");
                i++;

            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(row<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
        
        row++;
        System.out.println();
            
        }
    }
}
