import java.util.*;
//tusharx0809
//Problem 339A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '+'){
                nums.add(str.charAt(i) - '0');
            }
        }
        
        Collections.sort(nums);
        
        String result = "";
        
        for(int num: nums){
            result += Integer.toString(num) + '+';
        }
        result = result.substring(0, result.length()-1);
        System.out.println(result);
    }
}
