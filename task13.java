import java.util.Scanner;
import java.util.regex.Pattern;

public class task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int counter = 0;
        String[] ar = str.split(" ");
        for(String a : ar){
            if(Pattern.matches("[a-zA-Z]+",a)){
                counter++;
                System.out.print(a+" ");
            }
        }
        System.out.println("\n"+counter+" слова состоит из латиницы");
    }
}
