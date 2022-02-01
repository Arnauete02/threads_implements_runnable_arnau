package com.company.exercici1;

import com.company.exercici1.Llibreries.Pantalles.MenuConstructorPantalla;

import java.io.IOException;
import java.util.Scanner;

public class PAU_487 {

    public static void menuPAU_487() throws IOException {
        String opcio;
        StringBuilder menu = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        do {
            menu.delete(0, menu.length());

            menu.append(System.getProperty("line.separator"));
            menu.append("PNS-24 Puma");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("1. Threads implements Runnable");
            menu.append(System.getProperty("line.separator"));
            menu.append("2. ");
            menu.append(System.getProperty("line.separator"));
            menu.append("3. ");
            menu.append(System.getProperty("line.separator"));
            menu.append("4. ");
            menu.append(System.getProperty("line.separator"));
            menu.append("5. ");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("50. Tornar al menu pare (PNS-24 Puma)");
            menu.append(System.getProperty("line.separator"));

            System.out.print(MenuConstructorPantalla.constructorPantalla(menu));

            opcio = sc.next();

            switch (opcio) {
                case "1":

                    bloquejarPantalla();
                    break;
                case "50":
                    PNS24_Puma.menuPNS24Puma();
                    break;
                default:
                    System.out.println("COMANDA NO RECONEGUDA");
            }
        } while (!opcio.equals("50"));
    }

    public static void bloquejarPantalla() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nToca 'C' per a continuar ");
        while (in.hasNext()) {
            if ("C".equalsIgnoreCase(in.next())) break;
        }
    }

}
