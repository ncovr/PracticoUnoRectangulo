import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*int largo = 4;
        int ancho = 2;
        // Creando mi primer objeto
        Rectangulo primerRectangulo = new Rectangulo(ancho, largo);
        System.out.println(primerRectangulo.area());*/

        System.out.println("Ingrese el largo"); int largo = in.nextInt();
        System.out.println("Ahora el ancho"); int ancho = in.nextInt();
        Rectangulo R1 = new Rectangulo(ancho, largo);

        System.out.println("Area: "+(R1.area()));
        System.out.println("Perimetro: "+(R1.perimetro()));
    }
}