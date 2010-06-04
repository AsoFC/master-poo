package app;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

/**
 * Implementarea serviciului
 * @author radu
 *
 */
@WebService(targetNamespace = "http://lab10/", portName = "CatalogPort", serviceName = "CatalogService")
public class Catalog {
	private static List<Student> catalog = new ArrayList<Student>();
	
	public Catalog() {
	}
	
	public String adaugaStudent(Student s) {
		if (catalog.add(s))
			return "operație efectuată cu succes";
		else
			return "operație eșuată – motiv";
	}
	
	public String stergeStudent(Student s) {
		for (Student t : catalog) {
			if (s.equals(t)) {
				catalog.remove(t);
				return "operație efectuată cu succes";
			}
		}
		
		return "operație eșuată – nu exista studentul";
	}
	
	public Student cautaStudent(String nume, String prenume, String grupa) {
		Student s = new Student(nume, prenume, grupa);
		
		for (Student t : catalog) {
			if (s.equals(t))
				return t;
		}
		
		return null;
	}
	
	public String adaugaNota(Student s) {
		for (Student t : catalog) {
			if (s.equals(t)) {
				t.adaugaNota(s.getNote().get(0));
				return "operație efectuată cu succes";
			}
		}
		
		return "operație eșuată – nu exista studentul";
	}
	
	public Student returneazaStudent() {
		Nota[] note = {new Nota("mate", 10), new Nota("fizica", 8)};
		Student student = new Student("ghita", "portita", "100", note);
		
		return student;
	}
}
