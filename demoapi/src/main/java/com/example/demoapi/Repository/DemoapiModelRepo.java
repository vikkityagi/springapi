package com.example.demoapi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demoapi.model.DemoapiModel;

public interface DemoapiModelRepo extends JpaRepository<DemoapiModel,Integer> {

	DemoapiModel findByEmail(String email);

}
