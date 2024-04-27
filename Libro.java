public class Libro { // nombre de mi clase
    String titulo, autor;// declarar variables de texto
    int Isbn, paginas;// declarar varaible de numeros enteros

    Libro() {
        System.out.println( "SE ESTA CONSTRUYENDO EL LIBRO QUE EL TITULO ES, EL NOMBRE DEL AUTOR ES,NUM. DE ISBN Y PAGINAS");// declracacion de metodo constructor
    }

Libro(String titu,String au,int Is,int pagi){  //metodo constructor
    System.out.println("titulo:"+ titu);//imprimir mis metodos
    System.out.println("titulo:"+ au);// imprimir mis metodos 
    System.out.println("titulo:"+ Is);//imprimir mis metodos 
    System.out.println("titulo:"+ pagi);//imprimir mis metodos 
}

    public void mostrarTitulo() {
        System.out.println("El titulo es:" + this.titulo);//imprimir datos de mi objeto
    }

    public void mostrarAutor() {
        System.out.println("El autor es : " + this.autor);//imprimir datos de mi objeto
    }

    public void mostrarIsbn() {
        System.out.println("Tu numero de ISBN: " + this.Isbn);//imprimir datos de mi objeto
    }

    public void mostrarPaginas() {
        System.out.println("El numero de pagina es " + this.paginas);//imprimir datos de mi objeto
    }

}
