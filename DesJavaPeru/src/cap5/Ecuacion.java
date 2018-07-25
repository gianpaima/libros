package cap5;

public class Ecuacion {

    private double a;
    private double b;
    private double c;

    public Ecuacion() {
    }

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double[] resolver(){
        double raiz[] = new double[2];
        double temp = Math.sqrt(Math.pow(this.getB(), 2)-4 * this.getA() * this.getC());
        raiz[0] = (- this.getB() + temp) / (2 * this.getA());
        raiz[1] = (- this.getB() - temp) / (2 * this.getA());
        return raiz;
    }
}
