package com.powdercoating.calculator.service;

import java.util.List;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;

public interface PowderCoatingCalculatorService {
	Double calculateArea(PowderCoatingObject powderCoatingObject);
	Double calculateFinalPrice(List<PowderCoatingObject> list);
	Double calculatePrice(PowderCoatingObject powderCoatingObject);
	Double calculateFinalArea(List<PowderCoatingObject> powderCoatingObjects);
}
