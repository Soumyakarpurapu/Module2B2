package com.cg.schedulemanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="ScheduledSessions")
public class Client {
	
	@Id
	@Column(name="id")
	@NotNull(message="ID cannot be empty")
	Integer Id;
	@Column(name="name")
	@NotEmpty(message="name cannot be empty")
	String name;
	@Column(name="duration")
	Integer dur;
	@Column(name="faculty")
	String fac;
	@Column(name="mode1")
	String mode;
	
	public Client() {
		
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDur() {
		return dur;
	}
	public void setDur(Integer dur) {
		this.dur = dur;
	}
	public String getFac() {
		return fac;
	}
	public void setFac(String fac) {
		this.fac = fac;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public Client(Integer id, String name, Integer dur, String fac, String mode) {
		super();
		Id = id;
		this.name = name;
		this.dur = dur;
		this.fac = fac;
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Client [Id=" + Id + ", name=" + name + ", dur=" + dur
				+ ", fac=" + fac + ", mode=" + mode + "]";
	}
	
	
	

}
