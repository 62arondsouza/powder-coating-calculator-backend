package com.powdercoating.calculator.data.dto;

import java.util.List;

public record MetaResponse(List<TypeMeta> types, List<EnumOption> colours) {
	
	public record TypeMeta(String key, String label, List<EnumOption> names) {
	
	}
	
	public record EnumOption(String key, String label, Double defaultArea) {
		public EnumOption(String key, String label) {
			this(key, label, null);
		}
	}
}
