package Pc_Mania.Clientes;

import Pc_Mania.Computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    float totalCompra;
    Computador[] compt;
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        compt = new Computador[3];
    }

    public float caculaTotalCompra() {
        for (Computador computador : compt) {
            if (computador != null) {
                totalCompra += computador.getPreco();
            }
        }
        return totalCompra;
    }

    public void setCompt(Computador[] compt) {
        this.compt = compt;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
