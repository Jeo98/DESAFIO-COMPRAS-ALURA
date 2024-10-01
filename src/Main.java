import com.aluradesafio.compras.clases.Articulo;
import com.aluradesafio.compras.clases.Tarjeta;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        int menu = 0, opcion;
        double saldoaux;
        String tipotarjeta;
        Scanner lectura= new Scanner(System.in);
        ArrayList<Articulo> listaArticulos = new ArrayList<>();




        while (menu == 0) {

            System.out.println("Ingrese monto tarjeta: ");
            saldoaux = lectura.nextDouble();
            System.out.println("Ingrese tipo de tarjeta(debito o credito): ");
            tipotarjeta = lectura.nextLine();

            Tarjeta Tarjeta1 =new Tarjeta(tipotarjeta,saldoaux);


            System.out.println("--------------------------------------------------------------------------- ");
            System.out.println("---------------------------JEOCOMERCIO------------------------------------- ");
            System.out.println("--------------------------------------------------------------------------- ");
            System.out.println("1-Comprar");
            System.out.println("2-Devolver");
            System.out.println("3-ver listado de productos");
            System.out.println("4-Carrito");
            System.out.println("5-Finalizar compra");
            System.out.println("9-salir");
            System.out.println("-> ");
            opcion=lectura.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("--------COMPRA---------");



                break;

                case 2:

                break;

            }





        }

    }
}