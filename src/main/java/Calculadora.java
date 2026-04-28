public class Calculadora { 

    public int sumar(int a, int b) { 
        return a + b; 
    } 

    public int restar(int a, int b) { 
        return a - b; 
    } 

    // Metodo nuevo que añadimos en el segundo commit 
    public int multiplicar(int a, int b) { 
        return a * b; 
    }
    public double dividir(int a, int b) { if (b == 0) throw new ArithmeticException("Division por cero"); return (double) a / b; }
}