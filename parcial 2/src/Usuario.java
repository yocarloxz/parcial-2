public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Email: " + email + ", Contraseña: " + contraseña;
    }
}
