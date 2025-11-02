import java.util.*;
//tusharx0809
//Problem 47A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int sum = (i * (i+1)) / 2;
            if(sum == n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}