package com.powdercoating.calculator.data.enums;

public enum PowderCoatingObjectName {
	S_TOP,
	S_BOTTOM,
	TWO_TOP,
	TWO_BOTTOM,
	THREE_TOP,
	THREE_BOTTOM,
	FOUR_TOP,
	FOUR_BOTTOM,
	FIVE_TOP,
	FIVE_BOTTOM,
	H_L,
	I_L,
	B_BTM,
	U_CHANNEL,
	MIDDLE,
	I_L_PATTI,
	I_L_CHANNEL,
	HALF_U_CHANNEL,
	TWOXONE_H_L,
	TWOXONE_I_L,
	THREEXONE_H_L,
	THREEXONE_M_L,
	Z_SHUTTER,
	Z_OUTER,
	Z_CLIP,
	L_PIPE,
	ONEXONE_PIPE,
	TWOXONE_PIPE,
	THREEXONE_PIPE,
	FOURXONE_PIPE,
	FIVEXONE_PIPE,
	ONE_HALFXONE_PIPE,
	TWO_HALFXONE_PIPE,
	TWO_HALFXONE_HALF_PIPE,
	THREE_HALFXONE_HALF_PIPE,
	THREEXONE_HALF_PIPE,
	DOOR_CHANNEL,
	T_PATTI,
	F_CHANNEL;
	
	@Override
	public String toString() {
		return switch(this) {
			case S_TOP -> "STop";
			case S_BOTTOM -> "SBtm";
			case TWO_TOP -> "2Top";
			case TWO_BOTTOM -> "2Btm";
			case THREE_TOP -> "3Top";
			case THREE_BOTTOM -> "3Btm";
			case FOUR_TOP -> "4Top";
			case FOUR_BOTTOM -> "4Btm";
			case FIVE_TOP -> "5Top";
			case FIVE_BOTTOM -> "5Btm";
			case H_L -> "Handle";
			case I_L -> "Interlock";
			case B_BTM -> "Bearing bottom";
			case U_CHANNEL -> "U Channel";
			case MIDDLE -> "Middle";
			case I_L_PATTI -> "Interlock Patti";
			case I_L_CHANNEL -> "Interlock Channel";
			case HALF_U_CHANNEL -> "1/2 U Channel";
			case TWOXONE_H_L -> "2x1 Handle";
			case TWOXONE_I_L -> "2x1 Interlock";
			case THREEXONE_H_L -> "3x1 Handle";
			case THREEXONE_M_L -> "3x1 M/L";
			case Z_SHUTTER -> "Z Shutter";
			case Z_OUTER -> "Z Outer";
			case Z_CLIP -> "Z Clip";
			case L_PIPE -> "L Pipe";
			case ONEXONE_PIPE -> "1x1 Pipe";
			case TWOXONE_PIPE -> "2x1 Pipe";
			case THREEXONE_PIPE -> "3x1 Pipe";
			case FOURXONE_PIPE -> "4x1 Pipe";
			case FIVEXONE_PIPE -> "5x1 Pipe";
			case ONE_HALFXONE_PIPE -> "1.5x1 Pipe";
			case TWO_HALFXONE_PIPE -> "2.5x1 Pipe";
			case TWO_HALFXONE_HALF_PIPE -> "2.5x1.5 Pipe";
			case THREE_HALFXONE_HALF_PIPE -> "3.5x1.5 Pipe";
			case THREEXONE_HALF_PIPE -> "3x1.5 Pipe";
			case DOOR_CHANNEL -> "Door Channel";
			case T_PATTI -> "T Patti";
			case F_CHANNEL -> "F Channel";
		};
	}
}
