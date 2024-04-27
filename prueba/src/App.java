import java.util.Scanner;
//Emanuel De Jesus Chavez Lopez.
//Carnet 2024-1380U.
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1, numero2, numero3;

        // Repite el bloque de código hasta que el usuario ingrese tres números diferentes
        do {
            // Solicita al usuario que ingrese tres números
            System.out.println("Ingrese tres numeros enteros diferentes");
            numero1 = leer.nextInt();
            numero2 = leer.nextInt();
            numero3 = leer.nextInt();

            leer.close(); // Cerrar scanner

            // Si los números no son diferentes, muestra un mensaje de error y repite la solicitud
            if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
                System.out.println("Los números deben ser diferentes. Intente de nuevo.");
            }
        } while (numero1 == numero2 || numero1 == numero3 || numero2 == numero3);

        // Utiliza la clase Math para encontrar el número más grande
        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        // Utiliza la clase Math para encontrar el número más pequeño
        int menor = Math.min(numero1, Math.min(numero2, numero3));
        
        // Determina el número intermedio que no es ni el mayor ni el menor
        int intermedio = (numero1 != mayor && numero1 != menor) ? numero1 : (numero2 != mayor && numero2 != menor) ? numero2 : numero3;

        // Calcula la suma de los dos números más pequeños
        int sumaPequenos = menor + intermedio;
        // Calcula la diferencia entre los dos números más grandes
        int diferenciaGrandes = mayor - intermedio;

        // Muestra los resultados de las operaciones realizadas
        System.out.println("La suma de los dos números más pequeños es: " + sumaPequenos);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaGrandes);
        System.out.println("El número más grande es: " + mayor);

    }
}
