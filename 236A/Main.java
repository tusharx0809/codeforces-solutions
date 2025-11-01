import java.util.*;
//tusharx0809
//Problem 236A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        HashSet<Character> mySet = new HashSet<Character>();

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            mySet.add(c);
        }

        System.out.println((mySet.size() % 2 == 1) ? "IGNORE HIM!" : "CHAT WITH HER!");
    }
}