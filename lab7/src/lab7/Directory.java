package lab7;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Drive {

	protected String name;
	protected List<Drive> driveList = new ArrayList<>();;

	public Directory(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void add(Drive drive) {
		if (!driveList.contains(drive)) {
			driveList.add(drive);
		}
	}

	@Override
	public int computeSize() {
		int size =0;
		for (Drive dir : driveList) {
			size+=dir.computeSize();
		}
		return size;
	}

	@Override
	public void print() {
		System.out.println("-- dir  " + name + "  size= " + computeSize() + " bytes");
		for (Drive dir : driveList) {
			dir.print();
		}

	}
}
