import java.util.*;
public class condition {
    public static void ageCheck(int i){
        if (i>=18) {
            System.out.println("Adult");
        } else {
            System.out.println("teen");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ageCheck(i);
    }
}
