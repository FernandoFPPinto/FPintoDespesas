package gestãodespesas;

import java.util.Scanner;

public class Menu {
    
    public Menu(){};
    
    public int menu(){
        int opcao;
        
        Scanner in = new Scanner(System.in);
        System.out.println("MENU INICIAL\n");
        System.out.println("1-Registar Nova Despesa;");
        System.out.println("0-Sair");
        System.out.print("\nA sua opção:");
        opcao = in.nextInt();

        return opcao;
    }
}
