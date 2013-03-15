package gestãodespesas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Menu menu1 = new Menu();
        
        int opcao=menu1.menu();
        switch (opcao) {
            case 1:
                RegistoDespesaUI rd = new RegistoDespesaUI();
                double valor=0;
                String descricao="";
                rd.introduzDados(valor,descricao);
                System.exit(0);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Por favor, escolha uma opção disponivel!\n");
                menu1.menu();
        }
    }
}
