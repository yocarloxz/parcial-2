import java.util.ArrayList;
import java.util.Scanner;

public class RegistroUsuarios {
    private ArrayList<Usuario> usuarios;
    private Scanner scanner;

    public RegistroUsuarios() {
        usuarios = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            registrarUsuario();
            continuar = preguntarContinuar();
        }
        mostrarUsuarios();
        System.out.println("Sistema cerrado.");
    }

    private void registrarUsuario() {
        String nombre = pedirNombre();
        String email = pedirEmail();
        String contraseña = pedirContraseña();

        Usuario usuario = new Usuario(nombre, email, contraseña);
        usuarios.add(usuario);

        System.out.println("Usuario registrado con éxito.");
    }

    private String pedirNombre() {
        String nombre;
        do {
            System.out.print("Ingrese el nombre del usuario: ");
            nombre = scanner.nextLine();
        } while (!ValidadorUsuario.validarNombre(nombre));
        return nombre;
    }

    private String pedirEmail() {
        String email;
        do {
            System.out.print("Ingrese el email del usuario: ");
            email = scanner.nextLine();
        } while (!ValidadorUsuario.validarEmail(email));
        return email;
    }

    private String pedirContraseña() {
        String contraseña;
        do {
            System.out.print("Ingrese la contraseña del usuario: ");
            contraseña = scanner.nextLine();
        } while (!ValidadorUsuario.validarContraseña(contraseña));
        return contraseña;
    }

    private boolean preguntarContinuar() {
        System.out.print("¿Desea agregar otro usuario? (s/n): ");
        String respuesta = scanner.nextLine().toLowerCase();
        return respuesta.equals("s");
    }

    private void mostrarUsuarios() {
        System.out.println("\nUsuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
