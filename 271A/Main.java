import java.util.*;
//tusharx0809
//Problem 271A
public class Main {
    public static boolean check(int year) {
        String yearStr = "" + year;
        Set<Character> digits = new HashSet<>();
        for (int i = 0; i < yearStr.length(); i++) {
            char c = yearStr.charAt(i);
            if (digits.contains(c)) {
                return false;
            }
            digits.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year++;
        while (!check(year)) {
            year++;
        }
        System.out.println(year);
    }
}
