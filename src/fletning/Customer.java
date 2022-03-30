package fletning;

public class Customer implements Comparable<Customer> {
    private int alder;
    private String fornavn;
    private String efternavn;

    public Customer(int alder, String fornavn, String efternavn) {
        this.alder = alder;
        this.fornavn = fornavn;
        this.efternavn = efternavn;

    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    @Override
    public int compareTo(Customer customer) {
        int compare = efternavn.compareTo(customer.getEfternavn());
        if (compare == 0){
            compare = fornavn.compareTo(customer.getFornavn());
            if (compare == 0){
                compare = alder - customer.alder;
            }
        }
        return compare;
    }

    @Override
    public String toString() {
        return "fornavn: " + fornavn + " efternavn: " + efternavn + " alder: " + alder;
    }
}
