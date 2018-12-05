
package Aluguel;

import Veiculos.Automoveis;
import javax.swing.JOptionPane;





public class Aluguel {
   
    private String nome,aprovacao;
    private int habilitacao,prazodealuguel;
    String data;

   
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }
    


    public int getPrazodealuguel() {
        return prazodealuguel;
    }

    public void setPrazodealuguel(int prazodealuguel) {
        this.prazodealuguel = prazodealuguel;
    }

    public int getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(int habilitacao) {
        
        this.habilitacao = habilitacao;
    }
    public boolean solicitacao (boolean solicitacao){
         String aux;
        int dia,mes,ano,total,hoje;
       aux=JOptionPane.showInputDialog(null,"digite o dia de vencimento da habilitação");
        dia=Integer.parseInt(aux);
       aux=JOptionPane.showInputDialog(null,"digite o mes de vencimento da habilitação");
        mes=Integer.parseInt(aux);  
       
       aux=JOptionPane.showInputDialog(null,"digite o ano de vencimento da habilitação");
        ano=Integer.parseInt(aux);
      
        total=ano*365+mes*30+dia;
        hoje=2018*365+12*30+5;
        hoje=hoje+this.getPrazodealuguel();
        if(total<hoje){
             this.setAprovacao("Não autorizada");
            return false;
           
        }else 
            this.setAprovacao("Aprovado");
            return true;
        
    }
     public boolean revisao(boolean revisao){
        int aux;
        Automoveis auto = new Automoveis ();
      aux=  getPrazodealuguel();
        if (auto.getKa()+auto.getKm()*aux<2000){
            return true;
        }else 
           
      JOptionPane.showMessageDialog(null,"revisao nescessaria");
    return false;
     }     
    /* public void  entrega (){
         
         
         System.out.println("devolução prevista "+ data);
         
         
         
     }*/
    

    @Override
    public String toString() {
        return "Aluguel: " +"\n"+ "nome= " + nome + "/ prazo do aluguel(dias) = " + prazodealuguel + "/ habilitacao= " + habilitacao + " / situação do pedido: "+ this.getAprovacao() ;
    }
    
}
