package entity;

public class Cachorro {
	private Integer tamanho;
	private String raca;
	
	public Cachorro() {
		super();
	}
	
	
	public Cachorro(Integer tamanho, String raca) {
		super();
		this.tamanho = tamanho;
		this.raca = raca;
	}


	public void latir() {
		System.out.println("au au au");
	}


	public Integer getTamanho() {
		return tamanho;
	}


	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
