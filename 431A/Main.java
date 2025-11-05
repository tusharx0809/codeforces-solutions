import java.util.*;
//tusharx0809
//Problem 431A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<4; i++){
            int input = sc.nextInt();
            a.add(input);
        }
        sc.nextLine();
        String seconds = sc.nextLine();
        int calories = 0;
        for(int i=0; i<seconds.length(); i++){
            int num = seconds.charAt(i) - '0';
            calories += a.get(num-1);
        }
        System.out.println(calories);
    }
}
