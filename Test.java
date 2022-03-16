import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double r, alan, cevre,a,daireDilimAlan;
        double pi= 3.14;


        Scanner input = new Scanner(System.in);
        System.out.print("Yari Cap Giriniz:");
        r = input.nextInt();

        System.out.print("Aci Giriniz:");
        a = input.nextInt();

        daireDilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Daire Dilim Alani:"+ daireDilimAlan);





















    }
}
