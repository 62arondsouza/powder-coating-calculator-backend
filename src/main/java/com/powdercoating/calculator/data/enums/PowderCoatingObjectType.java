package com.powdercoating.calculator.data.enums;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/*
3/4" SERIES,
1" SERIES,
18/50" SERIES,
27/65 DHUMAL,
35/75 DHUMAL,
OTHER
*/
public enum PowderCoatingObjectType {
	THREE_FOUR_SERIES,
	ONE_SERIES,
	EIGHTEEN_FIFTY_SERIES,
	TWENTYSEVEN_SIXTYFIVE_DHUMAL,
	THIRTYFIVE_SEVENTYFIVE_DHUMAL,
	OTHER;
	
	//default area table
	private static final Map<String, Double> DEFAULT_AREA_TABLE = Map.<String, Double> ofEntries(
			// 3/4" & 1" SERIES (same values)
			Map.entry("THREE_FOUR_SERIES_S_TOP",      10.0), Map.entry("ONE_SERIES_S_TOP",      12.0),
			Map.entry("THREE_FOUR_SERIES_S_BOTTOM",   12.0), Map.entry("ONE_SERIES_S_BOTTOM",   14.0),
			Map.entry("THREE_FOUR_SERIES_TWO_TOP",    14.0), Map.entry("ONE_SERIES_TWO_TOP",    16.0),
			Map.entry("THREE_FOUR_SERIES_TWO_BOTTOM", 16.0), Map.entry("ONE_SERIES_TWO_BOTTOM", 18.0),
			Map.entry("THREE_FOUR_SERIES_THREE_TOP",  18.0), Map.entry("ONE_SERIES_THREE_TOP",  21.0),
			Map.entry("THREE_FOUR_SERIES_THREE_BOTTOM",21.0), Map.entry("ONE_SERIES_THREE_BOTTOM",24.0),
			Map.entry("THREE_FOUR_SERIES_FOUR_TOP",   23.0), Map.entry("ONE_SERIES_FOUR_TOP",   27.0),
			Map.entry("THREE_FOUR_SERIES_FOUR_BOTTOM",27.0), Map.entry("ONE_SERIES_FOUR_BOTTOM",31.0),
			Map.entry("THREE_FOUR_SERIES_FIVE_TOP",   28.0), Map.entry("ONE_SERIES_FIVE_TOP",   33.0),
			Map.entry("THREE_FOUR_SERIES_FIVE_BOTTOM",32.0), Map.entry("ONE_SERIES_FIVE_BOTTOM",37.0),
			Map.entry("THREE_FOUR_SERIES_H_L",        6.0), Map.entry("ONE_SERIES_H_L",         7.0),
			Map.entry("THREE_FOUR_SERIES_I_L",        7.0), Map.entry("ONE_SERIES_I_L",        8.0),
			Map.entry("THREE_FOUR_SERIES_B_BTM",      7.0), Map.entry("ONE_SERIES_B_BTM",      8.0),
			Map.entry("THREE_FOUR_SERIES_U_CHANNEL",  2.0), Map.entry("ONE_SERIES_U_CHANNEL",  3.0),
			Map.entry("THREE_FOUR_SERIES_MIDDLE",     7.0), Map.entry("ONE_SERIES_MIDDLE",     8.0),
			
			// 18/50 SERIES
			Map.entry("EIGHTEEN_FIFTY_SERIES_TWOXONE_H_L",   8.0),
			Map.entry("EIGHTEEN_FIFTY_SERIES_TWOXONE_I_L",   9.0),
			Map.entry("EIGHTEEN_FIFTY_SERIES_THREEXONE_H_L", 8.0),
			Map.entry("EIGHTEEN_FIFTY_SERIES_THREEXONE_M_L", 9.0),
			
			// 27/65 DHUMAL
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_S_TOP",         12.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_TWO_TOP",       24.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_THREE_TOP",     28.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_FOUR_TOP",      32.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_H_L",                  10.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_I_L_PATTI",     6.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_I_L_CHANNEL",   7.0),
			Map.entry("TWENTYSEVEN_SIXTYFIVE_DHUMAL_HALF_U_CHANNEL", 3.0),
			
			// 35/75 DHUMAL
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_S_TOP",        14.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_TWO_TOP",      28.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_THREE_TOP",   32.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_FOUR_TOP",    36.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_H_L",                 12.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_I_L_PATTI",    7.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_I_L_CHANNEL", 8.0),
			Map.entry("THIRTYFIVE_SEVENTYFIVE_DHUMAL_HALF_U_CHANNEL",4.0),
			
			// OTHER
			Map.entry("OTHER_Z_SHUTTER",               8.0),
			Map.entry("OTHER_Z_OUTER",                 9.0),
			Map.entry("OTHER_Z_CLIP",                  5.0),
			Map.entry("OTHER_L_PIPE",                  7.0),
			Map.entry("OTHER_ONEXONE_PIPE",            4.0),
			Map.entry("OTHER_TWOXONE_PIPE",            6.0),
			Map.entry("OTHER_THREEXONE_PIPE",          8.0),
			Map.entry("OTHER_FOURXONE_PIPE",           10.0),
			Map.entry("OTHER_FIVEXONE_PIPE",           12.0),
			Map.entry("OTHER_ONE_HALFXONE_PIPE",       5.0),
			Map.entry("OTHER_TWO_HALFXONE_PIPE",       7.0),
			Map.entry("OTHER_TWO_HALFXONE_HALF_PIPE",  8.0),
			Map.entry("OTHER_THREE_HALFXONE_HALF_PIPE",10.0),
			Map.entry("OTHER_THREEXONE_HALF_PIPE",     9.0),
			Map.entry("OTHER_DOOR_CHANNEL",            8.0),
			Map.entry("OTHER_T_PATTI",                 3.0),
			Map.entry("OTHER_F_CHANNEL",               4.0)
	);
	
