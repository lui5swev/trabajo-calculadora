import java.util.InputMismatchException;
import java.util.Scanner;

public class trabajo {
    public static void main(String[] args) {
        System.out.println("ohola");
    }
    //llamar menu
    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Agregar estudiante");
            System.out.println("Mostrar cantidad de estudiantes que aprueban la asginatura");
            System.out.println("Mostrar cantidad de estudiantes que reprueban la asignatura ");
            System.out.println("Mostrar la cantidad de estudiantes que van a examen");
            System.out.println("Mostrar el estado de todos los estudiantes de la asignatura(notas y promedio)");
            System.out.println("Salir");
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Estudiante Agregado");
                        break;
                    case 2:

                        System.out.println("Cantidad de almunos que aprueban: ");
                        break;
                    case 3:

                        System.out.println("Cantidad de alumnos que reprueban: ");
                        break;
                    case 4:

                        System.out.println("Cantidad de alumnos que van a examen: ");
                    case 5:
                        System.out.println("Estado de todos los estudiantes de la asginatura: ");
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                sn.next();
            }


        }

    }

    public static double suma(double a,double b){
        return a+b;
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a,double b){
        return a/b;
    }
    public static double resta(double a,double b){
        return a-b ;
    }
    public static double comparacionMayor(double a,double b){
        return Math.max(a, b);
    }
    public static double comparacionMenor(double a,double b){
        return Math.min(a,b);
    }
    public static double elevado(double a,double b){
        return Math.pow(a,b);
    }
    public static double porcentaje(double c,double p){
        double porcentaje;
        porcentaje=(c*p)/100;
        return porcentaje;
    }
    //perimetros,areas y volumenes

    public static double perimetroCuadrado(double lado){
        return (4*lado);

    }
    public static double perimetroTriangulo(double ladoa,double ladob){
        return(2*ladoa)+(2*ladob);

    }

    public static double perimetroEsfera(double radio,double perimetro){
        return perimetro=2*Math.PI*radio;
    }





}
