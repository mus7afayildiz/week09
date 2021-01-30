import java.time.LocalDate;

/*
Bu hafta Rauf Bey'e online satış sitesi icin gerekli olan Backend programini yazacagiz. Marketteki urunler, satin alinan urunlerin toplam adet ve fiyatlarini gosteren bir uygulama olacak.

Bu programda gerekli olan classlar ve story asagida belirlenmistir.

Classlar:
-- Main
   + OnlineSale Class'ini yonetir.*/

public class Main {


    public static void main(String[] args) {
        Stock stock = new Stock();
        Product product= new Product();
        stock.product ();
        stock.productQuantity();
        System.out.println("kjvdjhvdj :"+stock.productQuantity());


    }
}
