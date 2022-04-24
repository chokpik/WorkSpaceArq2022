import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Codigo spaguetti
        Es un codigo para ordenar 3 numeros de manera ascendente, es dificil de leer y entender lo que hace
        maneja muchas sentencias if anidadas y hay mejores soluciones al problema
        */

        int a=0,b=0,c=0;Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");b = sc.nextInt();
        System.out.println("Ingrese el tercer numero");c = sc.nextInt();

if(a>b) {if(a>c) {if(b>c) {System.out.println( c + " " + b + " " + a);                 
}else {System.out.println( a + " " + c + " " + b);
}
}else {System.out.println( b + " " + a + " " + c);
}
}else {if(b>c) {if(a>c) {System.out.println( c + " " + a + " " + b);
}else {System.out.println(a + " " + c + " " + b);
}              
}else {System.out.println( a + " " + b + " " + c);
}
}
}
}
