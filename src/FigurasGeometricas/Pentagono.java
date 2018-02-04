package FigurasGeometricas;

import Enum.Incrementos;
import Enum.Materiales;

public class Pentagono extends Figuras {

    public Pentagono(Materiales material, Incrementos incremento) {
        /*El constructor de la clase poligonos ha de ser publico para tener acceso en el main
        * y se le ha de pasar por parametros las lista ENUM (Materiales e Incrementos) como base de su estructura*/
        super(material, incremento);
        /*Cogera de la clase padre (super) los objetos que hayamos puesto en Figuras*/
    }


}
