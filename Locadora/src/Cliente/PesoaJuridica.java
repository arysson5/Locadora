
package Cliente;

public class PesoaJuridica extends Cliente {
    private String nome;
    private int cnpj;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return"Clientes cadastrados: "+ "Pesoa Juridica" + "/ nome= " + nome + "/ cnpj=" + cnpj;
    }
    
    
}
