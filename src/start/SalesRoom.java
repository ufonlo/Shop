package start;
import java.util.ArrayList;

import interfaces.Idepartment;
import interfaces.Ivisitor;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<Idepartment> departmentList = new ArrayList<Idepartment>();// в каждом департаменте имеются свои сотрудники

    private ArrayList<Ivisitor> visitorList = new ArrayList<Ivisitor>();

    public ArrayList<Idepartment> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(Idepartment department){
        departmentList.add(department);
    }

    public void addVisitor(Ivisitor visitor){
        visitorList.add(visitor);
    }

}
