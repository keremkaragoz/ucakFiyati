import java.util.Scanner;

public class ucakFiyati {
    public static void main(String[] args) {
        int km,yas,tur;
        double yasi1 = 0.50,yasi2 =0.10,yasi3=0.30,gdindirim = 0.20,normalfiyat,yasindirim1;
        double toplam,yasindirim2,yasindirim3,gdtoplm,toplam1;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Mesafeyi KM T�r�nden Giriniz: ");
        km = girdi.nextInt();

        System.out.print("L�tfen Ya��n�z� Girinizi: ");
        yas = girdi.nextInt();

        System.out.println("L�tfen Yolculuk T�r�n� Se�iniz:\n1-) Tek Y�n\n2-) Gidi�-D�n��");
        tur = girdi.nextInt();

        normalfiyat = km * 0.10;
        if ( km <1 || yas <0){
            System.out.print("Hatal� ve Eksik bilgi girdiniz.Tekrar deneyiniz!!! :  ");}
        else if (km>1 && tur ==1){
            if (yas >0 && yas < 12 ){
                toplam = normalfiyat /2;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 12 && yas <= 24){
                toplam = normalfiyat * 9/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 25 && yas <= 65){
                toplam = normalfiyat;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 66){
                toplam = normalfiyat * 7/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}}



        else if (km>1 && tur ==2){
            if (yas >0 && yas < 12 ){
                toplam1 = normalfiyat /2;
                toplam = toplam1 *8/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 12 && yas <= 24){
                toplam1 = normalfiyat * 9/10;
                toplam = toplam1 *8/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 25 && yas <= 65){
                toplam1 = normalfiyat;
                toplam = toplam1 *8/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}
            else if (yas >= 66){
                toplam1 = normalfiyat * 7/10;
                toplam = toplam1 *8/10;
                System.out.print("U�ak Bileti fiyat� : "+ toplam);}}

    }
}
