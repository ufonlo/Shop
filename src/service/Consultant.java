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

        // ����� ������ ���� ������, ����� ��� ������ �����

        return ConsultResult.BUY;
    }

    public void send(){
    }
}