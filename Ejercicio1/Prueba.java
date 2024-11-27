package Taller5.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
       // Crear un objeto de la clase Empleado usando el constructor 
       Empleado empleado1 = new Empleado("Ana Gómez", 2500.00);
        // Mostrar información del empleado 
        empleado1.mostrarInformacion(); 
        // Modificar el salario 
        empleado1.setSalario(3000.00); 
        System.out.println("Salario actualizado: " + empleado1.getSalario()); 
        // Intentar asignar un salario negativo
         empleado1.setSalario(-500.00);
         System.out.println("Intento de asignar salario negativo: " + empleado1.getSalario()); // Acceder a la propiedad pública nombre directamente System.out.println("Nombre del empleado: " + empleado1.nombre); 
    }
}
