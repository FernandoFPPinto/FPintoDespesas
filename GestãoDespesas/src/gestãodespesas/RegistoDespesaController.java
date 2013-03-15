package gestãodespesas;

public class RegistoDespesaController {
    
    private RepositórioDespesas rd;
    
    private RegistoDespesaUI rdui;
    
    public void CriarDespesa(double valor, String descricao){
        /*if(rdui.DadosValidos(valor,descricao)==true){
            Despesa d=new Despesa(valor,descricao);
            System.out.println("\nDespesa criada com sucesso!\n");
            rd.AdicionarDespesa(d);
        }else{
            System.out.println("Dados Inválidos!\n");
        }*/
        Despesa d=new Despesa(valor,descricao);
        System.out.println("\nDespesa criada com sucesso!\n");
        rd.AdicionarDespesa(d);
    };
    
}
