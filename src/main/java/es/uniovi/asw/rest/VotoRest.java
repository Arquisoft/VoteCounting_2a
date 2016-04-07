package es.uniovi.asw.rest;

import java.io.Serializable;

public class VotoRest implements Serializable {

	private static final long serialVersionUID = 2202030848123918214L;
	private String eleccion;
	private String colegioElectoral;
	private String opcion;
	private boolean online;

	public VotoRest() {

	}

	public VotoRest(Long eleccion, Long colegioElectoral, String opcion, boolean online) {
		super();
		this.eleccion = eleccion + "";
		this.colegioElectoral = colegioElectoral + "";
		this.opcion = opcion;
		this.online = online;
	}

	public String getEleccion() {
		return eleccion;
	}

	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}

	public String getColegioElectoral() {
		return colegioElectoral;
	}

	public void setColegioElectoral(String colegioElectoral) {
		this.colegioElectoral = colegioElectoral;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
