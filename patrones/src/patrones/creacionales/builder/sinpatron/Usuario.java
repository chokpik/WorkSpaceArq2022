package patrones.creacionales.builder.sinpatron;

public class Usuario {
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

    public Usuario(){}

    public Usuario(String email, String codigo) {
        super();
        this.email = email;
        this.codigo = codigo;
    }    

    public Usuario(String email, String codigo, String nombre, String apellido) {
        this.email = email;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    public Usuario(String email, String codigo, String nombre, String apellido, String profesion, int edad,
    long telefono, String direccion) {
        this.email = email;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Usuario(String email, String codigo, String nombre, String apellido, String profesion) {
        this.email = email;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public String getApellido() {
        return apellido;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getEdad() {
        return edad;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getProfesion() {
        return profesion;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
