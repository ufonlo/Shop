package service;

import interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {

    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // ����� ������ ���� ������, ����� ��� ������ �����

        return ConsultResult.BUY;
    }

    public void send(){
    }
}