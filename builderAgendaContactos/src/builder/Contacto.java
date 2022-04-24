package builder;

public class Contacto {
    //atributos requeridos
    private String nombre;
    private Integer telefono;

    //atributos opcionales
    private String email;
    private String twitter;

    public Contacto(){}

    public Contacto(ContactoBuilder builder)
    {
        if(builder.getNombre() == null || builder.getTelefono() == null)
        {
            throw new IllegalArgumentException("nombre y telefono son necesarias");
        }
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.telefono = builder.getTelefono();
        this.twitter = builder.getTwitter();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "nombre: " + nombre + " telefono: " + telefono + " email: " + email + " twitter: " + twitter;
    }
}
