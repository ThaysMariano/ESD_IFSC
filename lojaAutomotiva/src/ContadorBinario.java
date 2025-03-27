import java.util.*;

public class ContadorBinario {

    public static void main(String[] args) {
        /* Escreva um programa que lê um número inteiro n digitado pelo usuário, e então usa uma fila
        para gerar todos os números binários correspondentes aos números decimais de 1 até n. Os números
        NÃO devem ser gerados a partir da conversão de decimal para binário ! Uma solução é a fila armazenar
        esses números na forma de String. */

        // 1 10 11 100 101

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> binario = new ArrayList<>();


        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        //para index impar add um 1, para index par add um 0
        binario.add("1");
        switch (n){
            case 0:
                System.out.println(0);
                break;
            default:








                // add 0 e 1 apenas, nao segue a regra do binario
                for( int i = 0; i<n; i++){
                    String novoValor;
                    System.out.println();
                    if(i % 2 == 0){
                        novoValor = binario.getLast().concat("0");
                        System.out.println(novoValor);
                    }else{
                        novoValor = binario.getLast().concat("1");
                        System.out.println(novoValor );
                    }
                    binario.add(novoValor);
                }
                break;
        }
        System.out.println(binario);


    }



}
