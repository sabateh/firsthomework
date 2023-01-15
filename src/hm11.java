import java.awt.*;
import java.util.Scanner;

public class hm11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <11 ; i++) {
            System.out.println("need credit card?");
            String answer=scanner.next();
            if(answer.equalsIgnoreCase("yes")){
                break;
            }


        }
    }
}
