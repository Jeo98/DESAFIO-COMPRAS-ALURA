import com.aluradesafio.compras.clases.Articulos;
import com.aluradesafio.compras.clases.Tarjeta;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        int menu = 0, opcion, submenu;
        double Limiteaux, saldotarjetaaux;

        ArrayList<Articulos> ListaArticulos = new ArrayList<>(); //lista de articulos del comercio
        Articulos articulo1= new Articulos("Remera", 150.0,"Remera manga corta");
        Articulos articulo2= new Articulos("Pantalon Largo", 1500.0,"Pantalon tipo Cargo largo color azul");
        Articulos articulo3= new Articulos("Medias", 150.0,"medias cortas invisibles");
        Articulos articulo4= new Articulos("Zaparillas", 1000.0,"Zapatillas deportivas");
        ListaArticulos.add(articulo1);
        ListaArticulos.add(articulo2);
        ListaArticulos.add(articulo3);
        ListaArticulos.add(articulo4);

        Tarjeta TarjetaUsuario = new Tarjeta(15000, 4000);//valor inicial de tarjeta usuario
        Scanner lectura= new Scanner(System.in);

        while (menu == 0) {

            System.out.println("Ingrese limite de tarjeta: ");
            Limiteaux = lectura.nextDouble();
            System.out.println("Ingrese tipo de tarjeta(debito o credito): ");
            saldotarjetaaux = lectura.nextDouble();

            Tarjeta Tarjeta1 =new Tarjeta(Limiteaux,saldotarjetaaux );// Le doy valores iniciales a la tarjeta de credito



            System.out.println("--------------------------------------------------------------------------- ");
            System.out.println("---------------------------JEOCOMERCIO------------------------------------- ");
            System.out.println("--------------------------------------------------------------------------- ");
            System.out.println("1-Comprar");
            System.out.println("2-ver listado de articulos");
            System.out.println("3-Carrito");
            System.out.println("4-Finalizar compra");
            System.out.println("9-salir");
            System.out.println("-> ");
            opcion=lectura.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("--------COMPRA---------");
                    //muestro listado de articulos con precio
                    //submenu para que usuario elija que articulo ingresar
                    for(int i=0; i< ListaArticulos.size(); i++){

                        System.out.println("----->LISTADO DE ARTICULOS");
                        System.out.println((i+1)+ "-- " + ListaArticulos.toString());
                    }
                    System.out.println("ingrese numero de articulo a comprar:");
                    submenu=lectura.nextInt();
                    switch (submenu){

                        case 1: while(submenu != )
                            //completar aca para generalizar la Lista de articulos y no uno por uno
                                if(TarjetaUsuario.verificarCompra(ListaArticulos.get(0))){
                                System.out.println("ARTICULO AGREGADO!");


                        }
                        break;



                    }



                break;

                case 2:

                break;

            }





        }

    }
}