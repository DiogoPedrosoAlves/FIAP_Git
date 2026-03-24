// 570024 Diogo Pedroso Alves
// 569335 Samuel Pedroso Xavier

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            DespesaFamiliar despesa = new DespesaFamiliar();
            Scanner scan = new Scanner(System.in);

            try {

                System.out.println("Qual a sua renda familiar ? ");
                despesa.rendaFamiliar = scan.nextDouble();

                System.out.println("Agora, quantos moradores você tem em casa ? ");
                despesa.numeroDeMoradores = scan.nextInt();

                System.out.println("Quanto é a sua conta de água ? ");
                despesa.gastoComAgua = scan.nextDouble();

                System.out.println("Quanto é sua conta de internet ? ");
                despesa.gastoComInternet = scan.nextDouble();

                System.out.println("Quanto é sua conta de Luz ? ");
                despesa.gastoComLuz = scan.nextDouble();

                System.out.println("Qual o valor da mensalidade da academia ?");
                despesa.valorMensalidadeDaAcademia = scan.nextDouble();

                System.out.printf("A renda da família é R$%f\nO total de gastos é R$%f\nValor da renda familiar líquida é R$%f ", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());

            } catch (Exception e) {

                System.out.println("ERRO! Houve um falha nos dados inseridos.\n" + e);

            }
        }
}
