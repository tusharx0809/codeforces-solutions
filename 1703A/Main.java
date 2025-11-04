import java.util.*;
//tusharx0809
//Problem 1703A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<String>();
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++){
            String str = sc.nextLine();
            strs.add(str);
        }
        
        for(String str: strs){
            if(str.equalsIgnoreCase("YES")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
}
