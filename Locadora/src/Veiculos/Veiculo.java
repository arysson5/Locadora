
package Veiculos;

public abstract class Veiculo {
private String placa,cor;
private int nmchassi,nmmotor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNmchassi() {
        return nmchassi;
    }

    public void setNmchassi(int nmchassi) {
        this.nmchassi = nmchassi;
    }

    public int getNmmotor() {
        return nmmotor;
    }

    public void setNmmotor(int nmmotor) {
        this.nmmotor = nmmotor;
    }
    public boolean revisao (int revisao){
        if (revisao==1){
        return true;    
        }else 
            return false;
        
        
    }

    
}
