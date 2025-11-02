import java.util.*;
//tusharx0809
//Problem 71A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> strs = new ArrayList<String>();

        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases != 0){
            String str = sc.nextLine();
            strs.add(str);
            testCases--;
        }

        for(String str: strs){
            if(str.length() > 10){
                System.out.println("" + str.charAt(0) + (str.length()-2) + str.charAt(str.length()-1));
            }else{
                System.out.println(str);
            }
        }
    }
}