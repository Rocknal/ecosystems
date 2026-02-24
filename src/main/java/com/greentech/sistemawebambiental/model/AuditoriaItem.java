package com.greentech.sistemawebambiental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "auditoria_items")
public class AuditoriaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultado; // C, NC, NA, OM

    @ManyToOne
    @JoinColumn(name = "auditoria_id", nullable = false)
    private Auditoria auditoria;

    @ManyToOne
    @JoinColumn(name = "checklist_item_id", nullable = false)
    private ChecklistItem checklistItem;

    public Long getId() { return id; }

    public String getResultado() { return resultado; }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Auditoria getAuditoria() { return auditoria; }
    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

    public ChecklistItem getChecklistItem() { return checklistItem; }
    public void setChecklistItem(ChecklistItem checklistItem) {
        this.checklistItem = checklistItem;
    }
}