package main.java;

/*
 * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
    1 manav,
    2 sarkuteri,
    3 market
    secime gor ,
    4-urunleri listele ve
    5-fiyatlari gelsin
 *
 * Basrili Market alış-veriş programı.
    1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.
        No   Ürün    Fiyat
         ===== ======= ========
    00 Domates 2.10 TL ,
    01 Patates 3.20 TL ,
    02 Biber 1.50 TL ,
    03 Soğan 2.30 TL  ,
    04 Havuç 3.10 TL
    05 Elma 1.20 TL
    06 Muz 1.90 TL
    07 Çilek 6.10 TL
    08 Kavun 4.30 TL
    09 Üzüm 2.70 TL
    10 Limon 0.50 TL

 *
 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
    * 3. Adım: Kaç kg satın almak istediğini sorunuz.
      4. Adım: Alınacak bu ürünü
 * sepete ekleyiniz ve Sepeti yazdırınız.
     5. Başka bir ürün alıp almak
 * istemediğini sorunuz.
     6. Eğer devam etmek istiyorsa yeniden ürün seçme
 * kısmına yönlendiriniz.
     7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
 * ödeme sonrasında programı bitiriniz


 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Case {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        basket();
    }//main

    public static void basket() {

        Scanner scan = new Scanner(System.in);
        String select = null;
        double kg;
        int idx = 0;
        double price;
        double totalPrice = 0;
        double productTotalPrice = 0;
        String isQuit = null;
        System.out.println("Welcome to the market");
        List<String> ggProducts = new ArrayList<>((Collection) Case.grgProducts());
        List<Double> ggPrices = new ArrayList<>((Collection) Case.prices());

        do {
            System.out.println("Lutfen listeden eklemek istediginiz urunu seciniz...");
            for (int i = 0; i < ggProducts.size(); i++) {
                System.out.println(ggProducts.get(i)+": "+ggPrices+" TL , ");
            }
            System.out.println();

            select = scan.next().toLowerCase().replaceAll("[a-zA-Z]","").trim();

            for (int i = 0; i < ggProducts.size(); i++) {

                if (select.equals(ggProducts.get(i))) {
                idx = i;
                break;
            }

            }

            System.out.println("Kac kg urun alacaginizi giriniz...");
            kg = scan.nextDouble();
            price = ggPrices.get(idx);
            totalPrice += price * kg;
            productTotalPrice = price*kg;
            System.out.printf("%.2f",productTotalPrice);
            System.out.print(" TL\n");
            System.out.printf("Sepet toplami: "+"%.2f",totalPrice);
            System.out.println(" TL"+"\nAlisverisi bitirmek icin 'Q', devam etmek icin herhangi bir tusa basiniz...");
            isQuit=scan.next();
            if (isQuit.equalsIgnoreCase("Q")) {
                break;
            }

        }while (true);
        System.out.printf("Odemeniz gereken tutar: "+"%.2f",totalPrice);
        System.out.println();
        System.out.println("Bizi tercih ettiginiz icin tesekkurler, tekrar bekleriz...");

    }



    public static Object grgProducts() {

        List<String> grgProducts = new ArrayList<>();
        grgProducts.add("tomato");
        grgProducts.add("potato");
        grgProducts.add("pepper");
        grgProducts.add("onion");
        grgProducts.add("carrot");
        grgProducts.add("apple");
        grgProducts.add("banana");
        grgProducts.add("strawberry");
        grgProducts.add("melon");
        grgProducts.add("grape");
        grgProducts.add("lemon");
        return grgProducts;
    }

    public static Object prices() {
        List<Double> grgPrices = new ArrayList<>();
        grgPrices.add(2.10);
        grgPrices.add(3.20);
        grgPrices.add(1.50);
        grgPrices.add(2.30);
        grgPrices.add(3.10);
        grgPrices.add(1.20);
        grgPrices.add(1.90);
        grgPrices.add(6.10);
        grgPrices.add(4.30);
        grgPrices.add(2.70);
        grgPrices.add(0.50);
        return grgPrices;
    }


}
