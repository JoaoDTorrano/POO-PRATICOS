package loja.computador;

import loja.computador.componentes.HardwareBasico;
import loja.computador.componentes.MemoriaUSB;
import loja.computador.componentes.SistemaOperacional;

public class Computador {
    private String marca;
    private float preco;
    HardwareBasico[] hardwareBasico;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB musb;

    public void setHardwareBasico(HardwareBasico[] hardwareBasico) {
        this.hardwareBasico = hardwareBasico;
    }

    public Computador(String nome, int tipo) {
        sistemaOperacional = new SistemaOperacional(nome, tipo);
        setHardwareBasico(new HardwareBasico[5]);
    }

    public Computador(String nome, float preco) {
        this.marca = nome;
        this.preco = preco;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        for(HardwareBasico hardware : hardwareBasico){
            System.out.println("Tipo de despositivo:");
            System.out.println(hardware.getNome());
            System.out.println("Capacidade do despositivo:");
            System.out.println(hardware.getCapacidade());
        }

        System.out.println("Sistema: " + sistemaOperacional.getNome());
        System.out.println("Tipo: " + sistemaOperacional.getTipo());

        System.out.println("Nome: " + musb.getNome());
        System.out.println("Capacidade: " + musb.getCapacidade());
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
