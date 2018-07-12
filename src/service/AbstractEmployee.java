package service;

import interfaces.Idepartment;
import interfaces.Iemployee;

public abstract class AbstractEmployee implements Iemployee {

    public AbstractEmployee() {
    }

    public AbstractEmployee(String name) {
        this.name = name;
    }

    private String name;
    private Idepartment department;
    private boolean free;

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
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
