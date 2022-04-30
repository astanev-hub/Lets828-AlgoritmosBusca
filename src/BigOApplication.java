import example.Example;

public class BigOApplication {
    public static void main(String[] args) {

        //O(1)
        //Example.imprimirNumero(10);

        //O(N)
        //Example.imprimirAteNumero(10000);

        long start = System.currentTimeMillis();
        //O(N^2)
        //Example.imprimirQuadradoDeNumero(1000);

        //O(N*2)
        Example.imprimirQuadradoDeNumeroOtimizado(1000);

        long stop = System.currentTimeMillis();
        System.out.println("Tempo: " + (stop - start));
    }
}
