import java.util.regex.Pattern;

public class ValidadorUsuario {

    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Za-z ]+");
    }

    public static boolean validarEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.compile(regex).matcher(email).matches();
    }

    public static boolean validarContraseña(String contraseña) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.compile(regex).matcher(contraseña).matches();
    }
}
