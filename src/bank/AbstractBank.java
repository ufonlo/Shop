package bank;
import interfaces.Ibank;

public abstract class AbstractBank implements Ibank {

    // количество заявок по всем банкам (можно также реализовать через коллекцию)
    public static int requestCount;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
    }

    private String name;
    private String creditDescription;


    @Override
    public void checkInfo() {
        requestCount++;
    }

    @Override
    public void giveCredit() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
