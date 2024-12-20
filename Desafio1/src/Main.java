import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        double salario_Anual, prestacao_Servico, ganho_Capital,gasto_Medico,gasto_Educacional;
        double imposto_Sal, imposto_Serv, imposto_Gc, max_Dedut, gasto_Dedut,imposto_Bruto, abatimento, imposto_Devido;
        double salario_Mensal;

        System.out.print("Renda anual com Salário: ");
        salario_Anual = sc.nextDouble();

        System.out.print("Renda anual com Prestação de Serviço: ");
        prestacao_Servico = sc.nextDouble();

        System.out.print("Renda anual com Ganho de Capital: ");
        ganho_Capital = sc.nextDouble();

        System.out.print("Gastos Médicos: ");
        gasto_Medico = sc.nextDouble();

        System.out.print("Gastos Educacionais:");
        gasto_Educacional = sc.nextDouble();

        salario_Mensal = salario_Anual/12;

        if (salario_Mensal < 3000){
            imposto_Sal =0;
        }
        else if (salario_Mensal <=5000) {
            imposto_Sal = 0.1*salario_Anual;

        }
        else {
            imposto_Sal = 0.2*salario_Anual;

        }

        if (prestacao_Servico <= 0) {

            imposto_Serv =0;
        }
        else {
            imposto_Serv = prestacao_Servico*0.15;
        }


        if (ganho_Capital <= 0) {

            imposto_Gc =0;
        }
        else {
            imposto_Gc = ganho_Capital*0.20;
        }

        gasto_Dedut = gasto_Medico+gasto_Educacional;
        imposto_Bruto = imposto_Gc+ imposto_Serv+imposto_Sal;

        max_Dedut = imposto_Bruto*0.30;


        if (gasto_Dedut/imposto_Bruto >=0.30) {
            abatimento = max_Dedut;
        }
        else {
            abatimento = gasto_Dedut;
        }

        imposto_Devido = imposto_Bruto-abatimento;



        System.out.printf("Imposto sobre Salário: %.2f\n", imposto_Sal);
        System.out.printf("Imposto sobre Serviço: %.2f\n", imposto_Serv);
        System.out.printf("Imposto sobre Ganho de Capital: %.2f\n", imposto_Gc);

        System.out.printf("Deduções:\n");

        System.out.printf("Máximo Dedutível: %.2f\n", max_Dedut);
        System.out.printf("Gastos Dedutíveis: %.2f\n", gasto_Dedut);

        System.out.printf("Resumo\n");

        System.out.printf("Imposto Bruto Total: %.2f\n", imposto_Bruto);
        System.out.printf("Abatimento: %.2f\n", abatimento);
        System.out.printf("Imposto Devido: %.2f\n", imposto_Devido);

        sc.close();
    }
}