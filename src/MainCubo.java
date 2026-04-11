import javax.swing.*;
import java.util.ArrayList;

public class MainCubo {

    public static ArrayList<Cubo> cubos = new ArrayList<Cubo>();

    public static void main(String[] args) {

        crearCubo();
        imprimirVolumen(cubos);
        imprimirAreaBase(cubos);
        imprimirCuboMayor(cubos);

    }

    public static void crearCubo() {
        int cantidad = 3;

        for (int i = 0; i < cantidad; i++) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Ingrese la medida del lado del cubo " + (i + 1)));

            Cubo miCubo = new Cubo(lado);
            cubos.add(miCubo);
        }
    }

    public static void imprimirVolumen(ArrayList<Cubo> cubos) {
        int acumulador = 1;
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El volúmen del cubo " + acumulador + " es " + c.calcularVolumen());
            acumulador++;
        }
    }

    public static void imprimirCuboMayor(ArrayList<Cubo> cubos) {
        Cubo cuboMayor = cubos.get(0);
        for (Cubo c : cubos) {
            if (c.calcularVolumen() > cuboMayor.calcularVolumen()) {
                cuboMayor = c;
            }
        }
        JOptionPane.showMessageDialog(null, "El cubo de mayor volumen es " + cuboMayor.calcularVolumen());
    }

    public static void imprimirAreaBase(ArrayList<Cubo> cubos) {
        int acumulador = 1;
        for (Cubo c : cubos) {
            JOptionPane.showMessageDialog(null,
                    "El área base del cubo " + acumulador + " es " + c.calcularAreaBase());
            acumulador++;
        }
    }

}
