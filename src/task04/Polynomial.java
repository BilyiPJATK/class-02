package task04;

public class Polynomial {

    private int[] coefficients;

    Polynomial(int[] coefficient) {
        this.coefficients = coefficient;
    }

    public Polynomial add(Polynomial other){
        for(int i = 0; i<coefficients.length; i++)
            coefficients[i] += other.coefficients[i];
        return this;
    }

    public int[] getCoefficients() {
        return coefficients;
    }

    public Polynomial multiply(Polynomial other){


        return null;
    }

    public double evaluate(double x){
        int length = coefficients.length;
        double result = 0;

        for(int i = length-1; i >= 0; i--){
                result += coefficients[i] * Math.pow(x, i);
                System.out.println(coefficients[i] + " * " + i + "^" + x + " = " + result);
        }

        return result;
    }

/*    public double derivative(){
        return null;
    }*/


}
