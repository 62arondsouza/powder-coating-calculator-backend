package com.powdercoating.calculator.web.api;

import com.powdercoating.calculator.data.dto.MetaResponse;
import com.powdercoating.calculator.service.MetaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/meta")
public class MetaDataController {
	
	private final MetaService metaService;
	
	public MetaDataController(MetaService metaService) {
		this.metaService = metaService;
	}
	
	@GetMapping
	public MetaResponse getMeta() {
		return metaService.getMetaData();
	}
}
