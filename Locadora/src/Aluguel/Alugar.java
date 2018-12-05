
package Aluguel;

import Veiculos.Automoveis;
import Cliente.PesoaJuridica;


public class Alugar {
    public static void main(String[] args) {
        Aluguel alu = new Aluguel ();
        alu.setNome("roberval medeiros");
        alu.setHabilitacao(26654878);
        alu.setPrazodealuguel(40);
        alu.solicitacao(false);
        System.out.println(""+   alu.toString());
        
        PesoaJuridica pj = new PesoaJuridica();
        pj.setNome("accentury");
        pj.setCodigo(12);
        pj.setCnpj(4899952);
        
        
        
        Automoveis auto = new Automoveis ();
        auto.setCor("AZUL");
        auto.setNmchassi(524878668);
        auto.setNmmotor(24565464);
        auto.setPlaca("nfs8596");
        auto.setKa(50.0);
        auto.g4();
         System.out.println("Informações tecnicas: " + "cor "+ auto.getCor() + " placa "+ auto.getPlaca()
         + " chassi " +auto.getNmchassi()+ " motor: "+auto.getNmmotor());
        System.out.println("Informações do veiculo"+auto.toString());
       
        
    }
    
}
