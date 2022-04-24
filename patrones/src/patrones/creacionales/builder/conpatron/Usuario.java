package patrones.creacionales.builder.conpatron;

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


     public Usuario(UsuarioBuilder builder)
     {
        if(builder.getEmail() == null)
        {
            throw new IllegalArgumentException("email es requerido");
        }
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.apellido = builder.getApellido();
        this.telefono = builder.getTelefono();
        this.direccion = builder.getDireccion();
     }

     @Override
     public String toString() {
         // TODO Auto-generated method stub
         return " nombre: " + nombre + " apellido: "+ apellido + " email: " + email + " telefono: " + telefono;
     }

     
}
