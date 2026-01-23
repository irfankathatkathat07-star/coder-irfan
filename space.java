package lec3;

public class space {
    public static void main(String[] args) {
        
        int row = 1;
        int n = 1;
        int star = 5;
        int space  =  1;

        while(star<=n){
            int i  = 1;

            while(i<=star){
                System.out.println();
            }
            space++;
            star--;
            row++;
            System.out.println();
        }
    }
}
