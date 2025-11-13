import java.util.*;
//tusharx0809
//Problem 977A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        while(k != 0){
            int lastDigit = num % 10;
            if(lastDigit != 0){
                num -= 1;
            }else{
                num = num / 10;
            }
            k--;
        }
        System.out.println(num);
    }
}
