import javax.swing.*;
import java.util.ArrayList;

/**
 * Clase Main que maneja e imprime los resultados dados por los métodos y atributos de la
 * clase Cubo.
 */
public class MainCubo {
    /**
     * Método main donde se ejecutan solo los métodos fuera del mismo
      * @param args
     */
    public static void main(String[] args) {

        GestorCubos gestor = new GestorCubos();
        gestor.crearCubo();
        gestor.imprimirPorTamanio();
        gestor.imprimirVolumen();
        gestor.imprimirAreaBase();
        gestor.imprimirCuboMayor();

    }

}
