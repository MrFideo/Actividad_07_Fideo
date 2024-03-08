public class Actividad_7 {
    public static void main(String[] args) {
        CalculosMatematicos calculos = new CalculosMatematicos(47);

        int[] primos = calculos.calcularPrimos();
        System.out.println("Números primos:");
        for (int i = 0; i < primos.length; i++) {
            if (i < primos.length - 1) {
                System.out.print(primos[i] + ", ");
            } else {
                System.out.print(primos[i] + ".");
            }
        }
        System.out.println("\n");

        int[] fibonacci = calculos.calcularFibonacci();
        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i < fibonacci.length; i++) {
            if (i < fibonacci.length - 1) {
                System.out.print(fibonacci[i] + ", ");
            } else {
                System.out.print(fibonacci[i] + ".");
            }
        }
    }
}

class CalculosMatematicos {
    private int n;

    public CalculosMatematicos(int n) {
        this.n = n;
    }

    public int[] calcularPrimos() {
        int[] primos = new int[n];
        int numero = 2; 
        int contador = 0;

        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] calcularFibonacci() {
        int[] fibonacci = new int[n];
        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

}
    

    