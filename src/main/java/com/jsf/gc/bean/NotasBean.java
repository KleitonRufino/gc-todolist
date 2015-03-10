package com.jsf.gc.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.gc.model.Nota;

@ManagedBean
@SessionScoped
public class NotasBean {
	private List<Nota> notas = new ArrayList<Nota>();
	private String title;
	private String description;
	private Date data;
	private Date horario;
	
	public void click(){
		Nota nota = new Nota();
		nota.setTitle(title);
		nota.setDescription(description);
		nota.setData(data);
		nota.setHorario(horario);
		notas.add(nota);
	}
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	
}
