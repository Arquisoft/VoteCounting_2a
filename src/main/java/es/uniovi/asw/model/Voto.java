package es.uniovi.asw.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "voto")
public class Voto extends AbstractPersistable<Long> {



}
