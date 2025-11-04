import java.util.*;
//tusharx0809
//Problem 546A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int fbprice = sc.nextInt();
        int dollars = sc.nextInt();
        int bananas = sc.nextInt();
        
        int totalPrice = 0;
        for(int i=1; i<=bananas; i++){
            totalPrice += (i * fbprice);
        }
        
        System.out.println((totalPrice - dollars > 0) ? totalPrice-dollars : 0);
    }
}
