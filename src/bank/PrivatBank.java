package bank;

public class PrivatBank extends AbstractBank {

    public PrivatBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        // доработанная реализация
    }
}
