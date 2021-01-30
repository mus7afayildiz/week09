import java.util.ArrayList;
import java.util.Random;

/*-- OrderedProduct
    + ArrayList <OrderLine>
    + decimal totalPrice */

public class OrderedProduct {
    ArrayList<OrderLine> orderedList;
    private double totalPrice;

    public ArrayList<OrderLine> getOrderedList() {
        return orderedList;
    }

    public void setOrderedList(ArrayList<OrderLine> orderedList) {
        this.orderedList = orderedList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }








}
