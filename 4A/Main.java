import java.util.*;
//tusharx0809
//Problem 4A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(n == 2){
            System.out.println("NO");
        }else{
            System.out.println(n % 2 == 0 ? "YES" : "NO");
        }

        
    }
}