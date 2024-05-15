import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Multiplier multiplier = new Multiplier();
        int wynik1 = multiplier.multiply(4, 8);
        System.out.println("Wynik to: "+ wynik1);

        Multiplier multiplier1 = new Multiplier();
        int wynik2 = multiplier.multiply(4, 8, 7, 9);
        System.out.println("Wynik to: "+ wynik2);

        Multiplier multiplier2 = new Multiplier();
        double wynik3 = multiplier2.multiply(1.7, 8.9);
        System.out.println("Wynik to: "+ wynik3);

        Multiplier multiplier3 = new Multiplier();
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("20.9");
        BigDecimal wynik3 = multiplier3.multiply(num1, num2 );
        System.out.println("Wynik to: "+ wynik3);

        Multiplier multiplier4 = new Multiplier();
        List<Integer> integers = List.of(1, 2, 3, 4);
        int wynik4 = multiplier4.multiply(integers);
        System.out.println("Wynik mnożenia: " + wynik4);
    }

    }

    }

