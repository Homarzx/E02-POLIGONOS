package FigurasGeometricas;

import Enum.Materiales;
import Enum.Incrementos;

public class Figuras implements IFiguras{

    Materiales materiales;
    Incrementos incrementos;
    /*NOTA: Las listas Enum hay que importarlas pues si se añade con Enum.Materiales dara error de compilación */
    private double precio;

    Figuras(Materiales material,Incrementos incremento) {
        this.materiales = material;
        this.incrementos = incremento;
        setPrecioBase();
    }

    private void setPrecioBase() {
        precio = materiales.getPrecio() * incrementos.getIncremento();
    }

    private double getPrecioBase() {
        return precio;
    }

    @Override
    public void descripcionProducto() {
        System.out.println("[" + this.getClass().getSimpleName() +"]:[" + precio + "€]: Hecho de " + materiales + " de estetica " + incrementos);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println(precio);
    }
}
