
package Cliente;

public class PessoaFisica extends Cliente{
    private String dn,sexo;
    private int cpf;
     

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  

    @Override
    public String toString() {
        return "Pessoa Fisica " + "data de nascimento=" + dn + " cpf= " + cpf + " sexo= " + sexo ;
    }
    
    
}
