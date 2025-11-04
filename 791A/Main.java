import java.util.*;
//tusharx0809
//Problem 791A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lw = sc.nextInt();
        int bw = sc.nextInt();
        int years = 0;
        while(lw <= bw){
            lw = lw * 3;
            bw = bw * 2;
            years++;
        }
        
        System.out.println(years);
    }
}
