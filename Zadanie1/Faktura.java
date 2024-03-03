public class Faktura {
    static double vat8=0;
    static double vat23=0;
    static double pozycja8=0;
    static double pozycja23=0;
    

    public static double suma_netto(Pozycja[] p1){
        double suma=0;
        for(Pozycja p : p1){
            suma+=p.getWartosc_netto();
        }
        return suma;
    }

    public static void sumy_stawek(Pozycja[] p1){
        vat8=0;
        vat23=0;
        pozycja8=0;
        pozycja23=0;
        for(Pozycja p : p1){
            if(p.getVat()==8){
                vat8+=p.getWartosc_netto()*0.08;
                pozycja8+=p.getWartosc_netto();
            }
            else if(p.getVat()==23){
                vat23+=p.getWartosc_netto()*0.23;
                pozycja23+=p.getWartosc_netto();
            }
        }
        System.out.println("Vat23="+vat23);
        System.out.println("Vat8="+vat8);
    }

    public static void drukuj_podsumowanie(Pozycja[] p1){
        double suma_netto=suma_netto(p1);
        sumy_stawek(p1);

        System.out.printf("|               |  Total netto   | %10.2f     |%n",suma_netto);
        System.out.printf("|---------------|----------------|----------------|%n");
        System.out.printf("| VAT 8%%        | %10.2f     | %10.2f     |%n",vat8,pozycja8);
        System.out.printf("| VAT 23%%       | %10.2f     | %10.2f     |%n",vat23,pozycja23);
    }




    public static void main(String[] args) {

        Pozycja[] p1 = {
            new Pozycja("Clean Code, Robert C. Martin", 100, 8),
            new Pozycja("Applying UML and Patterns, C. Larman", 300, 8),
            new Pozycja("Shipping", 50, 23)
        };

        /*System.out.println(Faktura.suma_netto(p1));
        Faktura.sumy_stawek(p1);*/

        Faktura.drukuj_podsumowanie(p1);
    }
}
