import java.util.Scanner;

public class TopicosJavaDemo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Impresion de mensaje
        System.out.println("Bienvienido al Sistema");

        // Lectura de entero por teclado
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        // Letura de doble por teclado
        System.out.print("Introduce to salario: ");
        double salario = teclado.nextDouble();

        // Lectura de caracter por teclado
        System.out.print("Introduce tu grado: ");
        char grado = teclado.next().charAt(0);

        // Definicion de una constante
        final double PI = 3.14159;

        // Lectura de una cadena por teclado
        System.out.print("Introduce tu nombre: ");
        teclado.nextLine();
        String nombre = teclado.nextLine();

        // Conversion explicita de salario
        int salarioInt = (int) salario;

        // Operador de asignacion
        System.out.print("Introduce to bono: ");
        int bono = teclado.nextInt();
        salario += bono; // salario = salario + bono

        // Operadores logicos y relacionales
        boolean esJubilado = edad > 68;
        boolean esElegibleBono = (edad <= 68) && (salario < 5000);

        // Ciclos
        // For
        for (int i = 1; i <= 5; i++) {
            System.out.println("La iteracion va por el numero: " + i);
        }

        // While
        while (salario > 1000) {
            salario /= 2;
            System.out.println("Salario en el loop: " + salario);
        }

        // Do While
        do {
            edad++;
        } while (edad < 68);

        // Condiciones
        // If/Else
        if (esJubilado) {
            System.out.println(nombre + " es elegible para jubilacion.");
        } else {
            System.out.println(nombre + " todavia le falta para jubilarse.");
        }

        // Switch
        String departamento;
        switch(grado) {
            case 'A':
                departamento = "Ejecutivo";
                break;
            case 'B':
                departamento = "Administracion";
                break;
            case 'C':
                departamento = "Soporte";
                break;
            case 'D':
                departamento = "Becario";
                break;
            default:
                departamento = "No Asignado";
                break;
        }

        // Impresion
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad Ajustada: " + edad);
        System.out.println("Salario Final: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("PI: " + PI);
        System.out.println("Salario (Entero): " + salarioInt);
        System.out.println("Elegible Bono: " + esElegibleBono);

        teclado.close();
    }
}
