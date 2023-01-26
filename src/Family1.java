import java.util.Arrays;

public class Family1 implements Apartment {
    private String[] names;
    private String address;

    public Family1(String[] names, String address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public void kommunalka() {
        System.out.println(Arrays.toString(names) + " платят коммуналку " + names.length +
                " столько человек в семье " + address + " они живут здесь");
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
