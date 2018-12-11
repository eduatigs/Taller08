package constructorComputadora;

import emsamablajecomputadoras.creacional.*;

public class AsusROGEBuilder extends computadorBuilder{

	@Override
	public void definirComputador() {
		c = new Computador();
		c.setMarca("AsusROGE");
		c.setModelo("ROG");
	}

	@Override
	public void construirMemoriaRAM() {
		c.setRam(32);
		
	}

	@Override
	public void construirDiscoDuro() {
		c.setAlmacenamiento(1000);
		
	}

	@Override
	public void construirOS() {
		c.setOs(new SistemaOperativo("Windows", 64, "10 PRO"));
		
	}

	@Override
	public void construirMainboard() {
		c.setPlaca(new Mainboard("Strix", "x99"));
		
	}

}
