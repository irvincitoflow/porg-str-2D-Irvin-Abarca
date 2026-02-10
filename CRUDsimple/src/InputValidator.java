import java.util.Scanner;

public class InputValidator {

    public int getIntNumber(Scanner sc,String msg) {
        while (true){
            try {
                return sc.nextInt();
            }catch (Exception e){
                System.out.println("Numero invalido");
            }

        }


    }
}
