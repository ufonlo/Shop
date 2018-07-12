package interfaces;

public interface Igoods {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    Idepartment getDepartment();

    void setDepartment(Idepartment department);

    String getCompany();

}
