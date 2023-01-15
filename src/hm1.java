import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("do you need a credit card>??");
            String answer= scanner.next();
            if (answer.equalsIgnoreCase("yes")){
                break;
            }

        }
    }
}
