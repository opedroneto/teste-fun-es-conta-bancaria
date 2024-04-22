import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Pedro Vaz Neto";
        String tipoConta = "Corrente";
        double saldo = 2500.99;

        System.out.println("***********************");
        System.out.println("\nDADOS DO CLIENTE");
        System.out.println("\nNOME: " + nome);
        System.out.println("TIPO DE CONTA: " + tipoConta);
        System.out.println("SALDO: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                \n-- ESCOLHA UMA DAS OPÇÕES --
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        int opcao = 0;

        /* importamos a classe Scanner e, em seguida,
        criamos uma instancia dela passando o objeto System.in como parametro
        para indicar que queremos ler a entrada do usuario pelo teclado */
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: R$ ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo: R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: R$");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente (X)");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo: R$ " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
            }
        }
