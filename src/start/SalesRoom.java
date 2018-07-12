package start;
import java.util.ArrayList;

import interfaces.DepartmentInterface;
import interfaces.VisitorInterface;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();// � ������ ������������ ������� ���� ����������

    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department){
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterface visitor){
        visitorList.add(visitor);
    }

}
