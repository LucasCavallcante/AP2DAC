package entidades;

import javax.persistence.*;

@Entity
public class Vitima {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "nome_vitima")
	private String nomeVitima;
	@Column(name = "sexo_vitima")
	private String sexoVitima;
	@Column(name = "idade_vitima")
	private int idadeVitima;
	@Column(name = "serie_turno")
	private String serieTurno;
	@Column(name = "endereco_vitima")
	private String enderecoVitima;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeVitima() {
		return nomeVitima;
	}
	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}
	public String getSexoVitima() {
		return sexoVitima;
	}
	public void setSexoVitima(String sexoVitima) {
		this.sexoVitima = sexoVitima;
	}
	public int getIdadeVitima() {
		return idadeVitima;
	}
	public void setIdadeVitima(int idadeVitima) {
		this.idadeVitima = idadeVitima;
	}
	public String getSerieTurno() {
		return serieTurno;
	}
	public void setSerieTurno(String serieTurno) {
		this.serieTurno = serieTurno;
	}
	public String getEnderecoVitima() {
		return enderecoVitima;
	}
	public void setEnderecoVitima(String enderecoVitima) {
		this.enderecoVitima = enderecoVitima;
	}
	
	
}
