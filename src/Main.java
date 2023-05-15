import java.util.ArrayList;
import java.util.List;

public class Main {

  // модификатор static
  // методы hashCode() и equals()
  public static void main(String[] args) {

    List<Order> s= new ArrayList<>();

    s.add(new Order("1","er","John Smith","5667",10));
    s.add(new Order("2","er","Anna Smith","2468",20));
    s.add(new Order("3","er","Monika Smith","5545",30));
    System.out.println(s  );
    System.out.println("\nTotal Prise of orders: "+Order.getTotalSum(s));
    System.out.println("Total sum of orders: "+Order.sumOfOrders(s));



  }
}