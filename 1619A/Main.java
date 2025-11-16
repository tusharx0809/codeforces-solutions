import java.util.*;
//tusharx0809
//Problem 1619A
public class Main {
    public static String check(String s){
        if(s.length() % 2 == 0){
                String part1 = "";
                String part2 = "";
                
                for(int i=0; i<s.length() / 2; i++){
                    part1 += s.charAt(i);
                }
                for(int i=s.length() / 2; i<s.length(); i++){
                    part2 += s.charAt(i);
                }
                for(int i=0; i<part1.length(); i++){
                    if(part1.charAt(i) != part2.charAt(i)){
                        return "NO";
                    }
                }
            }else{
                return "NO";
            }
            return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t != 0){
            String s = sc.next();
            String result = check(s);
            System.out.println(result);
            t--;
        }
    }
}