package package1;

public class Prenda {

	private Tipo tipo;
	private String colorPrimario;
	private String colorSecundario;
	private String material;
	private String categoria;
	public Prenda(Tipo tipo, String colorPrimario, String material, String categoria){

		this.tipo = tipo; this.colorPrimario = colorPrimario; this.material = material; this.categoria = categoria;
		if(!tipo.esDeCategoria(categoria)){
			throw new NoCoincidenTipoYCat();
		}
	}
}