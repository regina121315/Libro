import java.util.Scanner;// libreria de leer datos del teclado 

public class MainLibro {//nombre de mi clase 
    public static void main(String[] args) {//mi principal metodo
        Libro x = new Libro(); //declarar objeto
        String a, b;// declarar variables de texto
        int i, p;// declarar variables de numero entero

        Scanner op = new Scanner(System.in);//Scannear datos

        System.out.println("El titulo es ");//Pedir al usuario los datos
        a = op.next();//guardar variables

        System.out.println("El autor es ");//Pedir al usuario los datos
        b = op.next();//guardar variables

        System.out.println("cual es tu ISBN");//Pedir al usuario los datos
        i = op.nextInt();//guardar variables

        System.out.println("cual es tu pagina");//Pedir al usuario los datos
        p = op.nextInt();//guardar variables
        x.titulo = a;// dar valor al objeto
        x.autor = b;;// dar valor al objeto
        x.Isbn = i;;// dar valor al objeto
        x.paginas = p;;// dar valor al objeto

        x.mostrarTitulo();// mostrar lo que se pide 
        x.mostrarAutor();// mostrar lo que se pide 
        x.mostrarIsbn();// mostrar lo que se pide 
        x.mostrarPaginas();// mostrar lo que se pide 

        Libro y = new Libro("La Tregua","Regina",070,105);// crear otro objeto

    }
}