package com.greentech.sistemawebambiental.controller;

import java.time.LocalDate;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import com.greentech.sistemawebambiental.model.Auditoria;
import com.greentech.sistemawebambiental.model.AuditoriaItem;
import com.greentech.sistemawebambiental.model.ChecklistItem;
import com.greentech.sistemawebambiental.repository.AuditoriaRepository;
import com.greentech.sistemawebambiental.repository.ChecklistItemRepository;

@Controller
public class ChecklistController {

	@Autowired
	private ChecklistItemRepository checklistItemRepository;

	@Autowired
	private AuditoriaRepository auditoriaRepository;

	@GetMapping("/checklist")
	public String mostrarChecklist(Model model) {
		
		Map<Integer, String> nombresSecciones = new HashMap<>();

		nombresSecciones.put(1, "POLITICAS");
		nombresSecciones.put(2, "DOCUMENTOS DE CUMPLIMIENTOS LEGAL");
		nombresSecciones.put(3, "DOCUMENTOS A SER ARCHIVADOS EN CARPETAS");
		nombresSecciones.put(4, "DOCUMENTOS AMBIENTALES");
		nombresSecciones.put(5, "DOCUMENTOS MUNICIPALES");
		nombresSecciones.put(6, "DOCUMENTOS FORESTALES");
		nombresSecciones.put(7, "DOCUMENTOS SENAVE");
		nombresSecciones.put(8, "DOCUMENTO INTN");
		nombresSecciones.put(9, "DOCUMENTOS SySO");
		nombresSecciones.put(10, "DOCUMENTOS DE CUMPLIMIENTOS SIGASS");

		model.addAttribute("nombresSecciones", nombresSecciones);

	    List<ChecklistItem> checklistItems =
	            checklistItemRepository.findAllByOrderBySeccionAscOrdenAsc();

	    Auditoria auditoria = new Auditoria();

	    for (ChecklistItem item : checklistItems) {
	        AuditoriaItem auditoriaItem = new AuditoriaItem();
	        auditoriaItem.setChecklistItem(item);
	        auditoria.getItems().add(auditoriaItem);
	    }

	    model.addAttribute("items", checklistItems);
	    model.addAttribute("auditoria", auditoria);

	    return "checklist";
	}
	
	@GetMapping("/auditorias")
	public String listarAuditorias(Model model) {

	    List<Auditoria> auditorias = auditoriaRepository.findAll();

	    model.addAttribute("auditorias", auditorias);

	    return "auditorias";
	}
	
	@GetMapping("/auditorias/{id}")
	public String verAuditoria(@PathVariable Long id, Model model) {

	    Auditoria auditoria = auditoriaRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Auditoría no encontrada"));

	    model.addAttribute("auditoria", auditoria);

	    return "detalle-auditoria";
	}

	@PostMapping("/guardar-auditoria")
	public String guardarAuditoria(
	        @Valid @ModelAttribute("auditoria") Auditoria auditoria,
	        BindingResult result,
	        Model model) {

	    if (result.hasErrors()) {
	        model.addAttribute("items",
	            checklistItemRepository.findAllByOrderBySeccionAscOrdenAsc());
	        return "checklist";
	    }

	    auditoria.setFecha(LocalDate.now());

	    for (AuditoriaItem item : auditoria.getItems()) {

	        if (item.getResultado() != null && !item.getResultado().trim().isEmpty()) {

	            item.setAuditoria(auditoria);

	            ChecklistItem ref = new ChecklistItem();
	            ref.setId(item.getChecklistItem().getId());
	            item.setChecklistItem(ref);
	        }
	    }

	    auditoriaRepository.save(auditoria);

	    return "redirect:/checklist?success";
	}

}