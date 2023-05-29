package bean;

import static util.MessageUtil.erro;
import static util.MessageUtil.sucesso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;


import dao.DelitoDao;
import entidades.Delito;
import entidades.Suspeito;
import entidades.Vitima;

@ManagedBean
public class IncidenteBean {

	private Vitima vitima = new Vitima();
	private Suspeito suspeito = new Suspeito();
	private Delito delito = new Delito();

	public String salvar() {
		try {
			delito.setVitima(vitima);
			delito.setSuspeito(suspeito);
			delito.setDataRegistro(new Date());
			
			DelitoDao.salvar(delito);
			sucesso("Sucesso", "B.O salvo com sucesso");
			
			delito = new Delito();
			suspeito = new Suspeito();
			vitima = new Vitima();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar o B.O");
		}
		return null;
	}

	 public List<Delito> listarDelitos() {
	        return DelitoDao.listarDelitos();
	    }

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}

	public Suspeito getSuspeito() {
		return suspeito;
	}

	public void setSuspeito(Suspeito suspeito) {
		this.suspeito = suspeito;
	}

	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}
}
