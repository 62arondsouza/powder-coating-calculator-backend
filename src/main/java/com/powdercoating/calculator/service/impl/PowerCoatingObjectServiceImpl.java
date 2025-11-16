package com.powdercoating.calculator.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;
import com.powdercoating.calculator.data.repository.PowderCoatingObjectRepository;
import com.powdercoating.calculator.service.PowderCoatingObjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PowerCoatingObjectServiceImpl implements PowderCoatingObjectService {
	
	private final PowderCoatingObjectRepository powderCoatingObjectRepository;
	
	public PowerCoatingObjectServiceImpl(PowderCoatingObjectRepository powderCoatingObjectRepository) {
		this.powderCoatingObjectRepository = powderCoatingObjectRepository;
	}
	
	@Override
	public List<PowderCoatingObject> getAll() {
		return powderCoatingObjectRepository.findAll();
	}
	
	@Override
	public PowderCoatingObject getById(UUID id) {
		Optional<PowderCoatingObject> powderCoatingObjectOptional = powderCoatingObjectRepository.findById(id);
		return powderCoatingObjectOptional.orElse(null);
	}
	
	@Override
	public PowderCoatingObject add(PowderCoatingObject powderCoatingObject) {
		return powderCoatingObjectRepository.save(powderCoatingObject);
	}
	
	@Override
	public PowderCoatingObject update(UUID id, PowderCoatingObject powderCoatingObject) {
		if(!id.equals(powderCoatingObject.getId())) {
			return null;
		}
		return powderCoatingObjectRepository.save(powderCoatingObject);
	}
	
	@Override
	public void delete(UUID id) {
		powderCoatingObjectRepository.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteAll() {
		powderCoatingObjectRepository.deleteAll();
	}
}
