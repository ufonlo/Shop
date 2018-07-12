package client;

import interfaces.Igoods;

public class VipVisitor extends AbstractVisitor {

    public VipVisitor(float discount) {
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    // private String name; 
    private float discount;

    @Override
    public void buy(Igoods goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            // купить со скидкой
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }
}
