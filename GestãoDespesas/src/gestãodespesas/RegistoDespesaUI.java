package gestãodespesas;

import java.util.Scanner;

public class RegistoDespesaUI {
    
    public RegistoDespesaUI(){};
    
    public void introduzDados(double valor, String descricao){
        RegistoDespesaController rdc = new RegistoDespesaController();
        Scanner in = new Scanner(System.in);
        System.out.println("\nRegisto de Nova Despesa");
        System.out.println("\nIntroduza o valor da despesa:");
        valor=Double.parseDouble(in.nextLine());
        System.out.println("\nIntroduza a descrição da despesa:");
        descricao=in.nextLine();
        rdc.CriarDespesa(valor, descricao);
    }
    
    public boolean DadosValidos(double valor, String descricao){
        if(valor>0){
            return true;
        }
        return false;
    } 
    
}
