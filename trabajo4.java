package co.com.ps.trabajosenclases;
import java.util.Scanner;
public class trabajo4

{   public static void main(String[] args) {

    int num;
    Scanner scanner;
    scanner= new Scanner(System.in);
    System.out.println("Digite el Numero");
    num= scanner.nextInt();
    if (num>0){
        System.out.println("el numero positivo");
    } else if (num<0) {
        System.out.println(" numero negativo");

    }else {
        System.out.println("el numero es 0");
    }

    int valorarticulo;
    int cate;
    double ele=0.1;
    double rop= 0.05;
    double alim=0.02;
    double desElectronicos;
    double desRopa;
    double desAlimentos;

    System.out.println(" ingresa el precio de un artículo y" +
            "su categoría (ejemplo, \"electrónicos\", \"ropa\", \"alimentos\")." +
            "Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2%" +
            "si son alimentos");

    System.out.println("Ingrese 1.la categoria electronica\nIngrese 2.la categoria de ropa Ingrese 3.la categoria alimentos ");

    System.out.println("Ingrese la categoria");
    cate= scanner.nextInt();
    System.out.println("Ingrese el precio de un articulo");
    valorarticulo= scanner.nextInt();


    desElectronicos = valorarticulo*ele;
    desRopa = valorarticulo*rop;
    desAlimentos = valorarticulo*ele;

    switch (cate){

        case 1:
            System.out.println(" CATEGORIA ES ELECTRONICA CON DESCUENTO DEL 15% EL VALOR DEL ARTICULO QUE INGRESO ES " + valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desElectronicos));
            break;

        case 2:
            System.out.println(" CATEGORIA ES ROPA CON DESCUENTO DEL 8% EL VALOR DEL ARTICULO QUE INGRESO ES "+ valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desRopa));
            break;
        case 3:
            System.out.println(" CATEGORIA ES ALIMENTO CON DESCUENTO DEL 4% EL VALOR DEL ARTICULO QUE INGRESO ES "+ valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desAlimentos));
            break;
        default:
            System.out.println("error de la digitacion ");
    }



}
}

