public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 ------------
        System.out.println("Ejercicio 1:----");

        String titulo= "Cien años de Soledad";
        String autor= "Gabriel Garcìa Márquez";
        int numpaginas = 550;

        mostrarlibro(titulo, autor, numpaginas);

        // Ejercicio 2 ------------
        System.out.println("Ejercicio 2:----");
        System.out.println(duracionMediaCanciones(82,60,75));

        // Ejercicio 3 ------------
        System.out.println("Ejercicio 3----");
        System.out.println(tiempoRestanteAlquiler(9,10));

        // Ejercicio 4 ------------
        System.out.println("Ejercicio 4:----");
        calcularImpuestoYDescuento(40, 21, 50);

        // Ejercicio 5 ------------
        System.out.println("Ejercicio 5:----");
        System.out.println(porcentajeVideojuegos(8, 30));
    }

    // Ejercicio 1 ------------

    static void mostrarlibro(String titulo, String autor, int numpaginas) {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Nùmero de páginas: " + numpaginas);
    }

    // Ejercicio 2 ------------
    static double duracionMediaCanciones(int segCancion1, int segCancion2, int segCancion3) {
        double media = ((double) segCancion1 + segCancion2 + segCancion3) / 3;
        return media;
    }
    // Ejercicio 3 ------------

    static double tiempoRestanteAlquiler(int semanastotales, int diastranscurridos) {
        int totaldias = semanastotales * 7;
        int tiempoRestante = ( totaldias - diastranscurridos);
        return tiempoRestante;
    }

    // Ejercicio 4------------

    static void calcularImpuestoYDescuento( double precio, int impuesto, int descuento) {
        double conImpuesto= precio + (precio * impuesto / 100.0);
        double conDescuento= conImpuesto - (conImpuesto * descuento / 100.0);

        System.out.println("Precio original: " + precio + " €");
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("Con impuesto: " + conImpuesto + " €");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Con descuento: " + conDescuento + " €");
    }

    // Ejercicio 5------------
    static double porcentajeVideojuegos(int juegos, int totalarticulos) {
        double porcentajeVideojuegosInventario = ((double) juegos / totalarticulos) * 100.0;
        return porcentajeVideojuegosInventario;
    }

}