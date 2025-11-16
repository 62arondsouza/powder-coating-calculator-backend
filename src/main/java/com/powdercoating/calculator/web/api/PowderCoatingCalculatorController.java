package com.powdercoating.calculator.web.api;

import java.util.List;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;
import com.powdercoating.calculator.service.PowderCoatingCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculate")
public class PowderCoatingCalculatorController {
	
	private final PowderCoatingCalculatorService powderCoatingCalculatorService;
	
	public PowderCoatingCalculatorController(PowderCoatingCalculatorService powderCoatingCalculatorService) {
		this.powderCoatingCalculatorService = powderCoatingCalculatorService;
	}
	
	@PostMapping("/final-price")
	public Double calculateFinalPrice(@RequestBody List<PowderCoatingObject> list) {
		return powderCoatingCalculatorService.calculateFinalPrice(list);
	}
	
	@PostMapping("/area")
	public Double calculateArea(@RequestBody PowderCoatingObject powderCoatingObject) {
		return powderCoatingCalculatorService.calculateArea(powderCoatingObject);
	}
	
	@PostMapping("/total-area")
	public Double calculateTotalArea(@RequestBody List<PowderCoatingObject> powderCoatingObjects) {
		return powderCoatingCalculatorService.calculateFinalArea(powderCoatingObjects);
	}
}
