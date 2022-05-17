package bankingproblem;
public class customer {
    private String firstName;
    private String lastName;
    private account account;

    public customer (String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public account getAccount() {
        return account;
    }

    public void setAccount(account newAccount) {
        this.account = newAccount;
    }

    @Override
    public String toString() {
        return "Welcome Mr/Ms " + firstName + " " + lastName + "\nAccount=" + account;
    }

}
