package FigurasGeometricas;

import Enum.Incrementos;
import Enum.Materiales;

public class Cuadrado extends Pentagono {
    /*Creamos una nuava clase en base (extends) a una ya creada (Pentagono)*/

    public Cuadrado(Materiales material, Incrementos incremento) {
        /*Declaramos un nuevo constructor para que no falle la herencia con los mismos parametros que su clase anterior*/
        super(material, incremento);
    }
}
