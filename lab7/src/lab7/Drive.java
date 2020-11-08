package lab7;

public abstract class Drive {
	protected String name;

	public Drive(String name) {
		this.name = name;
	}
	
	public void add(Drive drive) {
		throw new UnsupportedOperationException();
	}
	

	public abstract int computeSize();


	public abstract void print();
}
