package start;

import client.*;
import interfaces.*;
import goods.*;
import bank.*;
import department.*;
import service.*;

public class ShopRunner {
	public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom();// ������� �������� ���

        // ������� �������������� ����� ��������� ����
        Administrator administrator = new Administrator(salesRoom);

        // ������� ��� ������������ (������)
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // ��������� ������������ � �������� ���
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // ��������� ����������� � ������ �����
        Consultant consultant1 = new Consultant("����");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("����");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        // ������� ������ ��� �������
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // ��������� ������ � ������
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        // ������� �����������
        CommonVisitor visitor1 = new CommonVisitor("����");
        VipVisitor vipVisitor1 = new VipVisitor("����", 50);

        // ���� ���������� ������������ �� ������� ������
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buy(televisor);
                break;
            case EXIT:
                break;
        }
    }
}