package lab7;

public class File extends Drive {

	private String name;
	private int sizeInBytes;
	
	public File(String name, int sizeInBytes) {
		super(name);
		this.name = name;
		this.sizeInBytes = sizeInBytes;
	}

	public String getName() {
		return name;
	}

    
	public int getSizeInBytes() {
		return sizeInBytes;
	}
	@Override
	public int computeSize() {
		
		return getSizeInBytes();
	}
	@Override
	public void print() {
		System.out.println("-- file " + name + "   size=" + getSizeInBytes() + " bytes");
	}

}
