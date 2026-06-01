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
<<<<<<< HEAD

    System.out.println("Estamos estudiando para el examen ");
=======
    public double dividir(int a, int b) { if (b == 0) throw new ArithmeticException("Division por cero"); return (double) a / b; }
>>>>>>> 6387020a43a4e121503b0019aee26cc25107ba3a
}