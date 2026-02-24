package com.greentech.sistemawebambiental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greentech.sistemawebambiental.model.ChecklistItem;
import java.util.List;

public interface ChecklistItemRepository extends JpaRepository<ChecklistItem, Long> {

	List<ChecklistItem> findBySeccionOrderByOrdenAsc(Integer seccion);
	
	List<ChecklistItem> findAllByOrderBySeccionAscOrdenAsc();

}