import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que Horas São? ");
        horas = sc.nextInt();
        if ( 12 <= horas && horas < 18 ){
            System.out.println("Boa tarde ");
        }else{
            if ( horas < 12 ){
                System.out.println("Bom dia! ");
            } else{
                System.out.println("Boa Noite! ");
            }
        }

        sc.close();
    }
}
