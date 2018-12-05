
package Veiculos;
import Aluguel.Aluguel;

public class Automoveis extends Veiculo {
    private String tamanho,acessorios,tipo;
    private int passageiros,portas;
    private double km,ka;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getKa() {
        return ka;
    }

    public void setKa(double ka) {
        this.ka = ka;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
     @Override
    public String toString() {
        return "Automovel " + " tamanho= " + tamanho + "\n"+ ", acessorios= " + acessorios + ", tipo= " + tipo + " numero de passageiros= " + passageiros + " numero de portas portas= " + portas ;
    }
    
    public void  p3(){
    this.setTipo("p3");
    this.setPassageiros(4);
    this.setPortas(4);
    this.setAcessorios("som,ar condicionado");
    this.setTamanho("pegueno");
    this.setKm(50.0);
    
    toString ();
}
    public void g4 (){
        this.setTipo("g4");
        this.setPassageiros(5);
        this.setTamanho("pequeno");
        this.setPortas(4);
        this.setAcessorios("Radio,Ar condicionado,direção hidraulica, cambio automatico");
        this.setKm(100.00);
        toString ();
        
    }
    public void pirua (){
         this.setTipo("pirua");
        this.setPassageiros(20);
        this.setTamanho("medio");
        this.setPortas(4);
        this.setAcessorios("Radio,Ar condicionado, cambio automatico");
        this.setKm(150.00);
        toString ();
    }
   
        
    }

   
    
}
