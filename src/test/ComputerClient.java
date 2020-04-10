package test;

import beans.ComputerFactory;
import beans.LaptopFactory;
import beans.PCFactory;
import beans.ServerFactory;
import abstractfactory.Computer;

public class ComputerClient {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));
		
		Computer laptop = ComputerFactory.createComputer(new LaptopFactory());
		
	}
}
