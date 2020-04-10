package beans;

import abstractfactory.Computer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}

}
