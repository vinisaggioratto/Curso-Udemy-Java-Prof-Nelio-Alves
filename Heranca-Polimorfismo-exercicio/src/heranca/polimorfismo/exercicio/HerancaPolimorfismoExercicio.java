package heranca.polimorfismo.exercicio;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HerancaPolimorfismoExercicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Contribuinte> cont = new ArrayList<>();

        String name = "";
        char type;
        int total, totalFuncionarios;
        double rendaAnual, gastosSaude;

        System.out.println("Quantos cadastros realizar: ");
        total = scan.nextInt();

        for (int i = 1; i <= total; i++) {

            System.out.println("Tipo de pessoal: Fisica / Juridica");
            type = scan.next().charAt(0);

            System.out.println("Informe seu nome: ");
            name = scan.nextLine();
scan.next();
            System.out.println("Informe sua renda anual: ");
            rendaAnual = scan.nextDouble();
            if (type == 'F') {
                System.out.println("Informe seus gastos com saude: ");
                gastosSaude = scan.nextDouble();
                cont.add(new PessoaFisica(gastosSaude, name, rendaAnual));
            } else {
                System.out.println("Informe o total de Funcionários: ");
                totalFuncionarios = scan.nextInt();
                cont.add(new PessoaJuridica(totalFuncionarios, name, rendaAnual));
            }

        }
        double sum = 0;
        for (Contribuinte c : cont) {

            double resImposto = c.calcularImposto();
            System.out.println("Nome: " + c.getName() + " - Imposto: R$ " + String.format("%.2f", resImposto));
            sum += resImposto;
        }
        
        System.out.println("Total de imposto pago: R$ " + String.format("%.2f", sum));
        
        
        scan.close();
    }

}
