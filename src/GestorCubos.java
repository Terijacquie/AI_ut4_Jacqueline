import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class GestorCubos {
    /**
     * ArrayList donde almacenamos los cubos generados.
     */
    private ArrayList<Cubo> cubos = new ArrayList<Cubo>();

    public ArrayList<Cubo> getCubos() {
        return cubos;
    }

    /**
     * Método para crear los 3 cubos solicitados en la actividad
     * con un bucle for, donde solicitamos el lado de los mismos a través de
     * JOptionPane.
     *
     */
    public void crearCubo() {
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
     * @param
     */
    public void imprimirVolumen() {
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El volúmen de " + c.getNombreCubo() + " es " + c.calcularVolumen());
        }
    }

    /**
     * Método cuya función es encontrar el cubo de mayor tamaño, con ayuda de otra variable Cubo, que se inicializa
     * con la primera posición del ArrayList cubos. Al ser encontrado, se vuelve a utilizar con ayuda de
     * JOptionPane y "calcularVolumen".
     * @param
     */
    public void imprimirCuboMayor() {
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
     *
     */
    public void imprimirAreaBase() {
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El área base de " + c.getNombreCubo() + " es " + c.calcularAreaBase());
        }
    }

    /**
     * Método para imprimir los cubos por tamaño
     */
    public void imprimirPorTamanio() {
        Collections.sort(cubos);
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null, "Lista de Cubos: "+c.getNombreCubo());
        }
    }

    /**
     * Método booleano para determinar si un cubo cabe dentro de otro
     * @param c1
     * @param c2
     * @return
     */
    public boolean siCabe(Cubo c1, Cubo c2) {
        return c1.getLado() == c2.getLado();
    }
}
