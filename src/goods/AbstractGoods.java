package goods;

import department.AbstractDepartment;
import interfaces.Idepartment;
import interfaces.Igoods;

public abstract class AbstractGoods implements Igoods {

    public static final int DEFAULT_GUARANTEE = 2;

    public AbstractGoods() {
    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    // ��������, ������� ����� ����� ��� ������
    private double price;

    private boolean hasGuarantee;

    private String name;

    private Idepartment department;

    private String company;


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Idepartment getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(Idepartment department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}