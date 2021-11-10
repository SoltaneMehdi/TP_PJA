

import java.io.*;
public class Employee implements Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck()
   {
      System.out.println("Mail de verification de " + name + " " + address);
   }
   //ici nous avons cree un nouvel constructeur avec parametres
   public Employee(String name, String adress, int SSN, int number) {
		this.name = name; this.address = address ; this.SSN = SSN ; this.number = number;
   }
}
