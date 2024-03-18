public class Empleados {
    private Empleado[] lista;

    public Empleados(int numEmpleados) {
        lista = new Empleado[numEmpleados];
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void darDeAltaEmpleado(Empleado empleado, int posicion) {
        lista[posicion] = empleado;
    }
    
}
