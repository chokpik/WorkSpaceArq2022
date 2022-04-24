package builder;

public class ContactoBuilder {
    //atributos requeridos
    private String nombre;
    private Integer telefono;

    //atributos opcionales
    private String email;
    private String twitter;

    public ContactoBuilder(){}

    public Contacto build()
    {
        return new Contacto(this);
    }
    public ContactoBuilder nombre(String pnombre)
    {
        this.nombre = pnombre;
        return this;
    }

    public ContactoBuilder telefono(Integer ptelefono)
    {
        this.telefono = ptelefono;
        return this;
    }

    public ContactoBuilder emailTwitter(String pemail, String ptwitter)
    {
        this.email = pemail;
        this.twitter = ptwitter;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    
}
