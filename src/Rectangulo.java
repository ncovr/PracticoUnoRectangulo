import static java.lang.Math.sqrt;

public class Rectangulo {
    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public void setAncho(int a){
        ancho = a;
    }
    public void setLargo(int l){
        largo = l;
    }

    public int area(){ return (largo*ancho); }
    public int perimetro(){
        return ((largo*2)+(ancho*2));
    }
    public double diagonal() { return sqrt((largo*largo)+(ancho*ancho)); }

}
