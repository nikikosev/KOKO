package beans;

import abstractfactory.Computer;
import abstractfactory.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer() {
		return new Laptop();
	}

}
