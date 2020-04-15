package package1;

public class NoCoincidenTipoYCat extends RuntimeException {
	 public NoCoincidenTipoYCat(){
		super("El tipo no corresponde a la categoría ingresada");
	}
}