package goods;

import interfaces.DepartmentInterface;
import interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface{


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name , company);
    }

    @Override
    public void on() {
        // ����� ����������
    }

    @Override
    public void off() {
        // ����� ����������
    }

	@Override
	public void setDepartment(DepartmentInterface department) {
		// TODO Auto-generated method stub	
	}
}
