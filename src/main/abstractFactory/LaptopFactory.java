package main.abstractFactory;

public class LaptopFactory implements ComputadorAbstractFactory{
    @Override
	public Computador criaComputador() {
		return new Laptop();
	}
}
