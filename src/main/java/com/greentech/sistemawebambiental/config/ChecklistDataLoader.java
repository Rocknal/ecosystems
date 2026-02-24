package com.greentech.sistemawebambiental.config;

import com.greentech.sistemawebambiental.model.ChecklistItem;
import com.greentech.sistemawebambiental.repository.ChecklistItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChecklistDataLoader implements CommandLineRunner {

    private final ChecklistItemRepository repository;

    public ChecklistDataLoader(ChecklistItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        // Si ya existen items, no vuelve a cargar
        if (repository.count() > 0) {
            return;
        }

        // ===== SECCIÓN 1 - POLÍTICAS =====
        repository.save(new ChecklistItem(1, "1.1 Política del SIGASS", 1));
        repository.save(new ChecklistItem(1, "1.2 Política OEA", 2));
        repository.save(new ChecklistItem(1, "1.3 Política de prevención de accidentes", 3));
        repository.save(new ChecklistItem(1, "1.4 Política de seguridad e higiene", 4));

        // ===== SECCIÓN 2 - DOCUMENTOS DE CUMPLIMIENTO LEGAL =====
        repository.save(new ChecklistItem(2, "2.1 Licencia Ambiental", 1));
        repository.save(new ChecklistItem(2, "2.2 Aprobacion de Auditoria Ambiental", 2));
        repository.save(new ChecklistItem(2, "2.3 Registro de Entidad Comercial", 3));
        repository.save(new ChecklistItem(2, "2.4 Registro de Silo y Acopiador", 4));
        repository.save(new ChecklistItem(2, "2.5 Habilitacion de Depositos de Agroquimicos", 5));
        repository.save(new ChecklistItem(2, "2.6 Registro Industrial MIC", 6));
        repository.save(new ChecklistItem(2, "2.7 Constancia de Mantenimiento de Extintores", 7));
        repository.save(new ChecklistItem(2, "2.8 Cartelería: Prohibido beber y fumar, carga y descarga, indicadores de oficinas, depósitos, vestuarios, cocina", 8));
        repository.save(new ChecklistItem(2, "2.9 Constancia de inscripción en el Registro Público Forestal (si aplica)", 9));
        repository.save(new ChecklistItem(2, "2.10 Documentación y control de procesos", 10));
        repository.save(new ChecklistItem(2, "2.11 Monitoreo y evaluación del desempeño ambiental.", 11));

        // SECCIÓN 3 - DOCUMENTOS A SER ARCHIVADOS EN CARPETAS

        repository.save(new ChecklistItem(3, "3.1 Título de propiedad o documento legal que acredite el uso de la tierra.", 1));
        repository.save(new ChecklistItem(3, "3.2 Comprobantes de pago al día del Impuesto Inmobiliario.", 2));
        repository.save(new ChecklistItem(3, "3.3 Certificado de Condición de Dominio del Inmueble.", 3));
        repository.save(new ChecklistItem(3, "3.4 Planos de la propiedad y del área de aprovechamiento.", 4));
        repository.save(new ChecklistItem(3, "3.5 Documentación y control de procesos.", 5));

        // SECCIÓN 4 - DOCUMENTOS AMBIENTALES

        repository.save(new ChecklistItem(4, "4.1 Informe de Auditoria Ambiental", 1));
        repository.save(new ChecklistItem(4, "4.2 Certificado y/o Constancia de Gestion y disposicion final de residuos solidos", 2));
        repository.save(new ChecklistItem(4, "4.3 Factura de recolecion de residuos solidos", 3));
        repository.save(new ChecklistItem(4, "4.4 Certificado de Fumigacion", 4));
        repository.save(new ChecklistItem(4, "4.5 Constancia SIGEV", 5));
        repository.save(new ChecklistItem(4, "4.6 Comprobante de mantenimiento de maquinarias", 6));
        repository.save(new ChecklistItem(4, "4.7 Comprobante de mantenimiento edilicio", 7));
        repository.save(new ChecklistItem(4, "4.8 Comprobante de limpieza y /o mantenimiento de pozo", 8));
        repository.save(new ChecklistItem(4, "4.9 Comprobante de limpieza y mantenimiento del sistema de captacion de polvos", 9));
        repository.save(new ChecklistItem(4, "4.10 Certificado y/o Constancia de Gestion y disposicion final de combustibles y /o aceites en desuso de generadores", 10));
        repository.save(new ChecklistItem(4, "4.11. Informe de Analisis de aceite PCB", 11));
        
        // SECCIÓN 5 - DOCUMENTOS MUNICIPALES

        repository.save(new ChecklistItem(5, "5.1 Planos Aprobados de construccion", 1));
        repository.save(new ChecklistItem(5, "5.2 Planos Aprobados de prevencion contra incendio", 2));

        // SECCIÓN 6 - DOCUMENTOS FORESTALES
        
        repository.save(new ChecklistItem(6, "6.1 Registros de Plantacione forestales (Eucaliptos)", 1));
        repository.save(new ChecklistItem(6, "6.2 Guias de traslados de leñas (Especies Nativas)", 2));
        repository.save(new ChecklistItem(6, "6.3 Apilamiento de leña", 3));
        repository.save(new ChecklistItem(6, "6.4 No consumen leña nativa", 4));
        
        // SECCIÓN 7 - DOCUMENTOS SENAVE
        
        repository.save(new ChecklistItem(7, "7.1 Habilitacion SENAVE SILOS", 1));
        repository.save(new ChecklistItem(7, "7.2 Habilitacion SENAVE DEPOSITOS", 2));
        repository.save(new ChecklistItem(7, "7.3 Habilitacion SENAVE Entidad comercial", 3));
        repository.save(new ChecklistItem(7, "7.4 Habilitacion SENAVE importador", 4));
        repository.save(new ChecklistItem(7, "7.5 Planilla de fumigacion según Res. SENAVE 656/22. Art.6", 5));
        
        // SECCIÓN 8 - DOCUMENTO INTN
        
        repository.save(new ChecklistItem(8, "8.1 Calibracion de Basculas", 1));
        
        // SECCIÓN 9 - DOCUMENTOS SySO
        
        repository.save(new ChecklistItem(9, "9.1 Procedimientos SySO", 1));
        repository.save(new ChecklistItem(9, "9.2 Registro de capacitacion / induccion", 2));
        repository.save(new ChecklistItem(9, "9.3 Certificado de calibtacion de Oximetros", 3));
        repository.save(new ChecklistItem(9, "9.4 Entrega de EPIS", 4));
        repository.save(new ChecklistItem(9, "9.5 Sector de leñas y foguista", 5));
        repository.save(new ChecklistItem(9, "9.6 Evaluacion de Uso de EPIS por operadores", 6));
        repository.save(new ChecklistItem(9, "9.7 Constancias de capacitaciones e Inducciones", 7));
        repository.save(new ChecklistItem(9, "9.8 Permisos de trabajo", 8));
        repository.save(new ChecklistItem(9, "9.9 Silos- Orden y limpieza", 9));
        repository.save(new ChecklistItem(9, "9.10 Depositos - Orden y limpieza", 10));
        repository.save(new ChecklistItem(9, "9.11 Escaleras y Checks de uso", 11));
        repository.save(new ChecklistItem(9, "9.12 Permisos de trabajo", 12));
        repository.save(new ChecklistItem(9, "9.13 Capacitaciones", 13));
        repository.save(new ChecklistItem(9, "9.14 Escaleras marineras cabos de vida vertical", 14));
        repository.save(new ChecklistItem(9, "9.15 Arneses", 15));
        repository.save(new ChecklistItem(9, "9.16 Permisos de trabajo", 16));
        repository.save(new ChecklistItem(9, "9.17 Procedimiento escrito", 17));
        repository.save(new ChecklistItem(9, "9.18 EPIS", 18));
        repository.save(new ChecklistItem(9, "9.19 Herramientas de trabajo", 19));
        repository.save(new ChecklistItem(9, "9.20 Permisos de trabajo", 20));
        repository.save(new ChecklistItem(9, "9.21 Señalización de espacios confinados etiquetados numerados y con candado", 21));
        repository.save(new ChecklistItem(9, "9.22 Bloqueos de los accesos", 22));
        repository.save(new ChecklistItem(9, "9.23 Habilitacion de personas", 23));
        repository.save(new ChecklistItem(9, "9.24 Trabajos en espacios confinados Oximetro", 24));
        repository.save(new ChecklistItem(9, "9.25 Plan de rescate. Cuerda de rescate", 25));
        repository.save(new ChecklistItem(9, "9.26 Constancia de Capacitacion en espacios confinados", 26));
        repository.save(new ChecklistItem(9, "9.27 Bloqueos", 27));
        repository.save(new ChecklistItem(9, "9.28 Tarjetas de bloqueo y etiquetado", 28));
        repository.save(new ChecklistItem(9, "9.29 Sala de tableros", 29));
        repository.save(new ChecklistItem(9, "9.30 Desratizacion", 30));
        repository.save(new ChecklistItem(9, "9.31 Rejillas de proteccion de cableados", 31));
        repository.save(new ChecklistItem(9, "9.32 Extintor de CO2", 32));
        repository.save(new ChecklistItem(9, "9.33 Guantes de trabajo electrico y herramientas adecuadas", 33));
        repository.save(new ChecklistItem(9, "9.34 Plan de emergencias entrenamiento", 34));
        repository.save(new ChecklistItem(9, "9.35 Plan de emergencias simulacros", 35));
        repository.save(new ChecklistItem(9, "9.36 Plan de emergencias equipamientos", 36));
        repository.save(new ChecklistItem(9, "9.37 Hidrantes instalados", 37));
        repository.save(new ChecklistItem(9, "9.38 Extintores", 38));
        repository.save(new ChecklistItem(9, "9.39 Sensores de humo calor", 39));
        repository.save(new ChecklistItem(9, "9.40 Punto de evacuacion conformado", 40));
        repository.save(new ChecklistItem(9, "9.41 Brigadistas conformados", 41));
        
        // SECCIÓN 10 - DOCUMENTOS DE CUMPLIMIENTOS SIGASS
        
        repository.save(new ChecklistItem(10, "10.1 Fumigaciones y desinfecciones. Planillas de controles", 1));
        repository.save(new ChecklistItem(10, "10.2 Gestion de residuos comunes", 2));
        repository.save(new ChecklistItem(10, "10.3 Cantidades de residuos comunes pesadas", 3));
        repository.save(new ChecklistItem(10, "10.4 Gestion de residuos peligrosos Envases vacios", 4));
        repository.save(new ChecklistItem(10, "10.5 Gestion separada de electrodos y Discos de cortes", 5));
        repository.save(new ChecklistItem(10, "10.6 Gestion de descartes de semillas y limpieza", 6));
        repository.save(new ChecklistItem(10, "10.7 Gestion de Efluentes Cloacales", 7));
        repository.save(new ChecklistItem(10, "10.8 Gestion de aceites en desuso y sus envases, del mantenimiento de equipos", 8));
        repository.save(new ChecklistItem(10, "10.9 Gestion de residuos peligrosos Pilas y baterias", 9));
        repository.save(new ChecklistItem(10, "10.10 Comprobante de mantenimiento de maquinarias", 10));
        repository.save(new ChecklistItem(10, "10.11 Comprobante de limpieza y mantenimiento de pozo", 11));
        repository.save(new ChecklistItem(10, "10.12 Comprobante de limpieza y mantenimiento del sistema de captación de polvos", 12));
        repository.save(new ChecklistItem(10, "10.13 Se verifica sistema de extracción de aire (eólico y/o industrial)", 13));
        repository.save(new ChecklistItem(10, "10.14 Fosa colectora para derrames", 14));
        repository.save(new ChecklistItem(10, "10.15 Canales colectores para derrames", 15));
        repository.save(new ChecklistItem(10, "10.16 Bolsas vacías para re envasar el contenido de envases dañados o con pérdidas", 16));
        repository.save(new ChecklistItem(10, "10.17 Equipos de limpieza (pala, cepillo, solución detergente)", 17));
        repository.save(new ChecklistItem(10, "10.18 Extintores, colocados en lugares accesibles, libres de toda clase de obstáculos, que impidan o dificulten el empleo", 18));
        repository.save(new ChecklistItem(10, "10.19 Baldes de arena o aserrín o tierra seca", 19));
        repository.save(new ChecklistItem(10, "10.20 Ducha de emergencia", 20));
        repository.save(new ChecklistItem(10, "10.21 Sistemas lava ojos, dispositivo de seguridad capaz de actuar de forma rápida y eficaz cuando una persona se ve afectada ante una contaminación de polvo, gases u otras", 21));
        repository.save(new ChecklistItem(10, "10.22 Vestuario con duchas para operario (en cualquier parte del previo de la entidad)", 22));
        repository.save(new ChecklistItem(10, "10.23 Antídotos según ficha de seguridad de los ingredientes activos", 23));
        repository.save(new ChecklistItem(10, "10.24 Máscaras de vapor o respiradores con filtros (cartuchos para vapores orgánicos)", 24));
        repository.save(new ChecklistItem(10, "10.25 Mascarillas livianas desechables (para manipulación de productos polvos o granulados", 25));
        repository.save(new ChecklistItem(10, "10.26 Delantales impermeables, cascos, botas", 26));
        repository.save(new ChecklistItem(10, "10.27 Guantes protectores (de nitrilo o neopreno)", 27));
        
    }
}
