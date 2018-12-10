package prototype;

public interface Product extends Cloneable {
	public abstract void eat(String s);

	public abstract Product createClone();

}
