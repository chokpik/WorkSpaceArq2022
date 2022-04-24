package patrones.creacionales.builder.conpatron;

public class Aplicacion {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioBuilder()
        .email("correo@correo.com")
        .nombre("nombre", "apellido")
        .telefono(123456789).build();

        System.out.println(usuario.toString());
    }
}
