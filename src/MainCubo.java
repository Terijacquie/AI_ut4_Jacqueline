import javax.swing.*;
import java.util.ArrayList;

/**
 * Clase Main que maneja e imprime los resultados dados por los métodos y atributos de la
 * clase Cubo.
 */
public class MainCubo {

    /**
     * ArrayList donde almacenamos los cubos generados.
     */
    public static ArrayList<Cubo> cubos = new ArrayList<Cubo>();

    /**
     * Método main donde se ejecutan solo los métodos fuera del mismo
      * @param args
     */
    public static void main(String[] args) {

        crearCubo();
        imprimirVolumen(cubos);
        imprimirAreaBase(cubos);
        imprimirCuboMayor(cubos);

    }

    /**
     * Método para crear los 3 cubos solicitados en la actividad
     * con un bucle for, donde solicitamos el lado de los mismos a través de
     * JOptionPane.
      */
    public static void crearCubo() {
        int cantidad = 3;
        for (int i = 0; i < cantidad; i++) {
            String nombreCubo = JOptionPane.showInputDialog(null, "Ingrese el nombre del cubo "+(i+1));
            double lado = Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Ingrese la medida del lado del cubo " + (i + 1)));

            Cubo miCubo= new Cubo(lado, nombreCubo);
            cubos.add(miCubo);
        }
    }

    /**
     * Método para imprimir el volúmen de los cubos utilizando el método "imprimirVolumen"
     * @param cubos
     */
    public static void imprimirVolumen(ArrayList<Cubo> cubos) {
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El volúmen de " + c.getNombreCubo() + " es " + c.calcularVolumen());
        }
    }

    /**
     * Método cuya función es encontrar el cubo de mayor tamaño, con ayuda de otra variable Cubo, que se inicializa
     * con la primera posición del ArrayList cubos. Al ser encontrado, se vuelve a utilizar con ayuda de
     * JOptionPane y "calcularVolumen".
     * @param cubos
     */
    public static void imprimirCuboMayor(ArrayList<Cubo> cubos) {
        Cubo cuboMayor = cubos.get(0);
        for (Cubo c : cubos) {
            if (c.calcularVolumen() > cuboMayor.calcularVolumen()) {
                cuboMayor = c;
            }
        }
        JOptionPane.showMessageDialog(null, "El cubo de mayor volumen es " + cuboMayor.calcularVolumen());
    }

    /**
     * Método para imprimir el área base de los cubos. Tiene el mismo funcionamiento que "calcularVolumen", pero
     * con el método "calcularAreaBase"
     * @param cubos
     */
    public static void imprimirAreaBase(ArrayList<Cubo> cubos) {
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El área base de " + c.getNombreCubo() + " es " + c.calcularAreaBase());
        }
    }

}
