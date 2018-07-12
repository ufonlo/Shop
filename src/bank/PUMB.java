package bank;

public class PUMB extends AbstractBank {



    public PUMB(String name, String creditDescription) {
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



    public void checkInfo(boolean critical){

    }
}
