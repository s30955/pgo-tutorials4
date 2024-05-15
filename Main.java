//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Address address1 = Address.createAddress("Polska");
            Address address2 = Address.createAddress("Polska", "Warszawa");
            Address address3 = Address.createAddress("Polska", "Warszawa", "02-008");
            Address address4 = Address.createAddress("Polska", "Warszawa", "02-008", "Koszykowa");
            Address address5 = Address.createAddress("Polska", "Warszawa", "02-008", "Koszykowa", "86");

            System.out.println(address1);
            System.out.println(address2);
            System.out.println(address3);
            System.out.println(address4);
            System.out.println(address5);
        }

}
