package lec3;

public class star {
    public static void main(String[] args) {
        int row = 1;
        int n = 5;
        int star = n;

        while(row<=n){
            int i=1;
            while(i<=star){

            System.out.print("*");
            i++;
        }
        System.out.println();
        row++;
    }
}
}