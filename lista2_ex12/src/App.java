import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
        double horas = ler.nextDouble();
        System.out.println("");
        
        System.out.print("Informe a o valor pago pelas suas horas de trabalho: ");
        double valor = ler.nextDouble();
        System.out.println("");

        double salariobruto = horas * valor;
        double inss = 0.10 * salariobruto;
        double sindicato = 0.03 * salariobruto;
        double descontos = inss + sindicato;
        double fgts = 0.11 * salariobruto;
        double salarioliquido = salariobruto - descontos;

        if(salariobruto <= 900.00){
            System.out.printf("Salario bruto: %2.2f",salariobruto);
            System.out.println("");
            System.out.printf("IR: Isento");
            System.out.println("");
            System.out.printf("INSS: %2.2f",inss);
            System.out.println("");
            System.out.printf("Sindicato: %2.2f",sindicato);
            System.out.println("");
            System.out.printf("FGTS: %2.2f",fgts);
            System.out.println("");
            System.out.printf("Total de Descontos: %2.2f",descontos);
            System.out.println("");
            System.out.printf("Salario liquido: %2.2f",salarioliquido);
            System.out.println("");
        }
        if(salariobruto >= 900.01 && salariobruto <= 1500.00){
            System.out.printf("Salario bruto: %2.2f",salariobruto);
            System.out.println("");
            System.out.printf("IR: %2.2f",(0.05*salariobruto));
            System.out.println("");
            System.out.printf("INSS: %2.2f",inss);
            System.out.println("");
            System.out.printf("Sindicato: %2.2f",sindicato);
            System.out.println("");
            System.out.printf("FGTS: %2.2f",fgts);
            System.out.println("");
            System.out.printf("Total de Descontos: %2.2f",descontos + (0.05*salariobruto));
            System.out.println("");
            System.out.printf("Salario liquido: %2.2f",salarioliquido - (0.05*salariobruto));
            System.out.println("");
        }
        if(salariobruto >= 1500.01 && salariobruto <= 2500.00){
            System.out.printf("Salario bruto: %2.2f",salariobruto);
            System.out.println("");
            System.out.printf("IR: %2.2f",(0.10*salariobruto));
            System.out.println("");
            System.out.printf("INSS: %2.2f",inss);
            System.out.println("");
            System.out.printf("Sindicato: %2.2f",sindicato);
            System.out.println("");
            System.out.printf("FGTS: %2.2f",fgts);
            System.out.println("");
            System.out.printf("Total de Descontos: %2.2f",descontos + (0.10*salariobruto));
            System.out.println("");
            System.out.printf("Salario liquido: %2.2f",salarioliquido - (0.10*salariobruto));
            System.out.println("");
        }
        if(salariobruto >= 2500.01){
            System.out.printf("Salario bruto: %2.2f",salariobruto);
            System.out.println("");
            System.out.printf("IR: %2.2f",(0.20*salariobruto));
            System.out.println("");
            System.out.printf("INSS: %2.2f",inss);
            System.out.println("");
            System.out.printf("Sindicato: %2.2f",sindicato);
            System.out.println("");
            System.out.printf("FGTS: %2.2f",fgts);
            System.out.println("");
            System.out.printf("Total de Descontos: %2.2f",descontos + (0.20*salariobruto));
            System.out.println("");
            System.out.printf("Salario liquido: %2.2f",salarioliquido - (0.20*salariobruto));
            System.out.println("");
        }
    }

    
}
