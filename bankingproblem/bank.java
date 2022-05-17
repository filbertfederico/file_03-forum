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

    

    
    
}
//