import java.util.Scanner;

public class DescontoCarrosUsados {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int anoVeiculo;
        float precoVeiculo;
        float descontoA = 0.12f;
        float descontoB = 0.07f;
        char repetir = 's';
        int totalDeAutomoveis = 0;
        int modelosAntigos = 0;

        while (repetir == 's' || repetir == 'S') {
            System.out.println("Informe o ano do veículo: ");
            anoVeiculo = leitor.nextInt();
            if (anoVeiculo <= 2000){
                modelosAntigos += 1;
            }

            System.out.println("Agora iforme o valor: ");
            precoVeiculo = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                System.out.println("Desconto de 12%: R$" + (precoVeiculo * descontoA));
                System.out.println("Valor a pagar: R$" + (precoVeiculo * (1-descontoA)));
            } else {
                System.out.println("Desconto de 7%: R$" + (precoVeiculo * descontoB));
                System.out.println("Valor a pagar: R$" + (precoVeiculo * (1-descontoB)));
            }
            totalDeAutomoveis += 1;

            System.out.println("\nDeseja continuar?\nDigite S para sim ou qualquer outra letra para sair.");
            repetir = leitor.next().charAt(0);

        }
        if (totalDeAutomoveis == 1) {
            System.out.println("Apenas 1 automóvel foi cadastrado.");
        } else {
            System.out.println("Foram cadastrados " + totalDeAutomoveis + " automóveis.");
        }

        if (modelosAntigos == 1) {
            System.out.println("1 modelo antigo encontrado.");
        } else if (modelosAntigos > 0) {
            System.out.println(modelosAntigos + " modelos antigos encontrados.");
        } else {
            System.out.println("Não foram encontrados modelos antigos");
        }
    }

}
