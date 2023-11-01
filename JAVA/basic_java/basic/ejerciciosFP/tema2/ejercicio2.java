package ejerciciosFP.tema2;

class B{
    int y =5;
}
class A{
    int x=2;
    int sumar_b(B unObjetoB){
    return x+unObjetoB.y;
    }
}

public class ejercicio2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        int suma =a.sumar_b(b);
        System.out.println(suma);
    }
}