	public Set<PowderCoatingObjectName> getNames() {
		return switch (this) {
			case ONE_SERIES, THREE_FOUR_SERIES -> EnumSet.of(
					PowderCoatingObjectName.S_TOP,
					PowderCoatingObjectName.S_BOTTOM,
					PowderCoatingObjectName.TWO_TOP,
					PowderCoatingObjectName.TWO_BOTTOM,
					PowderCoatingObjectName.THREE_TOP,
					PowderCoatingObjectName.THREE_BOTTOM,
					PowderCoatingObjectName.FOUR_TOP,
					PowderCoatingObjectName.FOUR_BOTTOM,
					PowderCoatingObjectName.FIVE_TOP,
					PowderCoatingObjectName.FIVE_BOTTOM,
					PowderCoatingObjectName.H_L,
					PowderCoatingObjectName.I_L,
					PowderCoatingObjectName.B_BTM,
					PowderCoatingObjectName.U_CHANNEL,
					PowderCoatingObjectName.MIDDLE
			);
			case EIGHTEEN_FIFTY_SERIES -> EnumSet.of(
					PowderCoatingObjectName.TWOXONE_H_L,
					PowderCoatingObjectName.TWOXONE_I_L,
					PowderCoatingObjectName.THREEXONE_H_L,
					PowderCoatingObjectName.THREEXONE_M_L
			);
			case TWENTYSEVEN_SIXTYFIVE_DHUMAL, THIRTYFIVE_SEVENTYFIVE_DHUMAL -> EnumSet.of(
					PowderCoatingObjectName.S_TOP,
					PowderCoatingObjectName.TWO_TOP,
					PowderCoatingObjectName.THREE_TOP,
					PowderCoatingObjectName.FOUR_TOP,
					PowderCoatingObjectName.H_L,
					PowderCoatingObjectName.I_L_PATTI,
					PowderCoatingObjectName.I_L_CHANNEL,
					PowderCoatingObjectName.HALF_U_CHANNEL
			);
			case OTHER -> EnumSet.of(
					PowderCoatingObjectName.Z_SHUTTER,
					PowderCoatingObjectName.Z_OUTER,
					PowderCoatingObjectName.Z_CLIP,
					PowderCoatingObjectName.L_PIPE,
					PowderCoatingObjectName.ONEXONE_PIPE,
					PowderCoatingObjectName.TWOXONE_PIPE,
					PowderCoatingObjectName.THREEXONE_PIPE,
					PowderCoatingObjectName.FOURXONE_PIPE,
					PowderCoatingObjectName.FIVEXONE_PIPE,
					PowderCoatingObjectName.ONE_HALFXONE_PIPE,
					PowderCoatingObjectName.TWO_HALFXONE_PIPE,
					PowderCoatingObjectName.TWO_HALFXONE_HALF_PIPE,
					PowderCoatingObjectName.THREE_HALFXONE_HALF_PIPE,
					PowderCoatingObjectName.THREEXONE_HALF_PIPE,
					PowderCoatingObjectName.DOOR_CHANNEL,
					PowderCoatingObjectName.T_PATTI,
					PowderCoatingObjectName.F_CHANNEL
			);
		};
	}
	
	@Override
	public String toString() {
		return switch (this) {
			case THREE_FOUR_SERIES -> "3/4\" Series";
			case ONE_SERIES -> "1\" Series";
			case EIGHTEEN_FIFTY_SERIES -> "18/50\" Series";
			case TWENTYSEVEN_SIXTYFIVE_DHUMAL -> "27/65 Dhumal";
			case THIRTYFIVE_SEVENTYFIVE_DHUMAL -> "35/75 Dhumal";
			case OTHER -> "Other";
		};
	}
	
	public Double getDefaultAreaTable(String nameKey) {
		return DEFAULT_AREA_TABLE.get(this.name() + "_" + nameKey);
	}
}
