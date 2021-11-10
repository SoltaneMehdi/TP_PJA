import java.io.*;
import java.util.*;
public class class1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nombre d'emploiyer");
		int numEmp = sc.nextInt();
		sc.nextLine();
		
		Employee [] tabEmp = new Employee[numEmp];
		for (int i =0 ; i<numEmp ; i++) {
			   String name;
			   String address;
			   int SSN;
			   int number;
			   System.out.printf("entrer le nom l'emploiyer n" + (i+1) );
			   name = sc.nextLine();
			   
			   
			   System.out.println("entrer l'address l'emploiyer n" + (i+1));
			   address = sc.nextLine();
			   
			   
			   System.out.println("entrer le SSN l'emploiyer n" + (i+1));
			   SSN = sc.nextInt();
			   sc.nextLine();
			   
			   System.out.println("entrer le numero l'emploiyer n" + (i+1));
			   number = sc.nextInt();
			   sc.nextLine();
			   tabEmp[i]= new Employee(name,address,SSN,number);
		}
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\FighterGallant\\Desktop\\Eclipse workspace\\TP PJA\\src\\emp.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			for(int i =0 ; i<numEmp ; i++) {
				out.writeObject(tabEmp[i]);
			}
		
		}catch(IOException i) {
			i.printStackTrace();
		}
		
		
	}

}
