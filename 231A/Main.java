import java.util.Scanner;
//tusharx0809
//Problem 231A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int count = 0;
        while(testCases != 0){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if((p == 1 && v == 1) || (p == 1 && t == 1) || (v == 1 && t == 1)){
                count++;
            }
            testCases--;
        }
        System.out.println(count);
    } 
}
