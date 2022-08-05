package hello;

class OpenException extends Exception {
	
}

class CloseException extends OpenException {
	
}

public class ArrayIndex {
	
	public static int open() {
		return -1;
	}
	
	public static void readFile() throws OpenException, CloseException{
		if (open() == -1) {
			throw new CloseException();
		}
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (CloseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Close");
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Open");
		}
	}

}
