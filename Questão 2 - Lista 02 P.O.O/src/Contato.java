public class Contato {
	
	private int id;
	private String nome;
	private int tel;
	private String email;
	
	//Construtor
	public Contato(int id, String nome, int tel, String email) {
		this.id = id;
		this.nome = nome;
		this.tel = tel;
		this.email = email;
	}
	
	//Método toString
	/*public String toString() {
		return "\nID: " + this.getId() +
			   "\nNome: " + this.getNome() + 
			   "\nTelefone: " + this.getTel() + 
			   "\nEmail: " + this.getEmail();
	}*/

	//Gets e Sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}