import java.util.Scanner;

public class FatorialDuplo {

    public static int fatorialduplo(int digNumero){
        
        int fatorial = 1;

        while (digNumero >= 1){
            fatorial = fatorial * digNumero;
            digNumero = digNumero - 2; 
        }
        return fatorial;
    }
    public static void main(String[] args) {
        int valorDigitado = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com um valor: ");
        valorDigitado = input.nextInt();
        input.close();        
        
        System.out.println("O fatorial de : " +valorDigitado+ " é : " +fatorialduplo(valorDigitado));
    }
    
}
