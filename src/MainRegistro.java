import java.util.Scanner;

public class MainRegistro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 2;

        RegistroIP[] registros = new RegistroIP[MAX];

        System.out.println("--- INGRESO DE REGISTROS ---");

        for (int i = 0; i < registros.length; i++) {
            System.out.println("\nIngresando datos para el registro " + (i + 1) + ":");

            System.out.print("Ingrese la dirección IP: ");
            String ip = sc.nextLine();

            System.out.print("Ingrese la hora de acceso (ej. 14:30): ");
            String hora = sc.nextLine();

            System.out.print("¿Acceso permitido? (true/false): ");
            boolean permitida = Boolean.parseBoolean(sc.nextLine());

            registros[i] = new RegistroIP(ip, hora, permitida);
        }

        System.out.println("\n--- ESTADO DE LOS REGISTROS INGRESADOS ---");

        for (int i = 0; i < registros.length; i++) {
            registros[i].mostrarEstado();
        }

        sc.close();
    }
}