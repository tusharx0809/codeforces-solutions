import java.util.*;
//tusharx0809
//Problem 214A
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        for(int a=0; a<=n; a++){
            for(int b=0; b<=m; b++){
                if(a*a + b == n && a + b*b == m){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
