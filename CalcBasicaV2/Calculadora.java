
/**
 * Escreva uma descrição da classe Calaculadora aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Calculadora
{
    /**
     * realiza 4 operacoes basicas
     * 
     * @param  operando1 double operando1 do calculo
     * @param  operador String operador do calculo
     * @param  operando2 double operando2 do calculo
     * @return double resultado da operacao
     */
    public double calcular(double operando1, String operador, double operando2)
    {
            double   result = 0;
            if (operador.equals("+")){

                result = operando1 + operando2;

                System.out.println("Soma: " + result);

            } else if (operador.equals("-")){
                result = operando1 - operando2;

                System.out.println("Subtracao: " + result);
            } else if (operador.equals("/")){
                result = operando1 / operando2;

                System.out.println("Divisao: " + result);
            } else if (operador.equals("x")){
                result = operando1 * operando2;

                System.out.println("Multiplicacao: " + result);
            } else {
                System.out.println("Operador invalido!!");				
            }
            
            return result;
    }
}
