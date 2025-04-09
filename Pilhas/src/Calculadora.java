import java.util.Stack;

public class Calculadora {
    //adicionar numero, completa, calcula, fazoperacao, resultado, limpar


    private Stack<Double> stack;
    private int numeroElementos;
    private double x2;
    private double x1;


    public Calculadora(){
        stack = new Stack<>();
        numeroElementos = 0;

    }

    public double calcula(String expressao){
        String[] caracter = expressao.split(" ");

        for(String caract : caracter){
            if(caract.equals("+") || caract.equals("-") || caract.equals("*") || caract.equals("/")){
                faz_operacao(caract);
            }else {
                adicionarNumero(Double.parseDouble(caract));
            }
        }
        return resultado();
    }

    public void faz_operacao(String operador){
        x2 = stack.pop();
        x1 = stack.pop();

        switch (operador){
            case "-" -> stack.push(x1-x2);
            case "+" -> stack.push(x1+x2);
            case "*" -> stack.push(x1*x2);
            case "/" -> stack.push(x1/x2);
        }

    }


    public void adicionarNumero(Double num){
        stack.push(num);
    }

    public boolean completa(){
        //?
        return stack.size() == 1;
    }

    public double resultado(){
        return stack.pop();
    }

    public void limpa(){
        stack.clear();
    }





}
