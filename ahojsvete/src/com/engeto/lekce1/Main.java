package com.engeto.lekce1;


import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // sem už si můžu psát co chci
        System.out.println("Hello world!");
        System.out.println("Můžu použít zkratku. ;) ");

        // Proměnná (variable):
        // DatovyTyp nazevPromenne:

        String item; // Deklaroval jsem textovou proměnnou
        // Vytvořil × deklaroval
        item = "Zrcátko";

        System.out.println(item); // -> Zrcátko

        int numberOfPieces; // integer ... celé číslo
        // Názvy proměnných ~ camelCase
        // První písmeno malé
        // Každé další slovo názvu velkým bez mezery.
        // Nelze: hodnota nebyla inicializována: System.out.println(numberOfPieces);

        numberOfPieces = 10;

        int numberOfStudents = 4;

        char character = 'A', digit = '1', sign = '.';  // jedno písmeno/znak

        boolean isDiscounted = true; // ano/ne

        // Nelze: int booleanAsInteger = false;  // Ctrl+D duplikuje řádek

        int booleanAsInteger;
        if (isDiscounted) {
            booleanAsInteger = 1;
        } else {
            booleanAsInteger = 0;
        }
        ;

        double decimalValue = numberOfStudents;

        numberOfPieces = (int) decimalValue; // Přetypování: v tomto případě „usekne“ desetinnou část

        String text = "Karel Dvořák";
        LocalDate dateOfLesson = LocalDate.of(2022, 1, 31);
        System.out.println(dateOfLesson); // Klidně pište dlouhé názvy proměnných.

        // 1/3 = 1,3333333
        // 1/10 = 0,1  => ve dvojkové soustavě je periodické

        BigDecimal pricePerPiece = BigDecimal.valueOf(0.1);

        double price = 0.1;
        for (int i = 0; i < 10; i++) {
            // price = price + 0.1;
            price += 0.1;
        }
        System.out.println(price);

        BigDecimal price1 = BigDecimal.valueOf(0.1);
        for (int i = 0; i < 10; i++) {
            price1 = price1.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(price1);

        int cislo;
        Integer cisloObjektove;

        double totalPrice = price * numberOfPieces;
        double pricePerItem = totalPrice / numberOfPieces;

        BigDecimal totalPriceAsBigDecimal
                = price1.multiply(BigDecimal.valueOf(numberOfPieces));

        String message =
                "Celková cena: " + totalPriceAsBigDecimal + " Kč";
        System.out.println(message);
    }
}