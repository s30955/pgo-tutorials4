public class Address {

        private String kraj;
        private String miasto;
        private String kodPocztowy;
        private String ulica;
        private String numerZamieszkania;


        private Address (String kraj, String miasto, String kodPocztowy, String ulica, String numerZamieszkania) {
            this.kraj = kraj;
            this.miasto = miasto;
            this.kodPocztowy = kodPocztowy;
            this.ulica = ulica;
            this.numerZamieszkania = numerZamieszkania;
        }

        public static Address createAddress(String kraj){
            return new Address(kraj, null, null, null, null);
        }

        public static Address createAddress(String kraj, String miasto){
        return new Address(kraj, miasto, null, null, null);
        }

        public static Address createAddress(String kraj, String miasto, String kodPocztowy){
        return new Address(kraj, miasto, kodPocztowy, null, null);
        }

        public static Address createAddress(String kraj, String miasto, String kodPocztowy, String ulica){
            return new Address(kraj, miasto, kodPocztowy, ulica, null);
        }

        public static Address createAddress(String kraj, String miasto, String kodPocztowy, String ulica, String numerZamieszkania){
        return new Address(kraj, miasto, kodPocztowy, ulica, numerZamieszkania);
    }

}
