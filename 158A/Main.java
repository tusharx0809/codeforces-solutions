import java.util.*;
//tusharx0809
//Problem 158A
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int contestants = sc.nextInt();
        int kthplace = sc.nextInt();

        ArrayList<Integer> scores = new ArrayList<Integer>();

        while(contestants != 0){
            int score = sc.nextInt();
            scores.add(score);
            contestants--;
        }

        int kthplacescore = scores.get(kthplace-1);
        int result = 0;

        for(int score: scores){
            if(score > 0 && score >= kthplacescore){
                result++;
            }
        }

        System.out.println(result);
    }
}