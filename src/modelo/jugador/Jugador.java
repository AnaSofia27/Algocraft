package modelo.jugador;

import java.util.*;

import modelo.construccion.Constructor;
import modelo.construccion.HachaMaderaConstructor;
import modelo.herramientas.*;
import modelo.materiales.*;
import modelo.jugador.Inventario.*;

public class Jugador {
    private Herramienta herramientaEquipada;
    private Inventario inventario;


    public Jugador(){
        Constructor unConstructor = new HachaMaderaConstructor();
        herramientaEquipada = unConstructor.construir();
        inventario = new Inventario();
    }

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public ArrayList getInventarioMateriales(){
        return inventario.getMateriales();
    }

    public ArrayList getInventarioHerramientas(){ return inventario.getHerramientas(); }

    public void recolectar(Diamante Diamante){
        herramientaEquipada.recolectar(Diamante);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta();
        }
        if(Diamante.SePuedeRecolectar()){
            inventario.RecolectarMaterial();
        }

    }


}
