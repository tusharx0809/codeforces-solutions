import java.util.*;
//tusharx0809
//Problem 41A
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String strRev = sc.nextLine();

        if(str.length() != strRev.length()){
            System.out.println("NO");
        }else{
            String makeStrRev = "";

            for(int i=str.length()-1; i>=0; i--){
                makeStrRev += str.charAt(i);
            }

            if(makeStrRev.equals(strRev)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
