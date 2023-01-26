import java.util.Arrays;

public class Family2 implements Hostel{
   private String[]names;
   private String address;

    public Family2(String[] names,String address) {
        this.names = names;
        this.address=address;
    }

    public Family2() {
    }

    @Override
    public void arenda() {
        System.out.println(Arrays.toString(names) +" платят за аренду "+names.length+" столько людей в семье "+
                address +" живут они здесь");
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
