//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        setvbuf(stdout, NULL, _IONBF, 0);

            Calculadora calculadoraRapida = new Calculadora();

            System.out.println("Calculadora rapida: " + calculadoraRapida.calcula("10 3 2 / +"));

            Calculadora calculadoraManual = new Calculadora();

            calculadoraManual.adicionarNumero(10.0);
            calculadoraManual.adicionarNumero(3.0);
            calculadoraManual.adicionarNumero(2.0);
            calculadoraManual.faz_operacao("/");
            calculadoraManual.faz_operacao("+");

            System.out.println("Calculadora manual: "+calculadoraManual.resultado());
        }
    }
