import java.util.*;
//tusharx0809
//Problem 282A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int testCases = sc.nextInt();
        sc.nextLine();

        ArrayList<String> strs = new ArrayList<String>();

        while(testCases != 0){
            String str = sc.nextLine();
            strs.add(str);
            testCases--;
        }

        for(String str: strs){
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '+'){
                    result++;
                    break;
                }
                if(str.charAt(i) == '-'){
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}