package es.uniovi.asw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "colegioElectoral")
public class ColegioElectoral extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(ColegioElectoral.class);

	@Column(nullable = false, unique = true)
	private String nombre;

	@Column(nullable = false, unique = true)
	private Long id;

	public ColegioElectoral() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty())
		    this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(id > 0)
	           this.id = id;
	        else
	           log.error("El id debe tener un valor correcto, mayor que 0");
	}

}
