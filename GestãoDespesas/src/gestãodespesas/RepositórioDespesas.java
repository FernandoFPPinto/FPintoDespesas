package gestãodespesas;

import java.util.ArrayList;

public class RepositórioDespesas {
    
    private ArrayList<Despesa> despesas = new ArrayList<Despesa>();
    
    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    public void AdicionarDespesa(Despesa d){
        this.despesas.add(d);
        System.out.println("\nDespesa adicionada ao Repositório de Despesas!");
    }
    
}
