package com.powdercoating.calculator.service.impl;

import java.util.List;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;
import com.powdercoating.calculator.service.PowderCoatingCalculatorService;
import org.springframework.stereotype.Service;

@Service
public class PowderCoatingCalculatorServiceImpl implements PowderCoatingCalculatorService {
	
	@Override
	public Double calculateArea(PowderCoatingObject powderCoatingObject) {
		return powderCoatingObject.getArea();
	}
	
	@Override
	public Double calculateFinalPrice(List<PowderCoatingObject> list) {
		double finalPrice = 0.0;
		for(PowderCoatingObject o : list) {
			finalPrice += o.getPrice();
		}
		return finalPrice;
	}
	
	@Override
	public Double calculatePrice(PowderCoatingObject powderCoatingObject) {
		return powderCoatingObject.getPrice();
	}
	
	@Override
	public Double calculateFinalArea(List<PowderCoatingObject> list) {
		Double sum = 0.0;
		for(PowderCoatingObject o: list) {
			sum += o.getArea();
		}
		return sum;
	}
}
