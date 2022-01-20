package hr.tvz.ele.struc.iznimke;

import hr.tvz.ele.struc.iznimke.brojevi.PremaliBrojException;
import hr.tvz.ele.struc.iznimke.brojevi.PrevelikiBrojException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Glavna {

    public static void main(String[] args) {

        Random generator = new Random();

        int slucajniBroj = generator.nextInt(100) + 1;

        Scanner unos = new Scanner(System.in);
        Boolean ponoviUnos = false;

        do {

            ponoviUnos = false;

            System.out.print("Unesite broj: ");

            try {
                Integer uneseniBroj = unos.nextInt();
                //System.out.println("Unijeli ste broj: " + uneseniBroj);

                provjeriBroj(uneseniBroj, slucajniBroj);

            } catch (InputMismatchException ex) {
                ponoviUnos = true;
                unos.nextLine();
                System.out.println("Unijeli ste tekst koji se ne može "
                        + "pretvoriti u broj! Molimo Vas pokušajte ponovno.");
            } catch (PrevelikiBrojException | PremaliBrojException ex) {
                System.out.println(ex.getMessage());
                ponoviUnos = true;
            }
        }while(ponoviUnos);

        System.out.println("Čestitamo, pogodili ste broj " + slucajniBroj);

    }

    private static void provjeriBroj(int uneseniBroj,
                                     int slucajniBroj) throws PremaliBrojException {
        if(uneseniBroj > slucajniBroj) {
            throw new PrevelikiBrojException("Unijeli ste preveliki broj!");
        }
        else if (uneseniBroj < slucajniBroj) {
            throw new PremaliBrojException("Unijeli ste premali broj!");
        }

    }

}
