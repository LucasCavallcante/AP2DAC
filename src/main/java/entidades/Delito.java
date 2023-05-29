package entidades;
import java.util.Date;


import javax.persistence.*;

@Entity
public class Delito {
	@Id
	@GeneratedValue
	private int id;
	private String incidente;
	private String violacao;
	private String providencias;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_registro")
	private Date dataRegistro;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "suspeito_id")
    private Suspeito suspeito;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vitima_id")
    private Vitima vitima;
	
	public Suspeito getSuspeito() {
		return suspeito;
	}
	public void setSuspeito(Suspeito suspeito) {
		this.suspeito = suspeito;
	}
	public Vitima getVitima() {
		return vitima;
	}
	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIncidente() {
		return incidente;
	}
	public void setIncidente(String incidente) {
		this.incidente = incidente;
	}
	public String getViolacao() {
		return violacao;
	}
	public void setViolacao(String violacao) {
		this.violacao = violacao;
	}
	public String getProvidencias() {
		return providencias;
	}
	public void setProvidencias(String providencias) {
		this.providencias = providencias;
	}
	
	
}
