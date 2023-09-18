package com.skilldistillery.superheros.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "super_hero")
public class SuperHero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	private String description;
	
	@Column(name = "height_in_inches")
	private int heightInInches;
	
	@Column(name = "weight_in_pounds")
	private int weightInPounds;

	public SuperHero() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getHeightInInches() {
		return heightInInches;
	}


	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}


	public int getWeightInPounds() {
		return weightInPounds;
	}


	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperHero [id=").append(id).append(", name=").append(name).append(", imageUrl=")
				.append(imageUrl).append(", description=").append(description).append(", heightInInches=")
				.append(heightInInches).append(", weightInPounds=").append(weightInPounds).append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperHero other = (SuperHero) obj;
		return id == other.id;
	}
	
	
}
