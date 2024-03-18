import java.util.Scanner;

public class SistemaGestionEmpleados {


    public static void main(String[] args) {
        
            Empleados empleados = new Empleados(3);
    
            Empleado empleado1 = new Empleado("Juan", "Desarrollador", 50000);
            Empleado empleado2 = new Empleado("María", "Diseñadora", 45000);
            Empleado empleado3 = new Empleado("Pedro", "Gerente", 60000);
    
            empleados.darDeAltaEmpleado(empleado1, 0);
            empleados.darDeAltaEmpleado(empleado2, 1);
            empleados.darDeAltaEmpleado(empleado3, 2);
    
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduzca el porcentaje de aumento de salario: ");
            double porcentaje = scanner.nextDouble();
    
            empleados.aumentarSalario(porcentaje);
    
            System.out.println("Lista de Empleados:");
            empleados.mostrarEmpleados();
    
            scanner.close();
        }
    }

