
package Veiculos;

public class CaminhaoCarga extends Veiculo {
    private double cc;

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Tipo: Caminhao de Carga" + "capacidade de carga= " + this.getCc() ;
    }
    
    
}
