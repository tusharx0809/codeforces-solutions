import java.util.*;
//tusharx0809
//Problem 228A
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        HashSet<Integer> mySet = new HashSet<Integer>();

        mySet.add(a);
        mySet.add(b);
        mySet.add(c);
        mySet.add(d);
        
        System.out.println(4 - mySet.size());
    }
}
