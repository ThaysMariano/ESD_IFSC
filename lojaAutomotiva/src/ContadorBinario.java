import java.util.*;

public class ContadorBinario {

    public static void main(String[] args) {
        /* Escreva um programa que lê um número inteiro n digitado pelo usuário, e então usa uma fila
        para gerar todos os números binários correspondentes aos números decimais de 1 até n. Os números
        NÃO devem ser gerados a partir da conversão de decimal para binário ! Uma solução é a fila armazenar
        esses números na forma de String. */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> binario = new ArrayList<>();

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();


        binario.add("1");
        switch (n) {
            case 0:
                System.out.println(0);
                break;
            default:
                int numero = 0;
                for (int i = 0; i < n; i++) {
                    //n-1 pois já inicia com o "1" fixo no arraylist e a contagem tbm inicia em zero
                    if (numero < n - 1) {
                        binario.add(STR."\{binario.get(i)}0");
                        numero++;
                    }
                    if (numero < n - 1) {
                        binario.add(STR."\{binario.get(i)}1");
                        numero++;
                    }
                }
                for (int i =0; i< binario.size(); i++){
                    System.out.println(binario.get(i));
                }
                break;
        }
    }
}


//para index impar add um 1, para index par add um 0

//                for (int i= 0; i<=n/2; i++){
//                    if(i==0){
//                        System.out.println(STR."\{binario.get(i)}0");
//                        binario.add(STR."\{binario.get(i)}0");
//                    }
//                    else if(i%2==0){
//                        System.out.println(STR."\{binario.get(i-1)}0");
//                        binario.add(STR."\{binario.get(i-1)}0");
//                    }else {
//                        System.out.println(STR."\{binario.get(i-1)}1");
//                        binario.add(STR."\{binario.get(i-1)}1");
//                    }


//                // add 0 e 1 apenas, nao segue a regra do binario
//                for( int i = 0; i<n; i++){
//                    String novoValor;
//                    System.out.println();
//                    if(i % 2 == 0){
//                        novoValor = binario.getLast().concat("0");
//                        System.out.println(novoValor);
//                    }else{
//                        novoValor = binario.getLast().concat("1");
//                        System.out.println(novoValor );
//                    }
//                    binario.add(novoValor);
//                }




