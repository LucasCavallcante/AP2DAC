package entidades;

import javax.persistence.*;

@Entity
public class Suspeito {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "nome_suspeito")
	private String nomeSuspeito;
	@Column(name = "sexo_suspeito")
	private String sexoSuspeito;
	@Column(name = "idade_suspeito")
	private int idadeSuspeito;
	@Column(name = "grau_parentesco")
	private String grauParentesco;
	private String profissao;
	private String raca;
	@Column(name = "identidade_genero")
	private String idtGenero;
	@Column(name = "orientacao_sexual")
	private String oriSexual;
	private String escolaridade;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeSuspeito() {
		return nomeSuspeito;
	}
	public void setNomeSuspeito(String nomeSuspeito) {
		this.nomeSuspeito = nomeSuspeito;
	}
	public String getSexoSuspeito() {
		return sexoSuspeito;
	}
	public void setSexoSuspeito(String sexoSuspeito) {
		this.sexoSuspeito = sexoSuspeito;
	}
	public int getIdadeSuspeito() {
		return idadeSuspeito;
	}
	public void setIdadeSuspeito(int idadeSuspeito) {
		this.idadeSuspeito = idadeSuspeito;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getIdtGenero() {
		return idtGenero;
	}
	public void setIdtGenero(String idtGenero) {
		this.idtGenero = idtGenero;
	}
	public String getOriSexual() {
		return oriSexual;
	}
	public void setOriSexual(String oriSexual) {
		this.oriSexual = oriSexual;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
