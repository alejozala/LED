public class CalcBasica{
	public static void main(String args[]){
		System.out.println("Testando...");

		int tam = args.length;

		if (tam == 3) {
			System.out.println("Parametro1: " + args[0]);
			System.out.println("Parametro2: " + args[1]);
			System.out.println("Parametro3: " + args[2]);

			double operando1 = Double.parseDouble(args[0]);
			double operando2 = Double.parseDouble(args[2]);
			String operador = args[1];
			double result = 0;

			if (operador.equals("+")){

				result = operando1 + operando2;

				System.out.println("Soma: " + result);

			} else if (operador.equals("/")){
				result = operando1 / operando2;

				System.out.println("Divisao: " + result);
			} else if (operador.equals("*")){
				result = operando1 * operando2;

				System.out.println("Multiplicacao: " + result);
			}
		} else {
			System.out.println("Parametros invalidos!!");
		}	
	}
}
