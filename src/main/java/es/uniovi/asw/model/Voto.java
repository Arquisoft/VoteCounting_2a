package es.uniovi.asw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "voto")
public class Voto extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	//private static final Logger log = LoggerFactory.getLogger(Voto.class);

	@Column(nullable = false, unique = true)
	private Eleccion eleccion;

	@Column(nullable = false, unique = true)
	private ColegioElectoral colegioElectoral;

	@Column(nullable = false)
	private boolean online;

	public Voto() {

	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}

	public ColegioElectoral getColegioElectoral() {
		return colegioElectoral;
	}

	public void setColegioElectoral(ColegioElectoral colegioElectoral) {
		this.colegioElectoral = colegioElectoral;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
