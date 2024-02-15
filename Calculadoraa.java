import java.util.Scanner;
public class Calculadoraa{
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            double guardar=0;
            int contador=0;
            char opcion = '+';
            System.out.println("-----MENU PRINCIPAL-----");
            System.out.println("Presione + para sumar");
            System.out.println("Presione - para restar");
            System.out.println("Presione * para multiplicar");
            System.out.println("Presione / para dividir");
            System.out.println("Presione s para salir");
            System.out.println("Ingrese numero:");
            while (opcion!='s') {
                double numero=scanner.nextDouble();
                if (contador==0){
                    opcion=scanner.next().charAt(0);
                }
                if (opcion=='+'){
                    guardar = guardar+numero;
                }
                if (opcion=='-'){
                    guardar = guardar-numero;
                }
                if (opcion=='*'){
                    guardar = guardar*numero;
                }
                if (opcion=='/'){
                    guardar = guardar/numero;
                }
                if (contador>=1){
                    System.out.println("="+guardar);
                    opcion=scanner.next().charAt(0);
                }
                contador++;
            }         
        }
    }