package com.powdercoating.calculator.service.impl;
import com.powdercoating.calculator.data.enums.*;
import com.powdercoating.calculator.data.dto.MetaResponse;
import com.powdercoating.calculator.data.dto.MetaResponse.EnumOption;
import com.powdercoating.calculator.data.dto.MetaResponse.TypeMeta;
import com.powdercoating.calculator.service.MetaService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MetaServiceImpl implements MetaService {
	public MetaResponse getMetaData() {
		List<TypeMeta> types = Arrays.stream(PowderCoatingObjectType.values())
				.map(type -> {
					List<EnumOption> names = type.getNames().stream()
							.map(name -> {
								Double defaultArea = type.getDefaultAreaTable(name.name());
								return new EnumOption(name.name(), name.toString(), defaultArea);
							})
							.collect(Collectors.toList());
					return new TypeMeta(type.name(), type.toString(), names);
				})
				.collect(Collectors.toList());
		
		List<EnumOption> colours = Arrays.stream(PowderCoatingObjectColour.values())
				.map(c -> new EnumOption(c.name(), c.toString()))
				.collect(Collectors.toList());
		
		return new MetaResponse(types, colours);
	}
}
