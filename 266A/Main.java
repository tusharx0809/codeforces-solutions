import java.util.*;
//tusharx0809
//Problem 266A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stonesCount = sc.nextInt();
        String stones = "";
        while(stones.length() != stonesCount){
            stones += sc.nextLine();
        }
        
        int count = 0;
        for(int i=0; i<stones.length()-1; i++){
            if(stones.charAt(i) == stones.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
