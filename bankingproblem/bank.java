package bankingproblem;
import java.util.ArrayList;

public class bank {
    private ArrayList<customer> customers = new ArrayList<customer>();
    private int numOfCustomers = 0;
    private String bankName;

    public bank (String bName) {
        this.bankName = bName;
    }

    public void addCustomer(String f, String l) {
        customer newCustomer = new customer(f, l);
        this.customers.add(newCustomer);
        numOfCustomers++;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<customer> customers) {
        this.customers = customers;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "bank [bankName=" + bankName + ", customers=" + customers + ", numOfCustomers=" + numOfCustomers + "]";
    }

    

    // public String getBankName() {
    //     return this.bankName;
    // }

    // public int getNumOfCustomers() {
    //     return numOfCustomers;
    // }

    // public customer getCustomer(int index) {
    //     return this.customers.get(index);
    // }
    
    // public String toString() {
    //     String text = this.customers.get(0).getFirstName()+" "+this.customers.get(0).getLastName();
    //     for (int i=1;i<getNumOfCustomers();i++) {
    //         text += ", " + this.customers.get(i).getFirstName() + " " + this.customers.get(i).getLastName();
    //     }
    //     return this.bankName+" - "+text+" - "+this.numOfCustomers;
    // }
    
}
//