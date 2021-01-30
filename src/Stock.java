import java.time.LocalDate;

/*--- Stock
   + ArrayList <Procduct> totalProducts
   + Stock'ta Satis icin 10 farkli urun bulunacaktir ve urun sayisi 1 ile 10 arasinda random olarak belrlenecektir.  */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Stock {
    ArrayList<Product> totalProducts;
    Random random =new Random();


    public void product (){
        Product product1 = new Product("biskuvi",3,productQuantity(),LocalDate.now());
        Product product2 = new Product("cikolata",2,productQuantity(),LocalDate.now());
        Product product3 = new Product("seker",3,productQuantity(),LocalDate.now());
        Product product4 = new Product("sut",2,productQuantity(),LocalDate.now());
        Product product5 = new Product("ciklet",1,productQuantity(),LocalDate.now());
        Product product6 = new Product("su",1,productQuantity(),LocalDate.now());
        Product product7 = new Product("cay",1,productQuantity(),LocalDate.now());
        Product product8 = new Product("gazoz",2,productQuantity(),LocalDate.now());
        Product product9 = new Product("dondurma",3,productQuantity(),LocalDate.now());
        Product product10 = new Product("un",1,productQuantity(),LocalDate.now());

        totalProducts = new ArrayList<Product>();
        totalProducts.add(product1);
        totalProducts.add(product2);
        totalProducts.add(product3);
        totalProducts.add(product4);
        totalProducts.add(product5);
        totalProducts.add(product6);
        totalProducts.add(product7);
        totalProducts.add(product8);
        totalProducts.add(product9);
        totalProducts.add(product10);


        Iterator itr=totalProducts.iterator();

        while(itr.hasNext()){
            Product st=(Product)itr.next();
            System.out.println(st.getProductName()+" "+st.getProductPrice()+" "+st.getStockVolume()+" "+st.getCreateDate());
        }

    }

    public int productQuantity(){

        OrderLine productQuantity = new OrderLine();
        productQuantity.setProductQuantity(random.nextInt(10));
        return productQuantity.getProductQuantity();

    }


}
