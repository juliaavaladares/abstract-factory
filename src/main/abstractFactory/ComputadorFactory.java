package main.abstractFactory;

public class ComputadorFactory  {

    public static Computador criaComputador(ComputadorAbstractFactory caf) {
		return caf.criaComputador();
	}

}
