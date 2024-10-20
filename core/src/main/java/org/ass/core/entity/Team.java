package org.ass.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "team_info")
public class Team implements Serializable {

	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "name")
	private String name;

	@Column(name = "team_size")
	private String teamSize;

	@Column(name = "team_type")
	private String teamType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "forigen_key")
	private Captian captian;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public Captian getCaptian() {
		return captian;
	}

	public void setCaptian(Captian captian) {
		this.captian = captian;
	}

}
