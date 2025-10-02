package ACT_1;

public class PruebaMetodoGenerico {
    public static <E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) throws InvalidSubscriptException {
        int cont = 0;
        if ((subindiceSuperior <= subindiceInferior) || (subindiceInferior < 0) || (subindiceSuperior > arregloEntrada.length - 1)) {
            throw new InvalidSubscriptException();
        }
        for (int i = subindiceInferior; i < subindiceSuperior + 1; i++) {
            System.out.println(arregloEntrada[i]);
            cont++;
        }
        System.out.println();
        return cont;
    }

    public static void main(String[] args) {
        try {
            Integer[] arregloInteger = { 1, 2, 3, 4, 5, 6 };
            Double[] arregloDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
            Character[] arregloCharacter = { 'H', 'O', 'L', 'A' };

            System.out.println("El arreglo arregloInteger contiene:");
            imprimirArreglo(arregloInteger, 0, 7);

            System.out.println("\nEl arreglo arregloDouble contiene:");
            imprimirArreglo(arregloDouble);

            System.out.println("\nEl arreglo arregloCharacter contiene:");
            imprimirArreglo(arregloCharacter);
        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
