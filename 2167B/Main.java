import java.util.*;
//tusharx0809
//Problem 2167B
public class Main {
    public static boolean checkNames(String s, String t){
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            if (checkNames(s, t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
