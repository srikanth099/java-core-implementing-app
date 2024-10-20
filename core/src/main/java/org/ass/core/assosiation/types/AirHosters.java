package org.ass.core.assosiation.types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="air_hosters_info")
public class AirHosters implements Serializable {
	
	
	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
