package loja;

import loja.computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    Computador[] computador;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setComputador(Computador[] computador) {
        this.computador = computador;
    }

    public Cliente() {
        setComputador(new Computador[3]);
    }

    public float calculaTotalCompra(){
        float totalDacompra = 0;
        for (Computador total : computador) {
            if (total != null) {
                totalDacompra += total.getPreco();
            }
        }
        return totalDacompra;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}