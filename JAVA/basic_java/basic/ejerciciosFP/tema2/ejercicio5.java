package ejerciciosFP.tema2;

class Punto2D {
    private double cx;
    private double cy;
    void Punto2D(){
        this.cx = 0.0;
        this.cy = 0.0;
    }
    void Punto2D(double cx, double cy){
        this.cx = cx;
        this.cy = cy;
    }
    void Punto2D(Punto2D a){
        this.cx = a.cx;
        this.cy = a.cy;
    }
    double getX(){
        return cx;
    }
    double getY(){
        return cy;
    }
    void setX(double cy){
        this.cx = cx;
    }
    void setY(double cy){
        this.cy = cy;
    }
}

public class ejercicio5 {
    public static void main(String[] args) {
        
    }
}
