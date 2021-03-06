package Modelo.Recetas;

import Modelo.Construccion.PicoFinoConstructor;
import Modelo.Materiales.*;

public class PicoFinoReceta extends Receta {

    public PicoFinoReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new PicoFinoConstructor();
        patron = new Material[]{  metal,  metal,  metal,
                                  piedra, madera, vacio,
                                  vacio,  madera, vacio };
    }
}
