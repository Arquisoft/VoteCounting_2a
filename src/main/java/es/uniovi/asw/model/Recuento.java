package es.uniovi.asw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "recuento")
public class Recuento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	// private static final Logger log = LoggerFactory.getLogger(Eleccion.class);

	@Column(nullable = false, unique = true)
	private Eleccion eleccion;

	@Column(nullable = false, unique = true)
	private ColegioElectoral colegioElectoral;

	@Column(nullable = false, unique = true)
	private Long total;

	public Recuento() {

	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		if(eleccion != null && !eleccion.isEmpty())
		    this.eleccion = eleccion;
	}

	public ColegioElectoral getColegioElectoral() {
		return colegioElectoral;
	}

	public void setColegioElectoral(ColegioElectoral colegioElectoral) {
		if(colegioElectoral != null && !colegioElectoral.isEmpty())
		    this.colegioElectoral = colegioElectoral;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		if(total > 0)
		   this.total = total;
	}
}
