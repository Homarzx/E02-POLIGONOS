package com.cice;

import Enum.Incrementos;
import Enum.Materiales;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.IFiguras;
import FigurasGeometricas.Pentagono;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<IFiguras> listaPoligonos = new ArrayList<>();
        listaPoligonos.add(new Pentagono(Materiales.CARTON, Incrementos.SIMPLE));
        /*A la lista añadimos un nuevo objeto de tipo Pentagono especificando sus parametros que son su material y su incremento (de la lista Enum)*/
        listaPoligonos.add(new Pentagono(Materiales.MADERA, Incrementos.ESTAMPADO));
        listaPoligonos.add(new Pentagono(Materiales.PLASTICO, Incrementos.SIMPLE));
        listaPoligonos.add(new Cuadrado(Materiales.CARTON, Incrementos.COLOREADO));

        Iterator it = listaPoligonos.iterator();
        /*Un Iterator es un mecanismo que permite acceder secuencialmente a los elementos de una colección*/

        int i = 0;
        while (listaPoligonos.size() > i) {
            /*Bucle para leer la lista*/
            IFiguras figura = (IFiguras)it.next();
            /*De la interfaz creamos un nuevo elemento que represente el siguiente elemento de la colección gracias a Iterator*/
            figura.descripcionProducto();
            /*Ponemos la acción declarada en la clase padre (Figuras)*/
            i++;


        }
    }
}
