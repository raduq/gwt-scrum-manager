package com.geekvigarista.scrummanager.shared.vos;

import java.util.Date;
import java.util.List;

import com.geekvigarista.scrummanager.shared.enums.PrioridadeRequisito;

public class Requisito {

	private String id;
	private String titulo;
	private PrioridadeRequisito prioridade;
	private int tempoEstimado; // horas
	private List<Encaminhamento> encaminhamentos;
	private Date dataCadastro;
	private List<String> anexos;
	private int tempoTotal; // horas

	public Requisito(String id, String titulo, PrioridadeRequisito prioridade,
			int tempoEstimado, List<Encaminhamento> encaminhamentos,
			Date dataCadastro, List<String> anexos, int tempoTotal) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.prioridade = prioridade;
		this.tempoEstimado = tempoEstimado;
		this.encaminhamentos = encaminhamentos;
		this.dataCadastro = dataCadastro;
		this.anexos = anexos;
		this.tempoTotal = tempoTotal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public PrioridadeRequisito getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(PrioridadeRequisito prioridade) {
		this.prioridade = prioridade;
	}

	public int getTempoEstimado() {
		return tempoEstimado;
	}

	public void setTempoEstimado(int tempoEstimado) {
		this.tempoEstimado = tempoEstimado;
	}

	public List<Encaminhamento> getEncaminhamentos() {
		return encaminhamentos;
	}

	public void setEncaminhamentos(List<Encaminhamento> encaminhamentos) {
		this.encaminhamentos = encaminhamentos;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<String> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<String> anexos) {
		this.anexos = anexos;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

}
