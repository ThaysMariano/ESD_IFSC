import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> clientes = new ArrayList<>();

        //para não iniciar com ele vazio apenas
        clientes.add("thays");
        clientes.add("kauan");

        boolean sair = false;

        do {
            System.out.print(">");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "?":   //apresentar nome do prox cliente e remover da lista
                    if(clientes.isEmpty()){
                        System.out.println("A fila está vazia");
                    }else {
                        System.out.println(clientes.remove(0));
                    }
                    break;
                case "sair":    //terminar o programa
                    sair = true;
                    break;
                default:        //quantos clientes na frente e adicionar a fila
                    clientes.add(entrada);
                    System.out.println(clientes.indexOf(entrada));
            }
        }while (!sair);
    }
}
