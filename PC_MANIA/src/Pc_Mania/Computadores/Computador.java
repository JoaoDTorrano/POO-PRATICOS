package Pc_Mania.Computadores;

import Pc_Mania.Computadores.Componentes.HardwareBasico;
import Pc_Mania.Computadores.Componentes.MemoriaUSB;
import Pc_Mania.Computadores.Componentes.SisteOP.SistemaOperacional;

public class Computador {
    private String marca;
    private float preco;
    MemoriaUSB memoria = new MemoriaUSB();
    HardwareBasico[] hardware;
    SistemaOperacional sistemaop;

    public Computador(){
        hardware = new HardwareBasico[3];
        sistemaop = new SistemaOperacional();
    }


    public void mostraPCConfig(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Marca: "+ marca);
        System.out.println("Preco: R$ "+ preco);
        System.out.println("Configurações");
        System.out.println(hardware[0].getNome() + " " + "(" + hardware[0].getCapacidade() + " Mhz)");
        System.out.println(hardware[1].getNome() + " de " + hardware[1].getCapacidade() + " Gb");
        System.out.println(hardware[2].getNome() + " de " + hardware[2].getCapacidade() + " Gb");
        System.out.println("Sistema Operacional " + sistemaop.getNome() + " " + "(" + sistemaop.getTipo() + " bits)");
        System.out.println("Acompanha " + memoria.getNome() + " de " + memoria.getCapacidade() + " Gb");
        System.out.println("------------------------------------------------------------------------------------------");
    }


    public void setSistemaop(SistemaOperacional sistemaop) {
        this.sistemaop = sistemaop;
    }

    public void setHardware(HardwareBasico[] hardware) {
        this.hardware = hardware;
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        memoria = musb;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }
}
