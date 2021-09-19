import java.util.Scanner;


public class Imposto {

    public static float percentual(float salario){
        float deducao = 0F;
        
        if (salario <= 1903.98F){
            deducao = 0F;
        }else if (salario > 1903.98F && salario <= 2826.65F){
        
            deducao = ((salario / 100) * 7.50F) - 142.80F;
        
        }else if (salario > 2826.65F && salario <= 3751.05F){
        
            deducao = ((salario / 100) * 15.00F) - 354.80F;
        
        }else if (salario > 3751.05F && salario <= 4664.68F){
        
            deducao = ((salario / 100) * 22.50F) - 636.13F;
        
        }else{
        
            deducao = ((salario / 100) * 27.50F) - 869.36F;
        
        }
        return deducao;
    }
    
    public static void main(String[] args) {
        float salario = 0;
        
        Scanner input = new Scanner(System.in);
            
        while (salario <= 0 ){
                System.out.print("Entre com um valor valido para o salario : ");
                salario = input.nextFloat();
        }

        input.close();
        
        System.out.println("Para o salario : "+salario+" a deducao é : "+percentual(salario));
    }
}
