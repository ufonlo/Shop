package department;
import java.util.ArrayList;

import interfaces.Idepartment;
import interfaces.Iemployee;
import interfaces.Igoods;


import java.util.ArrayList;


public abstract class AbstractDepartment implements Idepartment{

    public AbstractDepartment() {
    }

    public AbstractDepartment(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<Iemployee> employeeList = new ArrayList<Iemployee>();
    private ArrayList<Igoods> goodsList = new ArrayList<Igoods>();

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Iemployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Iemployee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<Igoods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<Igoods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addEmployee(Iemployee employee){
        employee.setDepartment(this);
        employeeList.add(employee);
    }

    public void addGoods(Igoods goods){
        goods.setDepartment(this);// при добавлении товара для него автометически прописывается департамент
        goodsList.add(goods);
    }
}
