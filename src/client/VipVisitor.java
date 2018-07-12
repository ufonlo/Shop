package client;

import interfaces.GoodsInterface;

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
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            // ������ �� �������
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }
}
