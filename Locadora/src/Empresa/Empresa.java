
package Empresa;
import Aluguel.Aluguel;

public class Empresa {
    private int veiculos,alugados;
    private String devolucao;

    public int getAlugados() {
        return alugados;
    }

    public void setAlugados(int alugados) {
        this.alugados = alugados;
    }
    

    public int getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(int veiculos) {
        this.veiculos = veiculos;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public String toString() {
        return "dados da Empresa" + " veiculos= " + veiculos + " / alugados= " + alugados + " / devolucao= " + devolucao ;
    }
    
    
   
    
}
