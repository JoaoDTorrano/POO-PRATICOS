package Pc_Mania;

import Pc_Mania.Clientes.Cliente;
import Pc_Mania.Computadores.Componentes.HardwareBasico;
import Pc_Mania.Computadores.Componentes.MemoriaUSB;
import Pc_Mania.Computadores.Componentes.SisteOP.SistemaOperacional;
import Pc_Mania.Computadores.Computador;
import Pc_Mania.helpers.Menu;
import Pc_Mania.helpers.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Jadson", "203.134.352.23");
        Computador[] comp = new Computador[3];
        comp[0] = new Computador();
        comp[1] = new Computador();
        comp[2] = new Computador();
        MemoriaUSB musb1 = new MemoriaUSB();
        MemoriaUSB musb2 = new MemoriaUSB();
        MemoriaUSB musb3 = new MemoriaUSB();
        HardwareBasico[] hardware1 = new HardwareBasico[3];
        hardware1[0] = new HardwareBasico();
        hardware1[1] = new HardwareBasico();
        hardware1[2] = new HardwareBasico();
        HardwareBasico[] hardware2 = new HardwareBasico[3];
        hardware2[0] = new HardwareBasico();
        hardware2[1] = new HardwareBasico();
        hardware2[2] = new HardwareBasico();
        HardwareBasico[] hardware3 = new HardwareBasico[3];
        hardware3[0] = new HardwareBasico();
        hardware3[1] = new HardwareBasico();
        hardware3[2] = new HardwareBasico();
        SistemaOperacional sistemaop1 = new SistemaOperacional();
        SistemaOperacional sistemaop2 = new SistemaOperacional();
        SistemaOperacional sistemaop3 = new SistemaOperacional();

        Menu.menu();

        System.out.println("Qual promoção deseja levar hoje?");
        int promo = entrada.nextInt();
        if(promo == 1){
            comp[0].setMarca("Apple");
            comp[0].setPreco(2999.99F);
            hardware1[0].setNome("Pentium Core i3");
            hardware1[0].setCapacidade(2200);
            hardware1[1].setNome("Memória RAM");
            hardware1[1].setCapacidade(8);
            hardware1[2].setNome("HD");
            hardware1[2].setCapacidade(500);
            comp[0].setHardware(hardware1);
            sistemaop1.setNome("macOS Sequoia");
            sistemaop1.setTipo(64);
            comp[0].setSistemaop(sistemaop1);
            musb1.setNome("Pen-drive");
            musb1.setCapacidade(16);
            comp[0].addMemoriaUSB(musb1);
            cliente.setCompt(comp);
            ProcessarPedido.processaPedido(comp);
        }
        else if(promo == 2){
            comp[1].setMarca("Samsung");
            comp[1].setPreco(comp[0].getPreco() + 1234);
            hardware2[0].setNome("Pentium Core i5");
            hardware2[0].setCapacidade(3370);
            hardware2[1].setNome("Memória RAM");
            hardware2[1].setCapacidade(16);
            hardware2[2].setNome("HD");
            hardware2[2].setCapacidade(1000);
            comp[1].setHardware(hardware2);
            sistemaop2.setNome("Windows 8");
            sistemaop2.setTipo(64);
            comp[1].setSistemaop(sistemaop2);
            musb2.setNome("Pen-drive");
            musb2.setCapacidade(32);
            comp[1].addMemoriaUSB(musb2);
            cliente.setCompt(comp);
            ProcessarPedido.processaPedido(comp);
        }
        else if(promo == 3){
            comp[2].setMarca("Dell");
            comp[2].setPreco(comp[0].getPreco() + 5678);
            hardware3[0].setNome("Pentium Core i7");
            hardware3[0].setCapacidade(4500);
            hardware3[1].setNome("Memória RAM");
            hardware3[1].setCapacidade(32);
            hardware3[2].setNome("HD");
            hardware3[2].setCapacidade(2000);
            comp[2].setHardware(hardware3);
            sistemaop3.setNome("Windows 10");
            sistemaop3.setTipo(64);
            comp[2].setSistemaop(sistemaop3);
            musb3.setNome("HD externo");
            musb3.setCapacidade(1000);
            comp[2].addMemoriaUSB(musb3);
            cliente.setCompt(comp);
            ProcessarPedido.processaPedido(comp);
        }

        do{
            System.out.println("Deseja levar outra promoção? Se sim qual deseja levar se não apenas digite 0");
            promo = entrada.nextInt();

            if(promo == 1){
                comp[0].setMarca("Apple");
                comp[0].setPreco(2999.99F);
                hardware1[0].setNome("Pentium Core i3");
                hardware1[0].setCapacidade(2200);
                hardware1[1].setNome("Memória RAM");
                hardware1[1].setCapacidade(8);
                hardware1[2].setNome("HD");
                hardware1[2].setCapacidade(500);
                comp[0].setHardware(hardware1);
                sistemaop1.setNome("macOS Sequoia");
                sistemaop1.setTipo(64);
                comp[0].setSistemaop(sistemaop1);
                musb1.setNome("Pen-drive");
                musb1.setCapacidade(16);
                comp[0].addMemoriaUSB(musb1);
                cliente.setCompt(comp);
                ProcessarPedido.processaPedido(comp);
            }
            else if(promo == 2){
                comp[1].setMarca("Samsung");
                comp[1].setPreco(comp[0].getPreco() + 1234);
                hardware2[0].setNome("Pentium Core i5");
                hardware2[0].setCapacidade(3370);
                hardware2[1].setNome("Memória RAM");
                hardware2[1].setCapacidade(16);
                hardware2[2].setNome("HD");
                hardware2[2].setCapacidade(1000);
                comp[1].setHardware(hardware2);
                sistemaop2.setNome("Windows 8");
                sistemaop2.setTipo(64);
                comp[1].setSistemaop(sistemaop2);
                musb2.setNome("Pen-drive");
                musb2.setCapacidade(32);
                comp[1].addMemoriaUSB(musb2);
                cliente.setCompt(comp);
                ProcessarPedido.processaPedido(comp);
            }
            else if(promo == 3){
                comp[2].setMarca("Dell");
                comp[2].setPreco(comp[0].getPreco() + 5678);
                hardware3[0].setNome("Pentium Core i7");
                hardware3[0].setCapacidade(4500);
                hardware3[1].setNome("Memória RAM");
                hardware3[1].setCapacidade(32);
                hardware3[2].setNome("HD");
                hardware3[2].setCapacidade(2000);
                comp[2].setHardware(hardware3);
                sistemaop3.setNome("Windows 10");
                sistemaop3.setTipo(64);
                comp[2].setSistemaop(sistemaop3);
                musb3.setNome("HD externo");
                musb3.setCapacidade(1000);
                comp[2].addMemoriaUSB(musb3);
                cliente.setCompt(comp);
                ProcessarPedido.processaPedido(comp);
            }
        }while(promo != 0);


        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF " + cliente.getCpf());
        System.out.println("Promoções escolhidas: ");

        if(comp[0].getMarca() != null){
            System.out.println("Promoção 1:");
            comp[0].mostraPCConfig();
        }
        if(comp[1].getMarca() != null){
            System.out.println("Promoção 2:");
            comp[1].mostraPCConfig();
        }
        if(comp[2].getMarca() != null){
            System.out.println("Promoção 3:");
            comp[2].mostraPCConfig();
        }

        System.out.println("Total a pagar: R$ " + cliente.caculaTotalCompra());

        entrada.close();
    }
}
