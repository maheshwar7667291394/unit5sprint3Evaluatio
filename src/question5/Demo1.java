package question5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		  List<Student> addstudent=new ArrayList<>();
		  Student student=new Student(1,"maehsbabu", 500, "M@gamil.com","M123@g",new Address("bihar","patna","8001"));
		  Student student2=new Student(2,"ramukumar", 400, "RM@gamil.com","RRM123@g",new Address("Up","banaras","70011"));
		  Student student3=new Student(3,"hiralal", 300, "HM@gamil.com","HRM123@g",new Address("utrakhand","banagav","70011"));
		  Student student4=new Student(4,"ramlal", 300, "RRM@gamil.com","RRM123@g",new Address("jharkhand","banaras","70011"));
		  Student student5=new Student(5,"lalugopa;", 200, "LRM@gamil.com","LRM123@g",new Address("rajsthan","jodhpur","70011"));
		  addstudent.add(student);
		  addstudent.add(student2);
		  addstudent.add(student3);
		  addstudent.add(student4);
		  addstudent.add(student5);
		  
		File f=new File("studentdata.txt");
		
		FileOutputStream foi=new FileOutputStream(f,true);
		ObjectOutputStream ooi=new ObjectOutputStream(foi);
		
		
		 for(int i=0;i<addstudent.size();i++) {
			 Student st=addstudent.get(i);
			 ooi.writeObject(addstudent);
		 }
		
		
		ooi.flush();
	
		
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		  for(int i=0;i<addstudent.size();i++) {
			 Object obj=ois.readObject();
				

				
			    Student s1=(Student)obj;
			     System.out.println("roll : "+s1.getRoll());
			     System.out.println("name : "+s1.getName());
			     System.out.println("maeks : "+s1.getMarks());
			     System.out.println("email : "+s1.getEmail());
			     System.out.println("password : "+s1.getPassword());
			     System.out.println("address : "+s1.getAddress());
			     System.out.println("----------------------");	
		  }
			
		
		
		
		 
		     
   Student student6=new Student(2,"ramukumar", 400, "RM@gamil.com","RM123@g",new Address("Up","banaras","70011"));
   addstudent.add(student6);
   
   ooi.writeObject(student);
   ooi.flush();
   ooi.close();
   
   
   Object obj2=ois.readObject();
    Student s2=(Student)obj2;
    System.out.println(s2);
		     
		}

}
