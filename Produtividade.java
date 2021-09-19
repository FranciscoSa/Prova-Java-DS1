import java.util.Scanner;

public class Produtividade {
    
    public static float calcularDias(char experiencia, float horasDiarias , int complexidade[]){
        float totalComplexidade = 0;
        float dias = 0;

        experiencia = Character.toUpperCase(experiencia);
        totalComplexidade = complexidade [0] + (complexidade[1] * 2) + (complexidade[2] * 4);
        
        if (experiencia == 'J'){

            dias = totalComplexidade * 2 / horasDiarias;
        
        }else if (experiencia == 'P'){

            dias = totalComplexidade * 1 / horasDiarias;

        }else {

            dias = totalComplexidade * 0.5F / horasDiarias;
        
        }

        return dias;
    }
    public static void main(String[] args) {
        int complexidade [] = new int [3];
        int controle = 0 ;
        float horasDiarias = 0;
        float dias = 0;
        char experiencia = 't';
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas horas por dia você vai trabalhar : ");
        horasDiarias = input.nextFloat();
        
        System.out.print("Quantas atividades de baixa complexidade voce tem : ");
        complexidade[0] = input.nextInt();

        System.out.print("Quantas atividades de media complexidade voce tem : ");
        complexidade[1] = input.nextInt();

        System.out.print("Quantas atividades de alta complexidade voce tem : ");
        complexidade[2] = input.nextInt();

        while (controle != 1){
            System.out.print("Qual seu grau de esperiencia [J - Juninor] [P - Pleno] [S - senior] : ");
            experiencia = Character.toUpperCase(input.next().charAt(0));
            
            if (experiencia == 'J' || experiencia == 'P' || experiencia == 'S'){
                controle = 1;
                dias = calcularDias(experiencia, horasDiarias, complexidade);
            }else{
                controle = 0;
            }
        }
        input.close();
        
        System.out.println("Você vai gastar "+dias+" dias para concluir as atividades.");
    }
}
