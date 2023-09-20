/*
 Vamos a crear un programa mediante el cual debamos tener un menu de seleccion para 
 elegir algunas de las 14 opciones siguientes:
 1.- Bono o descuento por edad
 2.- Conventir numeros decimales a binarios
 3.- Convertir temperaturas
 4.- Numero de positivos y negativos 
 5.- Tiendita
 6.- Area y perimetro
 7.- Tabla
 8.- Factorial
 9.- Dibujitos
10.- Figura Hueca
11.- Patron
12.- Diamante
13.- Calculadora
14.- Salir 
 */

 //declarar las librerias que vamos a ocupar
 //se debe estructurar el tipo de dato acorde a su entrada
 //si es entero obtenerlo como entero, si es char obtenerlo como caracter
 import java.util.Scanner;

 class EstructurasControl{
    //si declaramos aqui con globales (se pueden usar en cualquier parte de la clase)

    //metodo principal
    public static void main (String [] args){
        //el manejo de objetos, nos ayuda a poder instancias (mandar a llamar al objeto)
        //para hacer una instancia es necesario 1.- identificar el tipo de objeto, 
        //2.- nombrar al objeto, 3.- crear al objeto
        Scanner entrada = new Scanner (System.in);
        //crear una instancia del objeto de la entrada por defecto de la computadora (el teclado)
        //identificar con scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que va a poder identificar si es int, double, float, etc
        
        //declarar las variables que se van a usar en el programa
        //las variables son de 2 tipos, globales y locales
        //si la declaro dentro del metodo es local (solo se usan en el segmento correspodiente, solo en este metodo)

        int opcion, numbinario, total, cantidadproducto, num1;
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario ="";
        char letra;
        

        do{
            //aqui va el menu del programa
            System.out.println("Bienvenido al programa: ");
            System.out.println("Elige alguna opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario "); //Jimmy
            System.out.println("3.- Convertir temperaturas");
            System.out.println("4.- Numeros positivos y negativos ");
            System.out.println("5.- Tiendita "); //Jimmy
            System.out.println("6.- Area y perimetro ");
            System.out.println("7.- Tabla "); //Jimmy
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujito "); //Jimmy
            System.out.println("10.- Figura hueca ");
            System.out.println("11.- Patrones de codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");
            




            //aqui adentro preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra =='s' || letra =='S');
    }
 }
