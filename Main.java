
package Maths;

public class Main {
    public static void main(String[] args) {
        OperadorMatematica soma = new Soma();
        OperadorMatematica subtracao = new Subtracao();
        OperadorMatematica divisao = new Divisao();
        OperadorMatematica multiplicacao = new Multiplicacao();
        OperadorMatematica resto = new Resto();
        
        double a = 26;
        double b = 10;
        
        System.out.println(soma.calcular(a, b));
        System.out.println(subtracao.calcular(a, b));
        System.out.println(divisao.calcular(a, b));
        System.out.println(multiplicacao.calcular(a, b));
        System.out.println(resto.calcular(a, b));
        
    }
}
