package builder;

public class Aplicacion {
    public static void main(String[] args) {
       Contacto contacto1 = new ContactoBuilder()
       .nombre("Daniel")
       .telefono(12345678)
       .emailTwitter("daniel@correo.com", "dan_tw").build();
       Contacto contacto2 = new ContactoBuilder()
       .nombre("camilo")
       .telefono(41614547)
       .emailTwitter("camilo@correo.com", "millo_133").build();
       Contacto contacto3 = new ContactoBuilder()
       .nombre("jeffer")
       .telefono(48948567).build();

       System.out.println(contacto1.toString());
       System.out.println("----------------------------------------");
       
       System.out.println(contacto2.toString());
       System.out.println("----------------------------------------");
       
       System.out.println(contacto3.toString());
       System.out.println("----------------------------------------");
       
       //como telefono es null, da exepcion
       Contacto contacto4 = new ContactoBuilder()
       .nombre("prueba")
       .telefono(null).build();
    }
}
