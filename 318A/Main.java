import java.util.*;
//tusharx0809
//Problem 318A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                nums.add(i);
            }
        }
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                nums.add(i);
            }
        }
        System.out.println(nums.get(k-1));
    }
}
