package constructorComputadora;

import emsamablajecomputadoras.creacional.*;

public class AsusZenbook extends computadorBuilder{

	@Override
	public void definirComputador() {
		c = new Computador();
		c.setMarca("Asus");
		c.setModelo("Zenbook");
	}

	@Override
	public void construirMemoriaRAM() {
		c.setRam(16);
		
	}

	@Override
	public void construirDiscoDuro() {
		c.setAlmacenamiento(500);
		
	}

	@Override
	public void construirOS() {
		c.setOs(new SistemaOperativo("Windows",64,"10 Home"));
		
	}

	@Override
	public void construirMainboard() {
		c.setPlaca(new Mainboard("Prime","Z370"));
		
	}

}
