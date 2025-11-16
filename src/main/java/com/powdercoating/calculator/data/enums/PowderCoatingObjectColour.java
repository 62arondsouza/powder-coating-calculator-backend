package com.powdercoating.calculator.data.enums;

public enum PowderCoatingObjectColour {
	PP,
	MATTE,
	GLOSSY,
	BROWN,
	BLACK;
	
	@Override
	public String toString() {
		return switch (this) {
			case PP -> "P.P.";
			case MATTE -> "Matte";
			case GLOSSY -> "Glossy";
			case BLACK -> "Black";
			case BROWN -> "Brown";
		};
	}
}
