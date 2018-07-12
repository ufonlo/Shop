package client;

import goods.Televisor;
import interfaces.Igoods;
import interfaces.Ivisitor;

public abstract class AbstractVisitor implements Ivisitor {

    private String name;

    public AbstractVisitor() {
    }

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(Igoods goods){
        System.out.println("buy "+goods.getName());
    }



    @Override
    public void returnGoods(Igoods goods){

    }

    @Override
    public String getName() {
        return name;
    }
}
