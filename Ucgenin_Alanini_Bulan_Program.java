import java.util.Scanner;

public class Ucgenin_Alanini_Bulan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, alan, u;

        System.out.println("Üçgenin birinci kenarının uzunluğunu giriniz: ");
        birinciKenar = input.nextDouble();

        System.out.println("Üçgenin ikinci kenarının uzunluğunu giriniz: ");
        ikinciKenar = input.nextDouble();

        System.out.println("Üçgenin üçüncü kenarının uzunluğunu giriniz: ");
        ucuncuKenar = input.nextDouble();

        u= (birinciKenar+ikinciKenar+ucuncuKenar)/2;

        cevre=2*u;
        System.out.println("Üçgenin çevresi: "+cevre);

        alan= Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));
        System.out.println("Üçgenin alanı: "+alan);

    }
}
