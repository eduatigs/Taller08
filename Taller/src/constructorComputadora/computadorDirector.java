package constructorComputadora;

import emsamablajecomputadoras.creacional.Computador;

public class computadorDirector {

	private computadorBuilder builder;
	
	public computadorDirector(computadorBuilder builder) {
		this.builder = builder;
	}
	
	public void contruirComputador() {
		builder.definirComputador();
		builder.construirMemoriaRAM();
		builder.construirDiscoDuro();
		builder.construirMainboard();
		builder.construirOS();
	}
	
	public Computador getComputador() {
		return builder.GteComputador();
	}
}
