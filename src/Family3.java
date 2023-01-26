import java.util.Arrays;

public class Family3 implements Hotel{
    private String[]names;
    private String address;

    public Family3(String[] names, String address) {
        this.names = names;
        this.address = address;
    }

    public Family3() {
    }

    @Override
    public void arenda() {
        System.out.println(Arrays.toString(names)+" платят за аренду "+names.length+" столько человек в семье "
                +address+" живут они здесь");
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
