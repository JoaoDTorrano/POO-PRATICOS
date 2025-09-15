package loja;

import loja.computador.Computador;
import loja.computador.componentes.HardwareBasico;
import loja.computador.componentes.MemoriaUSB;
import loja.computador.componentes.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Jaun", "345.321.34.12");

        System.out.println("Bem-vindo à PC Mania!");
        int preco_base = 2000;
        float preco1 = preco_base;
        float preco2 = preco_base + 1234;
        float preco3 = preco_base + 5678;

        System.out.println("Nossas promoções imperdíveis:");
        System.out.println("--- Promoção 1 ---");
        System.out.println("Marca: Apple");
        System.out.println("Preço: R$" + preco1);
        System.out.println("Processador: Pentium Core i3 (2200 Mhz)");
        System.out.println("Memória RAM: 8 Gb");
        System.out.println("HD: 500Gb");
        System.out.println("SO: macOS Sequoia (64 bits)");
        System.out.println("Acessório: Pen-drive de 16Gb");
        System.out.println("-----------------");

        System.out.println("--- Promoção 2 ---");
        System.out.println("Marca: Samsung");
        System.out.println("Preço: R$" + preco2);
        System.out.println("Processador: Pentium Core i5 (3370 Mhz)");
        System.out.println("Memória RAM: 16 Gb");
        System.out.println("HD: 1Tb");
        System.out.println("SO: Windows 8 (64 bits)");
        System.out.println("Acessório: Pen-drive de 32Gb");
        System.out.println("-----------------");

        System.out.println("--- Promoção 3 ---");
        System.out.println("Marca: Dell");
        System.out.println("Preco: R$" + preco3);
        System.out.println("Processador: Pentium Core i7 (4500 Mhz)");
        System.out.println("Memória RAM: 32 Gb");
        System.out.println("HD: 2Tb");
        System.out.println("SO: Windows 10 (64 bits)");
        System.out.println("Acessório: HD Externo 1Tb");
        System.out.println("-----------------");

        //--------------------------------------------------------------------------------------------------


        Cliente novoCliente = new Cliente(cliente.getNome(), cliente.getCpf());
        Computador[] pcsComprados = new Computador[10];
        int pcCount = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Qual PC da promoção você gostaria de comprar? (1-3) ou 0 para sair:");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao >= 1 && opcao <= 3) {
                Computador novoPC = null;

                if (opcao == 1) {
                    novoPC = new Computador("Apple", preco1);
                    novoPC.hardwareBasico = new HardwareBasico[3];
                    novoPC.sistemaOperacional = new SistemaOperacional("macOS Sequoia", 64);
                    novoPC.hardwareBasico[0] = new HardwareBasico("Processador Pentium Core i3", 2200);
                    novoPC.hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
                    novoPC.hardwareBasico[2] = new HardwareBasico("HD", 500);
                    novoPC.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
                } else if (opcao == 2) {
                    novoPC = new Computador("Samsung", preco2);
                    novoPC.hardwareBasico = new HardwareBasico[3];
                    novoPC.sistemaOperacional = new SistemaOperacional("Windows 8", 64);
                    novoPC.hardwareBasico[0] = new HardwareBasico("Processador Pentium Core i5", 3370);
                    novoPC.hardwareBasico[1] = new HardwareBasico("Memória RAM", 16);
                    novoPC.hardwareBasico[2] = new HardwareBasico("HD", 1000);
                    novoPC.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                } else if (opcao == 3) {
                    novoPC = new Computador("Dell", preco3);
                    novoPC.hardwareBasico = new HardwareBasico[3];
                    novoPC.sistemaOperacional = new SistemaOperacional("Windows 10", 64);
                    novoPC.hardwareBasico[0] = new HardwareBasico("Processador Pentium Core i7", 4500);
                    novoPC.hardwareBasico[1] = new HardwareBasico("Memória RAM", 32);
                    novoPC.hardwareBasico[2] = new HardwareBasico("HD", 2000);
                    novoPC.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                }

                if (pcCount < pcsComprados.length) {
                    pcsComprados[pcCount] = novoPC;
                    pcCount++;
                    System.out.println("PC adicionado ao seu carrinho!");
                } else {
                    System.out.println("Desculpe, seu carrinho está cheio.");
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida. Por favor, escolha 1, 2, 3 ou 0 para sair.");
            }
        }

        novoCliente.setComputador(pcsComprados);

        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Cliente: " + novoCliente.getNome());
        System.out.println("CPF: " + novoCliente.getCpf());
        System.out.println("--- PCs Comprados ---");

        for (int i = 0; i < pcCount; i++) {
            System.out.println("PC #" + (i + 1));
            pcsComprados[i].mostraPCConfigs();
            System.out.println("--------------------");
        }

        System.out.println("Total da compra: R$" + novoCliente.calculaTotalCompra());

        ProcessarPedido.enviarPedido();

        entrada.close();
    }
}
