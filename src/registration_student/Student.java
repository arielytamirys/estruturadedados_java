package registration_student;

public class Student {
 
	private String nome;
	
	public Student(String nome) {
		this.nome = (nome);
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student outro = (Student) obj;
		return outro.getNome().equals(this.nome);
	}
	
	public String toString() {
		return nome;
	}

}
