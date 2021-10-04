package pkg;

import java.util.Arrays;

public class Main {

    //Načtěte celočíselnou hodnotu -> pomocí konstrukce 'switch' vyberte odpovídající měsíc
    //(např.: 1 -> Leden, 2 - Únor, etc..) a vypište (pokud je hodnota mimo rozsah, vypište "Neplatná hodnota")
    private String numToMonth(int index) {
        String result = "";
        if (index < 1 || index > 12) result = "Invalid index";
        else {
            switch (index) {
                case 1: result =  "Jan"; break;
                case 2: result =  "Feb"; break;
                case 3: result =  "Mar"; break;
                case 4: result =  "Apr"; break;
                case 5: result =  "May"; break;
                case 6: result =  "Jun"; break;
                case 7: result =  "Jul"; break;
                case 8: result =  "Aug"; break;
                case 9: result =  "Sep"; break;
                case 10: result =  "Oct"; break;
                case 11: result =  "Nov"; break;
                case 12: result =  "Dec"; break;
            }
        }
        return result;
    }

    //Vypočet faktoriálu vámi zadaného čísla. Výsledek vypiště.
    //- Řeště pomocí 'for' cyklu

    private int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++)
            result *= i;
        return result;
    }

    //Proveďte celočíselné dělení vámi zadného dělence a dělitele.
    //- Řeště pomocí 'while' cyklu

    private int[] integerDiv(int divident, int divisor) {
        int result = 0;
        int remainder = divident;
        while (remainder >= divisor) {
            result++;
            remainder -= divisor;
        }
        return new int[]{result, remainder};
    }

    //Najdětě největšího společného dělitele dvou čísel
    //- Řešte pomocí 'do while' cyklu
    private int grtstComnDivisor(int num1, int num2) {
        int divisor = Math.min(num1, num2);
        do {
            --divisor;
        } while (!(num1 % divisor == 0 && num2 % divisor == 0));
        return divisor;
    }

    private Main() {
        System.out.println(numToMonth(5));
        System.out.println(factorial(4));
        System.out.println(Arrays.toString(integerDiv(25, 5)));
        System.out.println(grtstComnDivisor(27, 36));
    }

    public static void main(String[] args) {
        new Main();
    }
}
