package Pc_Mania.helpers;

public class Menu {
    public static void menu(){
        System.out.println("==========================================================================================");
        System.out.println("                                MENU DE PROMOÇÕES - INFORMÁTICA                           ");
        System.out.println("==========================================================================================");
        System.out.printf("%-30s | %-30s | %-30s %n", "PROMOÇÃO 1", "PROMOÇÃO 2", "PROMOÇÃO 3");
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.printf("%-30s | %-30s | %-30s %n", "Marca: Apple", "Marca: Samsung", "Marca: Dell");

        // Preços calculados com base na matrícula 2999
        System.out.printf("%-30s | %-30s | %-30s %n", "Preço: R$ 2.999", "Preço: R$ 4.233", "Preço: R$ 8.677");

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.printf("%-30s | %-30s | %-30s %n", "Pentium Core i3 (2200 Mhz)", "Pentium Core i5 (3370 Mhz)", "Pentium Core i7 (4500 Mhz)");
        System.out.printf("%-30s | %-30s | %-30s %n", "8 Gb de Memória RAM", "16 Gb de Memória RAM", "32 Gb de Memória RAM");
        System.out.printf("%-30s | %-30s | %-30s %n", "500Gb de HD", "1Tb de HD", "2Tb de HD");

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.printf("%-30s | %-30s | %-30s %n", "S.O. macOS Sequoia (64 bits)", "S.O. Windows 8 (64 bits)", "S.O. Windows 10 (64 bits)");

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.printf("%-30s | %-30s | %-30s %n", "Acompanha Pen-drive 16Gb", "Acompanha Pen-drive 32Gb", "Acompanha HD Externo 1Tb");
        System.out.println("==========================================================================================");
    }
}
