import java.util.Scanner;

public class ProvaUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                          
        // Requisito 1
    System.out.println("Informe seu nome: ");
    String nome = scanner.nextLine();

    // Requisito 2
    System.out.println("\nInforme seu peso em kg: ");
    int peso = scanner.nextInt();

    // Requisito 3
    System.out.println("\nInforme a quantidade de água ingerida hoje em Litros: ");
    double liquido = scanner.nextDouble();

    // Requisito 4
    double quantidadeIdeal = Math.ceil(peso * 35) / 1000;
    
    // Requisito 5
    double quantoFalta = quantidadeIdeal - liquido;

    // Requisito 6
    System.out.println("Funcionário: " + nome);
   
    // Requisito 7
    System.out.printf("\nPesando: " + peso);
   
    // Requisito 8
    System.out.printf("\nIngeriu o total de: " + liquido + " Litros");
    
    // Requisito 9
    System.out.printf("\nSua quantidade ideal de água a ser ingerida é: " + quantidadeIdeal + " Litros");

    // Requisito 10
    if (quantoFalta <= 0) {
        System.out.println("\nParabéns, você atingiu a meta de hidratação diária!");
    } 
    else {
        System.out.printf("\nContinue focado em se hidratar por hoje, ainda faltam: %.2f Litros! Você consegue!", quantoFalta);

    }
    scanner.close();
    }
}