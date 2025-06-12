package semester2.pertemuan16;

import java.util.ArrayList;

public class DemoArrayList12 {
    ArrayList<customer12> customers = new ArrayList<>(2);

    public static void main(String[] args) {
        DemoArrayList12 demo = new DemoArrayList12();
        demo.printCustomers();
    }

    public DemoArrayList12() {
        ArrayList<customer12> newCustomers = new ArrayList<>();
        newCustomers.add(new customer12(201, "Della"));
        newCustomers.add(new customer12(202, "Bagas"));
        newCustomers.add(new customer12(203, "Gigih"));

        customers.addAll(newCustomers);

        System.out.println(customers);
    }
    public void printCustomers () {
        for (customer12 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
