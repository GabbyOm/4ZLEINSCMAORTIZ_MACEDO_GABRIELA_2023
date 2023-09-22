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

        int opcion, numbinario, total, cantidadproducto, num1, edad, n=0, n1=0, n2=0, n3=0, n4=0;
        float precio, resultado = 0, compra = 0, gradosC, gradosF, gradosK, gradosR, compra1=0;
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

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                System.out.println("Su compra fue de: " + compra1++);
                System.out.println("Se aplicara un Descuento si es Mayor de Edad o Socio");
                System.out.println("Ingrese su Edad: ");
                edad = entrada.nextInt();
                System.out.println("Ingrese su Nombre");
                letra = entrada.next().charAt(0);
                
                if( edad <= 21 ){
                   System.out.println("Sus padres son socios ?");
                   System.out.println("(1) Si");
                   System.out.println("(2) No");
                   opcion = entrada.nextInt();
 
                   if(opcion == 1){
                      System.out.println("Al cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                      total = (int) (compra1 * 0.45);
                      System.out.println("el total de su compra con descuento es: "+total);
                   }else if(opcion == 2){
                      System.out.println("sus padres: "+letra+" No son Socios");
                      System.out.println("solo se Aplicara el Descuento del 25%");
                      total = (int) (compra1 * 0.25);
                      System.out.println("el total de su compra con descuento es: "+total);
                   }
                }else if(edad >= 65){
                   System.out.println("Al cliente: " + letra+ "Se le Aplicara un Descuento del 40%");
                   total = (int) ((float) compra1 * 0.40);
                   System.out.println("el total de su compra con descuento es: "+total);
 
                }else if(edad > 21 && edad < 65){
                   System.out.println("Usted es  Socio o tiene un Familiar que sea socio ?");
                   System.out.println("(1) Si");
                   System.out.println("(2) No");
                   opcion = entrada.nextInt();
 
                   if(opcion == 1){
                      System.out.println("Al cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                      total = (int) (compra1 * 0.45);
                      System.out.println("el total de su compra con descuento es: "+total);
                   }else if(opcion == 2){
                      System.out.println("Sus padres: "+letra+" No son Socios");
                      System.out.println("solo se Aplicara el Descuento del 25%");
                      total = (int) (compra1 * 0.25);
                      System.out.println("el total de su compra con descuentp es: "+total);
                   }
                }
 
                    break;
                case 2:
                //decimal a binario
                System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                numbinario = entrada.nextInt();
                //primero tengo que saber si sea positivo
                if(numbinario > 0){

                    while(numbinario > 0){
                        if (numbinario%2 == 0 ){
                            binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }

                }else if(numbinario == 0){
                    binario = "0" + binario;
                }else if (numbinario <=0){
                    binario = "No se puede convertir un numero negativo, solo positivos";
                }
                System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                System.out.println("Que metodo de conversion desea usar: ");
                    System.out.println("(1) Convertir de Celcius a Fahrenheit, Celcius a Kelvine, Celcius a Rankine");
                    System.out.println("(2) Convertir de Fahrenheit a Celcius, Fahrenheit a Kelvine, Fahrenheit a Rankine");
                    System.out.println("(3) Convertir de Kelvine a Celcius, Kelvine a Fahrenheit, Kelvine a Rankine");
                    System.out.println("(4) Convertir de Rankine a Celcius, Rankine a Fahrenheit, Rankine a Kelvine");
                    opcion = entrada.nextInt();

                    if(opcion == 1){
                      System.out.println("Digite el numero de grados Celcius para convertir");
                      gradosC = entrada.nextInt();
                      gradosF = (float) (1.8 * gradosC + 32);
                      gradosK = (float) (273.15 + gradosC);
                      gradosR = (float) (1.8 * gradosC + 491.67);
                      System.out.println("Los grados Fahrenheit son: "+gradosF+"°");
                      System.out.println("Los grados Kelvine son: "+gradosK+"°");
                      System.out.println("Los grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 2){
                     System.out.println("Digite el numero de grados Fahrenheit a convertir");
                     gradosF = entrada.nextFloat();
                     gradosC = (float) (gradosF - 32 / 1.8);
                     gradosK = (float) (((gradosF - 32) / 1.8) + 273.15);
                     gradosR = (float) (gradosF + 459.67);
                     System.out.println("Los grados Celcius son: "+gradosC+"°");
                     System.out.println("Los grados Kelvine son: "+gradosK+"°");
                     System.out.println("Los grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 3){
                     System.out.println("Digite el numero de grados Kelvine a convertir");
                     gradosK = entrada.nextFloat();
                     gradosC = (float) (gradosK - 273.15);
                     gradosF = (float) (((gradosK - 273.15) * 1.8) + 32);
                     gradosR = (float) (1.8 * gradosK);
                     System.out.println("Los grados Celcius son: "+gradosC+"°");
                     System.out.println("Los grados Fahrenheit son: "+gradosF+"°");
                     System.out.println("Los grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 4){
                     System.out.println("Digite el numero de grados Rankine a convertir");
                     gradosR = entrada.nextFloat();
                     gradosC = (float) (5/9 * (gradosR - 491.67));
                     gradosF = (float) (gradosR - 459.67);
                     gradosK = 5/9 * (gradosR);
                     System.out.println("Los grados Celcius son: "+gradosC+"°");
                     System.out.println("Los grados Fahrenheit son: "+gradosF+"°");
                     System.out.println("Los grados Rankine son: "+gradosK+"°");
                    }
                    break;
                case 4:

                System.out.println("Ingrese los numeros que desea ingresar");
                n = entrada.nextInt();
                if(n > 0){
                   for(int i = 1; i <= n; i++){
                      System.out.println("Ingrese los numeros");
                      n1 = entrada.nextInt();
                      if(n1 > 0){
                         n2++;
                        
                      }else if(n1 < 0){
                         n3++;
                        
                      }else if(n1 ==0){
                         n4++;
                         
                      }
                   }
                   System.out.println("Los numeros: "+n1+" "+n2+" Son positivos");
                   System.out.println("Los numeros: "+n1+" "+n2+" Son negativos");
                   System.out.println("Los numeros: "+n1+" "+n2+" Son neutros");

                }else if(n <= 0){
                   System.out.println("La cantidad es incorrecta");
                   System.out.println("Ingrese una cantidad correcta");
                }

                    break;
                case 5:
                System.out.println("Bienvenido a la tiendita");
                System.out.println("POr favor ingrese el mumero de productos que va a comprar:");
                total = entrada.nextInt();

                for( int i = 1; i <=total; i++){
                    System.out.println("Ingrese el nombre del producto: ");
                    nombreproducto = entrada.next();
                    System.out.println("Ingrese el precio: ");
                    precio = entrada.nextFloat();
                    System.out.println("Ingrese la cantidad: ");
                    cantidadproducto = entrada.nextInt();
                    
                    resultado = precio * cantidadproducto;
                    compra = compra + resultado;
                    
                }
                System.out.println("El total de la compra es: " + compra);
                compra = 0;
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida por fissss");
                    break;

                                  
            }
            

            //aqui adentro preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra =='s' || letra =='S');
    }
 }
