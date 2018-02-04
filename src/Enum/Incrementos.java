package Enum;

public enum Incrementos {

    SIMPLE(1.0),
    COLOREADO(1.5),
    AUTOR(1.20),
    ESTAMPADO(1.17);

    private double incremento;

    Incrementos(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento (){
        return incremento;
    }
}
