package avaliacao;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        int op;
        System.out.println("Seja Bem Vindo");

        System.out.println("###ESCOLHA SUA OPERAÇÃO### ");
        System.out.println("[1] - Nilma Pereira");
        System.out.println("[2] - Maria Silvana ");
        System.out.println("[3] - Rosaria Lima ");
        System.out.println("[4] - Joao Ross");
        System.out.println("[5] - Pedro Ribeiro");
        System.out.println("[6] - Silvano Gilberto");
        System.out.println("[7] - Karthus Kimenus ");
        System.out.println("[8] - Olaf Nilde ");
        System.out.println("[9] - Maria Joaquina");
        System.out.println("[10] - Gilberto Olaz");
        System.out.println(">>>>>>>digite aqui seu nome<<<<<<");
        op = ler.nextInt();

        switch (op) {
            case 1:
                Vendedor V1 = new Vendedor("Nilma Pereira", "0829917815", " 40027922");
                V1.setSalario(1100.0);
                V1.setComissao(13.00);
                V1.setQuantVendas(19);
                System.out.println(V1.getDados() + "\n");

            case 2:
                Vendedor V2 = new Vendedor("Maria Silvana", "01777154816", " 44 30548016");
                V2.setSalario(1100.0);
                V2.setComissao(17.00);
                V2.setQuantVendas(34);
                System.out.println(V2.getDados() + "\n");

            case 3:
                Vendedor V3 = new Vendedor("Rosaria Lima", "01777154816", " 45 30548016");
                V3.setSalario(1100.0);
                V3.setComissao(17.00);
                V3.setQuantVendas(34);
                System.out.println(V3.getDados() + "\n");

            case 4:
                Vendedor V4 = new Vendedor("Joao Ross", "018111514815", " 45 30781541");
                V4.setSalario(1100.0);
                V4.setComissao(17.00);
                V4.setQuantVendas(52);
                System.out.println(V4.getDados() + "\n");

            case 5:
                Vendedor V5 = new Vendedor("Pedro Ribeiro", "9977881147", " 44 98457151");
                V5.setSalario(1100.0);
                V5.setComissao(17.00);
                V5.setQuantVendas(8);
                System.out.println(V5.getDados() + "\n");

            case 6:
                Motorista M1 = new Motorista("Silvano Gilberto", "0821785115", " 32994577");
                M1.setSalario(950.0);
                System.out.println(M1.getDados());
                System.out.println(M1.getDados() + "\n");

            case 7:
                Motorista M2 = new Motorista("Karthus Kimenus", "0791686262", " 45 9994577");
                M2.setSalario(1100.0);
                System.out.println(M2.getDados());
                System.out.println(M2.getDados() + "\n");

            case 8:
                Motorista M3 = new Motorista("Olaf Nilde", "0857714485", " 45 914185577");
                M3.setSalario(980.0);
                System.out.println(M3.getDados());
                System.out.println(M3.getDados() + "\n");

            case 9:

                Motorista M4 = new Motorista("Maria Joaquina", "0826171252", " 45 98517144");
                M4.setSalario(1500.0);
                System.out.println(M4.getDados());
                System.out.println(M4.getDados() + "\n");

            case 10:
                Motorista M5 = new Motorista("Gilberto Olaz", "0836677158", " 45 99927922");
                M5.setSalario(1000.0);
                System.out.println(M5.getDados());
        }
    }

}
