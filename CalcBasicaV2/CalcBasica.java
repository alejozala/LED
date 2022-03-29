import java.util.Scanner;

public class CalcBasica{
    public static void main(String args[]){
        System.out.println("Testando...");
        double operando1 = 0;
        double operando2 = 0;
        String operador = "";
        double result = 0;

        int tam = args.length;
        // Cria objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Verifica a qtde de parametros
        if (tam == 3) {
            // Declaracao de variaveis e Converte os parametros
            operando1 = Double.parseDouble(args[0]);
            operando2 = Double.parseDouble(args[2]);
            operador = args[1];

            // Chamada do metodo da classe
            result = calc.calcular(operando1, operador, operando2);

            System.out.println("Resultado = " + result);
            
        } else if (tam == 0){
            
            // Leitura de dados do teclado
            Scanner scanner = new Scanner(System.in);
            System.out.print("Forneca operando1: ");
            operando1 = scanner.nextDouble();
            System.out.print("Forneca operador: ");
            operador = scanner.next();
            System.out.print("Forneca operando2: ");
            operando2 = scanner.nextDouble();

            // Chamada do metodo de calculo
            result = calc.calcular(operando1, operador, operando2);

            System.out.println("Resultado = " + result);
        } 
        else {
            System.out.println("Parametros invalidos!!");
        }
    }
}
