package br.com.alura.PraticandoCurso2modulo4Interface;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    protected  double base ;
    protected  double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getcalcularArea() {
        double total = base * altura;
        return total;
    }

    @Override
    public double getcalcularPerimetro() {
       double total= altura + base;
        return total;
    }
}
