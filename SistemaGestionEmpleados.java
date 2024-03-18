import java.util.Scanner;

public class SistemaGestionEmpleados {


    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);

        Empleado empleado1 = new Empleado(Textos.NOMBRE_EMPLEADO1, Textos.CARGO_EMPLEADO1, Textos.SALARIO_EMPLEADO1);
        Empleado empleado2 = new Empleado(Textos.NOMBRE_EMPLEADO2, Textos.CARGO_EMPLEADO2, Textos.SALARIO_EMPLEADO2);
        Empleado empleado3 = new Empleado(Textos.NOMBRE_EMPLEADO3, Textos.CARGO_EMPLEADO3, Textos.SALARIO_EMPLEADO3);

        empleados.darDeAltaEmpleado(empleado1, 0);
        empleados.darDeAltaEmpleado(empleado2, 1);
        empleados.darDeAltaEmpleado(empleado3, 2);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.PEDIR_PORCENTAJE_AUMENTO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Textos.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
    }

