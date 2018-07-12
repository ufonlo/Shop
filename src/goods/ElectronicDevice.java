package goods;

import interfaces.Idepartment;
import interfaces.IelectronicDevice;

public class ElectronicDevice extends AbstractGoods implements IelectronicDevice{


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
        // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }

	@Override
	public void setDepartment(Idepartment department) {
		// TODO Auto-generated method stub	
	}
}
