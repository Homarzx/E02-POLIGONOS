package Enum;

public enum Materiales {
    CARTON(100.0),
    /*Separado por comas, añadimos los elementos a ENUM poniendo entre parentesis su valor*/
    PLASTICO(300.0),
    MADERA(500.0);

    private double precio;
    /*Especificamos el tipo de dato que guardara como parametro los elementos anteriores
    * Siendo privada para limitar el acceso solo por metodos*/

    Materiales(double precio) {
        /*Declaramos un constructor de la clase Enum donde le pasamos como parametros
        * la variable anterior*/
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
