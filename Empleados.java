/**
 * Esta clase representa grupo de empleados.
 */

public class Empleados {
    private Empleado[] lista;
    /**
     * Constructor de la clase Empleados.
     *
     * @param numEmpleados La cantidad de empleados que puede contener la colección.
     */
    public Empleados(int numEmpleados) {
        lista = new Empleado[numEmpleados];
    }
    /**
     * Muestra todos los empleados
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     *
     * @param porcentaje El porcentaje de aumento de salario.
     */

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
     /**
     * Da de alta un empleado en una posición específica de la colección.
     *
     * @param empleado El empleado a dar de alta.
     * @param posicion La posición en la que se añadirá el empleado.
     */

    public void darDeAltaEmpleado(Empleado empleado, int posicion) {
        lista[posicion] = empleado;
    }
    
}
