public class Coche3{
    public static void main(String[] args) {
        
        int resultado;
        resultado = sumaTresParametros(20 ,30 ,40);
        System.out.println("Suma de tres parámetros: " + resultado);
        
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println("Puertas del objeto Coche: " + miCoche.numeroPuertas);
    }

    public static int sumaTresParametros(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int numeroPuertas;

    public void incrementarPuertas() {
        this.numeroPuertas++;
    }
}