import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int e,v1,v2,mulipi,sum,d,cobro,at,bt,areat;
        String n;
        Scanner i = new Scanner(System.in);
        System.out.println("Por favor digite un numero del 1 al 3");
        System.out.println("1: Hacer una suma y multiplicacion");
        System.out.println("2: Validacion del cobro si es mayor de edad");
        System.out.println("3: Area de triangulo");
        e = i.nextInt();
        switch (e) {
            case 1:
                System.out.println("Por favor digite 2 valores");
                v1 = i.nextInt();
                v2 = i.nextInt();
                sum = v1+v2;
                mulipi = v1*v2;
                System.out.println("La suma de los valores es"+sum);
                System.out.println("L multiplicacion de los valores es"+mulipi);
                break;
            case 2:
                System.out.println("Por favor ingrese su nombre");
                n = i.next();
                System.out.println("Por favor ingrese su edad");
                d = i.nextInt();
                if (d>=18) {
                    cobro = 10000 * d;
                    System.out.println("Debe de pagar un total de: "+cobro+" por ser mayor de edad");}
                else{
                        System.out.println("Usted no es mayor de edad, por ende, no genera cobro");
                    }
                break;
            case 3:
                System.out.println("Por favor ingrese la altura y base de un triangulo");
                at = i.nextInt();
                bt = i.nextInt();
                areat = (bt*at)/2;
                System.out.println("El area de un triangulo es: "+areat);
                break;
            default: {
                System.out.println("Por favor ingrese la opcion 1,2 o 3");
            }
        }
    }
}
