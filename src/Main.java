public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 ------------
        System.out.println("Ejercicio 1:----");
        
        String titulo= "Cien años de Soledad"; // defino el valor del parámetro título
        String autor= "Gabriel Garcìa Márquez"; // defino el valor del parámetro autor 
        int numpaginas = 550; // defino la cantidad de páginas 

        mostrarlibro(titulo, autor, numpaginas); // llamo a la función con los parámetros 

        // Ejercicio 2 ------------
        System.out.println("Ejercicio 2:----");
        System.out.println(duracionMediaCanciones(82,60,75)); // llamamos a la función, definimos valores y nos devuelve la duración media de 3 canciones, en segundos.

        // Ejercicio 3 ------------
        System.out.println("Ejercicio 3----");
        System.out.println(tiempoRestanteAlquiler(9,10)); // llamamos a la función tiempoRestanteAlquiler y ponemos de parámetros 9 y 10 

        // Ejercicio 4 ------------
        System.out.println("Ejercicio 4:----");
        calcularImpuestoYDescuento(40, 21, 50); // llamamos a la función calcularImpuestoYDescuento y ponemos 3 parámetros (40, 21 y 50) 

        // Ejercicio 5 ------------
        System.out.println("Ejercicio 5:----");
        System.out.println(porcentajeVideojuegos(8, 30)); //  llamamos a la función porcentajeVideojuegos y le ponemos entre paréntesis los valores o parámetros 8 y 30 
    }

    // Ejercicio 1 ------------

    // Creamos una función mostrarLibro que tiene como parámetros: título, autor y numpaginas. 
    static void mostrarlibro(String titulo, String autor, int numpaginas) {

        /// Uso sout para mostrar por consola lo solicitado en el ejercicio
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Nùmero de páginas: " + numpaginas);
    }

    // Ejercicio 2 ------------

     // Creamos una función duracionMediaCanciones que devuelve la duración media de 3 canciones, en segundos, y devuelve un número decimal 
    static double duracionMediaCanciones(int segCancion1, int segCancion2, int segCancion3) {
        double media = ((double) segCancion1 + segCancion2 + segCancion3) / 3;
        return media;
    }
    // Ejercicio 3 ------------

      // Creamos una función tiempoRestanteAlquiler que devuelva el tiempo restante (en días) de un alquiler, dado el tiempo total del alquiler (en semanas) y el tiempo transcurrido (en días).

    static double tiempoRestanteAlquiler(int semanastotales, int diastranscurridos) { // definimos la funciòn, ingresamos los elementos semanas totales, y dias transcurridos
        int totaldias = semanastotales * 7; // definimos la variable totaldias que albergarà el resultado de multiplicar semanas totales por 7 días.
        int tiempoRestante = ( totaldias - diastranscurridos); // creamos otra variable (tiempoRestante) que alberga el resultado de restar total días y días transcurridos. 
        return tiempoRestante; // devolemos el valor de tiempoRestante
    }

    // Ejercicio 4

      // Creamos una función duracionMediaCanciones que devuelve la duración media de 3 canciones, en segundos, y devuelve un número decimal 

    static void calcularImpuestoYDescuento( double precio, int impuesto, int descuento) { //  Creamos una función con los siguientes elemmentos: precio, impuesto y descuento
        double conImpuesto= precio + (precio * impuesto / 100.0); // creamos la variable conImpuesto y guardamos el resultado de precio + precio * impuesto dividido entre 100.0 (lo pusimmos con decimal)
        double conDescuento= conImpuesto - (conImpuesto * descuento / 100.0); // creamos la variable conDescuento que alberga el resultado de restar el resultado de la variable conImpuesto y de multiplicar y dividir con impuesto, descuento y 100.0 

        System.out.println("Precio original: " + precio + " €"); // mostramos por consola 
        System.out.println("Impuesto: " + impuesto + "%"); // mostramos por consola 
        System.out.println("Con impuesto: " + conImpuesto + " €"); // mostramos por consola 
        System.out.println("Descuento: " + descuento + "%"); // mostramos por consola 
        System.out.println("Con descuento: " + conDescuento + " €"); // mostramos por consola 
    }

    // Ejercicio 5------------

      // Creamos una función porcentajeVideojuegos qye devuelva el porcentaje de videojuegos del inventario, teniendo en cuenta el número de juegos disponibles y el número total de artículos.

    static double porcentajeVideojuegos(int juegos, int totalarticulos) { // creamos la función y agregamos los siguientes elementos: juegos y total artículos
        double porcentajeVideojuegosInventario = ((double) juegos / totalarticulos) * 100.0; //  creamos la variable porcetanjeVideojuegosInventario que tiene l resultado de dividir juegos entre total artículos * 100.0
        return porcentajeVideojuegosInventario; // devuelve el valor de la función porcentajeVideojuegosInventario
    }

}
