package com.powdercoating.calculator.service;

import java.util.List;
import java.util.UUID;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;

public interface PowderCoatingObjectService {
	List<PowderCoatingObject> getAll();
	PowderCoatingObject getById(UUID id);
	PowderCoatingObject add(PowderCoatingObject powderCoatingObject);
	PowderCoatingObject update(UUID id, PowderCoatingObject powderCoatingObject);
	void delete(UUID id);
	
	void deleteAll();
}
