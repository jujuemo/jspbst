package exercicios;

public class SegundoGrau {
    private double a, b, c;

    public SegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //#region Getters Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //#endregion
    
    public boolean verificarSegundoGrau() {
        return a != 0;
    }

    public boolean verificarRaizesReais() {
        return calcDelta() > 0;
    }

    public double calcDelta() {
        return (Math.pow(this.b, 2)) - 4*this.a*this.c;
    }

    public String calcRaizes() {
        if ( !verificarSegundoGrau() ) {
            if ( !verificarRaizesReais() ) {
                return "A equação não possui raízes reais";
            }
            return "equação não é de segundo grau";
        }

        double calcX1 = -this.b + Math.sqrt( calcDelta() );
        double calcX2 = -this.b - Math.sqrt( calcDelta() );
        if ( calcX1 == calcX2  ) {
            return "A raiz da equação é: " + calcX1;
        } else {
            return "As raizes da equação são: " + calcX1 + ", " + calcX2;
        }
    }

}