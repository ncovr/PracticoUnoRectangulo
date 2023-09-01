import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*int largo = 4;
        int ancho = 2;
        // Creando mi primer objeto
        Rectangulo primerRectangulo = new Rectangulo(ancho, largo);
        System.out.println(primerRectangulo.area());*/

        System.out.println("Ingrese el largo"); int largo = in.nextInt(); // Almacena largo
        System.out.println("Ahora el ancho"); int ancho = in.nextInt(); // Almacena ancho
        Rectangulo R1 = new Rectangulo(ancho, largo); // Crea rectangulo R1 con ancho y largo

        System.out.println("Area: "+(R1.area())); // Invoca el método ".area" del objeto Rectangulo
        System.out.println("Perimetro: "+(R1.perimetro())); // Invoca el método ".perimetro" del objeto Rectangulo
        System.out.println("Diagonal: "+(R1.diagonal())); // Invoca el método ".diagonal" del objeto Rectangulo

        // Aumentar el ancho de R1
        System.out.println("Ingrese el nuevo ancho"); // Socilita el nuevo ancho para reemplazar el valor de ancho em R1
        R1.setAncho(in.nextInt()); // Invoca el metodo setAncho y reestablece el nuevo ancho para R1

        // Desplegar metodos con los nuevos valores
        System.out.println("Area: "+(R1.area())); // Invoca el método ".area" del objeto Rectangulo
        System.out.println("Perimetro: "+(R1.perimetro())); // Invoca el método ".perimetro" del objeto Rectangulo
        System.out.println("Diagonal: "+(R1.diagonal())); // Invoca el método ".diagonal" del objeto Rectangulo

        // Volver al ancho anterior
        System.out.print("Ingrese el ancho digitado al inicio: ");
        R1.setAncho(in.nextInt());
        // Discminuir el largo del rectangulo
        System.out.print("Ingrese un largo menor al actual ("+(R1.getLargo())+"): ");
        R1.setLargo(in.nextInt());

        // Desplegar metodos con los nuevos valores
        System.out.println("Area: "+(R1.area())); // Invoca el método ".area" del objeto Rectangulo
        System.out.println("Perimetro: "+(R1.perimetro())); // Invoca el método ".perimetro" del objeto Rectangulo
        System.out.println("Diagonal: "+(R1.diagonal())); // Invoca el método ".diagonal" del objeto Rectangulo
    }
}