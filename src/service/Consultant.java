package service;

import interfaces.Ivisitor;

public class Consultant extends AbstractEmployee {

    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(Ivisitor visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;
    }

    public void send(){
    }
}