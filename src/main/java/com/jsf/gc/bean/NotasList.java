package com.jsf.gc.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jsf.gc.model.Nota;
 
@ManagedBean
@ViewScoped
public class NotasList implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Nota> notas;
     
    private Nota selectedNota;
    
    public List<Nota> getNotas() {
        return notas;
    }
 
    public Nota getSelectedNota() {
        return selectedNota;
    }
 
    public void setSelectedNota(Nota selectedNota) {
        this.selectedNota = selectedNota;
    }
}
