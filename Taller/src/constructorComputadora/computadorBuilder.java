package constructorComputadora;

import emsamablajecomputadoras.creacional.Computador;

public abstract class computadorBuilder {

	protected Computador c;
	
	public Computador GteComputador() {
		return c;
	}
	
	public abstract void definirComputador();
	public abstract void construirMemoriaRAM();
	public abstract void construirDiscoDuro();
	public abstract void construirOS();
	public abstract void construirMainboard();
}
