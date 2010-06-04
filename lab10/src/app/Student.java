package app;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	String nume;
	String prenume;
	String grupa;
	ArrayList<Nota> note;
	
	public Student() {
		note = new ArrayList<Nota>();
	}
	
	public Student(String nume, String prenume, String grupa) {
		this();
		
		this.nume = nume;
		this.prenume = prenume;
		this.grupa = grupa;
	}
	
	public Student(String nume, String prenume, String grupa, Nota[] note) {
		this(nume, prenume, grupa);
		
		this.note.addAll(Arrays.asList(note));
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}

	public ArrayList<Nota> getNote() {
		return note;
	}

	public void setNote(ArrayList<Nota> note) {
		this.note = note;
	}
	
	public void adaugaNota(Nota n) {
		for (Nota t : note) {
			if (n.equals(t)) {
				note.remove(t);
			}
		}
		
		note.add(n);
	}

	public boolean equals(Object o) {
		Student s = null;
		
		if (o instanceof Student)
			s = (Student) o;
		
		if (s == null)
			return false;
		
		if (nume == s.nume && prenume == s.prenume && grupa == s.grupa)
			return true;
		else
			return false;
	}
}

class Nota {
	String disciplina;
	int nota;
	
	public Nota() {
		
	}
	
	public Nota(String disciplina, int nota) {
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean equals(Object o) {
		Nota n = null;
		
		if (o instanceof Nota)
			n = (Nota) o;
		
		if (n == null)
			return false;
		
		if (disciplina == n.disciplina)
			return true;
		else
			return false;
	}
}
