package es.uniovi.asw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "recuento")
public class Recuento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	// private static final Logger log =
	// LoggerFactory.getLogger(Eleccion.class);

	@Column(nullable = false, unique = true)
	private Eleccion eleccion;

	@Column(nullable = false, unique = true)
	private ColegioElectoral colegioElectroral;

	@Column(nullable = false, unique = true)
	private Long total;

	public Recuento() {

	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}

	public ColegioElectoral getColegioElectroral() {
		return colegioElectroral;
	}

	public void setColegioElectroral(ColegioElectoral colegioElectroral) {
		this.colegioElectroral = colegioElectroral;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
