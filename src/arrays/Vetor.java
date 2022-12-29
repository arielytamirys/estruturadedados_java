package arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
	}


	public boolean add(String elemento) {

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

}


	
	
	/** forma de fazer condição para adicionar elemento ao array

	  public void add(String elemento) throws Exception {
		
		if(this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
		} else {
			throw new Exception("Vetor esta cheio");
		}
	}
	*/
	
	
	
	

