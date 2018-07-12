package service;

import interfaces.Idepartment;
import interfaces.Iemployee;
import start.SalesRoom;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(Idepartment departmentInterface){
        for (Iemployee employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }
        return null;
    }
}