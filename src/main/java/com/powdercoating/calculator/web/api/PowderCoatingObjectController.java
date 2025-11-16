package com.powdercoating.calculator.web.api;


import java.util.List;
import java.util.UUID;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;
import com.powdercoating.calculator.data.repository.PowderCoatingObjectRepository;
import com.powdercoating.calculator.service.PowderCoatingObjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class PowderCoatingObjectController {
	
	private final PowderCoatingObjectService powderCoatingObjectService;
	
	public PowderCoatingObjectController(PowderCoatingObjectService powderCoatingObjectService) {
		this.powderCoatingObjectService = powderCoatingObjectService;
	}
	
	@GetMapping
	public List<PowderCoatingObject> getAllItems() {
		return powderCoatingObjectService.getAll();
	}
	
	@GetMapping("/{id}")
	public PowderCoatingObject getItemById(@PathVariable(name = "id") UUID id) {
		return powderCoatingObjectService.getById(id);
	}
	
	@PostMapping
	public PowderCoatingObject addItem(@RequestBody PowderCoatingObject powderCoatingObject) {
		return powderCoatingObjectService.add(powderCoatingObject);
	}
	
	@PutMapping("/{id}")
	public PowderCoatingObject updateItem(@PathVariable(name = "id") UUID id, @RequestBody PowderCoatingObject powderCoatingObject) {
		return powderCoatingObjectService.update(id, powderCoatingObject);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable(name = "id") UUID id) {
		powderCoatingObjectService.delete(id);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deleteAllItems() {
		powderCoatingObjectService.deleteAll();
		return ResponseEntity.noContent().build();
	}
}
