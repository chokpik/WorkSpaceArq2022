package patrones.creacionales.builder.conpatron;

public class UsuarioBuilder {
    
    //atributo requerido
    private String email;
    
    //atributo opcionales
    private String codigo;
    private String nombre;
    private String apellido;
    private String profesion;
    private int edad;
    private long telefono;
    private String direccion;


    public UsuarioBuilder(){}

    public Usuario build()
    {
        return new Usuario(this);
    }

    public UsuarioBuilder email(String pEmail)
    {
        this.email = pEmail;
        return this;
    }

    public UsuarioBuilder nombre(String pNombre, String pApellido)
    {
        this.nombre = pNombre;
        this.apellido = pApellido;
        return this;
    }

    public UsuarioBuilder telefono(long pTelefono)
    {
        this.telefono = pTelefono;
        return this;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getProfesion() {
        return profesion;
    }


    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public long getTelefono() {
        return telefono;
    }


    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
