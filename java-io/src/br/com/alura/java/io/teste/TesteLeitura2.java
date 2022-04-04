package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); // Definindo o padrão para UTF-8 para que possa ler acentos
            while(scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
//                    System.out.println(linha);

                    Scanner linhaScanner = new Scanner(linha);
                    linhaScanner.useLocale(Locale.US);
                    linhaScanner.useDelimiter(",");

                    String tipoConta = linhaScanner.next();
                    int agencia = linhaScanner.nextInt();
                    int numero = linhaScanner.nextInt();
                    String titular = linhaScanner.next();
                    double saldo = linhaScanner.nextDouble();

                    // %s é string | %d é decimal | %f é float (%04d teremos 4 casas decimais para frente no número)
                    System.out.println(String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %.2f", // pt de portugues
                    									  tipoConta, agencia, numero, titular, saldo)); // nessa formatação, posso btar o separador que quiser, por exemplo.

                    linhaScanner.close();

//                    String[] valores = linha.split(",");
//                    System.out.println(valores[3]);
            }
            scanner.close();
    }
}