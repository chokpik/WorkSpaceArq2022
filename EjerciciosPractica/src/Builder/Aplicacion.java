package Builder;



public class Aplicacion {
    public static void main(String[] args) {
        /*
        El patron builder sirve para poder asegurarse de que un objeto siempre tenga por lo menos un atributo obligatorio, si este se crea sin el atributo obligatorio da error y la aplicacion podria no continuar con su buen funcionamiento
        */
        Articulo articulo1 = new ArticuloBuilder()
        .id(1234L)
        .nombre("Articulo 1")
        .precioUnitarioStock(12000D, 200000L).build();
        System.out.println(articulo1.toString());
        System.out.println("===============================================");
        Articulo articulo2 = new ArticuloBuilder()
        .idNombre(1235L, "Articulo 2")
        .precioUnitarioMayorista(10000D, 8000D)
        .build();
        System.out.println(articulo2.toString());
        System.out.println("===============================================");
        Articulo articulo3 = new ArticuloBuilder()
        .idNombreDescripcion(123456L, "Articulo 3", "Trata sobre abejitas :D")
        .nombre("Articulo 3")
        .build();
        System.out.println(articulo3.toString());
        System.out.println("===============================================");
        Articulo articulo4 = new ArticuloBuilder()
        .idPrecioUnitarioStock(1234567L, 11500D, 155L)
        .nombre("Articulo 4")
        .build();
        System.out.println(articulo4.toString());
        System.out.println("===============================================");
        Articulo articulo5 = new ArticuloBuilder()
        .idPrecioUnitarioMayorista(1234567890L, 10550D, 8500D)
        .nombre("Articulo 5")
        .build();
        System.out.println(articulo5.toString());
        System.out.println("===============================================");
    }
    

}
