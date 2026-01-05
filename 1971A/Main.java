import java.util.*;
//tusharx0809
//Problem 1971A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc != 0){
            ArrayList<Integer> nums = new ArrayList<>();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num1 < num2){
                System.out.println(num1 + " " + num2);
            }else{
                System.out.println(num2 + " " + num1);
            }
            tc--;
        }
    }
}
