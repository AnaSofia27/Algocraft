package Modelo.Construccion;

import Modelo.Excepciones.RecetaInvalida;
import Modelo.Herramientas.*;

public class ConstructorVacio extends Constructor  {

    //clase auxiliar que se usara en caso de que se necesite un constructor que no tenga efecto.
    //Por ejemplo en el caso de que no hayan coincidencias con el patron ingresado.

    public Herramienta construir(){

        throw new RecetaInvalida();

    }
}
