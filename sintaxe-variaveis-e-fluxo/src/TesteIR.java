public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900 && salario <= 2800) {
        	System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142.");
        } else if (salario > 2800 && salario <= 3751) {
        	System.out.println("O IR é de 15% e pode deduzir R$ 350.");        	
        } else if (salario > 3751 && salario <= 4664) {
        	System.out.println("O IR é de 22.5% e pode deduzir R$ 636.");
        }
    }
}