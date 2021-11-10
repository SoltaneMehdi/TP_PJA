import java.io.*;
public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\FighterGallant\\Desktop\\Eclipse workspace\\TP PJA\\src\\emp.dat");
			ObjectInputStream in = new ObjectInputStream(file);
			RandomAccessFile fileDirect = new RandomAccessFile("C:\\\\Users\\\\FighterGallant\\\\Desktop\\\\Eclipse workspace\\\\TP PJA\\\\src\\\\empdirect.dat","rwd");
			
			while(in.available()>=0) {
				try {
					Employee e = (Employee) in.readObject();
					fileDirect.writeUTF(e.name);
					fileDirect.writeUTF(e.address);
					fileDirect.writeUTF(String.valueOf(e.SSN));
					fileDirect.writeUTF(String.valueOf(e.number));
					
					
					
					
					
				}catch(EOFException i) {
					break;
				}
			}
			in.close();
			file.close();
		
		
		}catch(IOException i) {
			i.printStackTrace();
		}catch(ClassNotFoundException i) {
			i.printStackTrace();
		}
		
		
	}

}
