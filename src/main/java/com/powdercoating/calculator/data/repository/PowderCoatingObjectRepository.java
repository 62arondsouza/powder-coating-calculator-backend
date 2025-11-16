package com.powdercoating.calculator.data.repository;

import java.util.UUID;

import com.powdercoating.calculator.data.entity.PowderCoatingObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowderCoatingObjectRepository extends JpaRepository<PowderCoatingObject, UUID> {

}
