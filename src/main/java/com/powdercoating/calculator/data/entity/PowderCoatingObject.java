package com.powdercoating.calculator.data.entity;

import java.util.UUID;

import com.powdercoating.calculator.data.enums.PowderCoatingObjectColour;
import com.powdercoating.calculator.data.enums.PowderCoatingObjectName;
import com.powdercoating.calculator.data.enums.PowderCoatingObjectType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ITEMS")
public class PowderCoatingObject {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "ID")
	private UUID id;
	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE")
	private PowderCoatingObjectType type;
	@Enumerated(EnumType.STRING)
	@Column(name = "NAME")
	private PowderCoatingObjectName name;
	@Enumerated(EnumType.STRING)
	@Column(name = "COLOUR_TYPE")
	private PowderCoatingObjectColour colourType;
	@Column(name = "COLOUR")
	private String colour;
	@Column(name = "AREA_TABLE")
	private Double areaTable;
	@Column(name = "QUANTITY")
	private Integer quantity;
	@Column(name = "LENGTH")
	private Double length;
	
	public Double getArea() {
		return this.length * this.quantity * this.areaTable;
	}
	
	public Double getPrice() {
		double ratePerSqInch = 0;
		if (colourType == PowderCoatingObjectColour.PP) {
			ratePerSqInch = 0.11;
		} else if(colourType == PowderCoatingObjectColour.BLACK || colourType == PowderCoatingObjectColour.BROWN) {
			ratePerSqInch = 0.08;
		} else if(colourType == PowderCoatingObjectColour.GLOSSY || colourType == PowderCoatingObjectColour.MATTE) {
			ratePerSqInch = 0.09;
		}
		
		return ratePerSqInch * this.getArea();
	}
}
