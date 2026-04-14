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

        //Creamos la lógica para que funcione el método booleano
        Cubo c1 = gestor.getCubos().get(0);
        Cubo c2 = gestor.getCubos().get(1);

        boolean resultado = gestor.siCabe(c1, c2);

        String mensaje = "¿El cubo "+c1.getNombreCubo()+" cabe exactamente dentro de "
                +c2.getNombreCubo()+" ? \n" +resultado;
        JOptionPane.showMessageDialog(null, mensaje);

    }

}
