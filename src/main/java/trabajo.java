public class trabajo {
    public static void main(String[] args) {
        System.out.println("ohola");
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

}
