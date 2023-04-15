
package Maths;

public class Resto implements OperadorMatematica{

    @Override
    public double calcular(double a, double b) {
        return a % b;
    }
    
}
