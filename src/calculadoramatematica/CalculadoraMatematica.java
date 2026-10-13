package calculadoraMatematica;
import java.util.Scanner;


public class CalculadoraMatematica {

    private double numero1;
    private double numero2;

   
    public CalculadoraMatematica() {
        numero1 = 0;
        numero2 = 0;
    }

 
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    
    public double calcularSuma() {
        return numero1 + numero2;
    }

   
    public double calcularResta() {
        return numero1 - numero2;
    }

    
    public double calcularMultiplicacion() {
        return numero1 * numero2;
    }

 
    public double calcularDivision() {

        if (numero2 == 0) {
            System.out.println("error no se puede dividir entre cero");
            return 0;
        }

        return numero1 / numero2;
    }

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        int opcionMenu;

        do {

            System.out.println("===== CALCULADORA MATEMATICA =====");
             System.out.print("seleccione una opcion");
            System.out.println("[1] ingresar numeros");
            System.out.println("[2] sumar");
            System.out.println("[3] restar");
            System.out.println("[4] multiplicar");
            System.out.println("[5] dividir");
            System.out.println("[6] salir");
            
           

            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {

                case 1:
                    System.out.print("ingrese el primer numero: ");
                    double numero1 = scanner.nextDouble();

                    System.out.print("ingrese el segundo numero: ");
                    double numero2 = scanner.nextDouble();

                    calculadora.ingresarNumeros(numero1, numero2);

                    System.out.println("numeros ingresados correctamente.");
                    break;

                case 2:
                    System.out.println("resultado de la suma: "
                            + calculadora.calcularSuma());
                    break;

                case 3:
                    System.out.println("resultado de la resta: "
                            + calculadora.calcularResta());
                    break;

                case 4:
                    System.out.println("resultado de la multiplicacion: "
                            + calculadora.calcularMultiplicacion());
                    break;

                case 5:
                    System.out.println("resultado de la divisisn: "
                            + calculadora.calcularDivision());
                    break;

                case 6:
                    System.out.println("saliendo");
                    break;

                default:
                    System.out.println("opcion no valida");
            }

        } while (opcionMenu != 6);

        scanner.close();
    }
}