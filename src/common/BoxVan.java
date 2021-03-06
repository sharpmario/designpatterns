package common;

public class BoxVan extends AbstractVan {

	public BoxVan(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public BoxVan(Engine engine, Colour colour) {
		super(engine, colour);
	}

	@Override
	public double getPrice() {
		return 500.5;
	}
	
}
