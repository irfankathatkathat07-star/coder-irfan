package lec3;

public class star1 {
    public static void main(String[] args) {
        int row =1;
        int n = 5;
        int star = 1;
        while(row<=n){
            int i = 1;
        //star
        while(i<=star){
        System.out.print("*");
        i++;
        }
    //nextline
     star++;
     row++;
     System.out.println();
    }
}
}