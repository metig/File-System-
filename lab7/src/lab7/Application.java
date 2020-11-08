package lab7;

public class Application {

	public static void main(String[] args) {
	
		Drive appdir = new Directory("applications");
		Drive datadir = new Directory("my data");
		Drive coursedir = new Directory("cs525");
		
		
		Drive cdrive = new Directory("C");
		
		cdrive.add(appdir);
		cdrive.add(datadir);
		datadir.add(coursedir);
		
		
		appdir.add(new File("msexcel.exe", 2353256));
		datadir.add(new File("msword.exe", 3363858));
		coursedir.add(new File("students.doc", 34252));
		cdrive.print();
	}

}
