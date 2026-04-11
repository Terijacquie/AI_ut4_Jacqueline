import java.util.ArrayList;

/***
 * Clase cubo con atributo unico de lado. Esta clase contendrá
 * los respectivos getter y setter, constructor y métodos necesarios
 * para el cálculo del área base y volúmen de dicho objeto.
 */
public class Cubo {
    private double lado;

    /**
     * Crea un nuevo objeto cubo
     * @param lado
     */
    public Cubo(double lado) {
        this.lado = lado;
    }

    /**
     * Método encargado de calcular el volúmen
     * @return volúmen
     */
    public float calcularVolumen() {
        return (float) (Math.pow(this.lado, 3));
    }

    /**
     * Método encargado de calcular el área base del objeto
     * @return areaBase
     */
    public float calcularAreaBase() {
        return (float) Math.pow(this.lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }
}
