import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largo = 4;
        int ancho = 2;
        // Creando mi primer objeto
        Rectangulo primerRectangulo = new Rectangulo(ancho, largo);
        System.out.println(primerRectangulo.area());

    }
}