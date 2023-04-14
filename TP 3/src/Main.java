import Modelos.Autor;
import Modelos.Cliente;
import Modelos.Cuenta;
import Modelos.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autor miAutor= new Autor("Joshua","Bloch","joshua@email.com","M");
        System.out.println(miAutor.toString());
        Libro effectiveJava=new Libro("Effective Java",450,150, miAutor);
        System.out.println(effectiveJava.toString());
        effectiveJava.setPrecio(500);
        effectiveJava.setStock(effectiveJava.getStock()+50);
        System.out.println(effectiveJava.toString());
        System.out.println(effectiveJava.mostrarAutor());
         //ejercicio 1

        Cliente miCliente=new Cliente(1,"lau","M");
        System.out.println(miCliente.toString());
        Cuenta miCuenta=new Cuenta(1,10000,miCliente, 0);
        Scanner teclado=new Scanner(System.in);

        int continuar=1;
        int decision;
        while(continuar==1){
            System.out.println("para retirar ingrese 1 para depositar ingrese 2");
            decision= teclado.nextInt();
            switch (decision){
                case 1:
                    System.out.println("ingrese monto a retirar");
                    double aRetirar= teclado.nextDouble();
                    if(miCuenta.retirar(aRetirar)==true)
                    {
                        System.out.println("retiro: "+aRetirar);
                        System.out.println("saldo restante en cuenta: "+miCuenta.getBalance());
                        System.out.println("deuda total: "+miCuenta.getSaldoDeudor());
                    }
                    else {
                        System.out.println("error");
                    }
                    break;
                case 2:
                    System.out.println("ingrese monto a depositar");
                    double aDepositar= teclado.nextDouble();
                    miCuenta.depositar(aDepositar);
                    System.out.println("saldo en cuenta: "+miCuenta.getBalance());
                    System.out.println("saldo deudor: "+miCuenta.getSaldoDeudor());
                    break;
            }
            System.out.println("desea realizar otra operacion? ingrese 1 para continuar");
            continuar=teclado.nextInt();

        }

    }
}