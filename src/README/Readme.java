/**
 * ===========================================================================
 * ️ SIMULADOR DE COLA DE IMPRESIÓN - PROYECTO 2 
 * ===========================================================================
 * Asignatura: Estructuras de Datos (BPTSP06) 
 * Trimestre: 2526-2 
 * Institución: Universidad Metropolitana 
 * * ---------------------------------------------------------------------------
 * 1. DESCRIPCIÓN DEL PROYECTO
 * ---------------------------------------------------------------------------
 * Este sistema simula el mecanismo de administración de recursos de impresión 
 * de un Sistema Operativo mediante el uso de estructuras de datos avanzadas. 
 * El objetivo es optimizar el flujo de documentos permitiendo que usuarios 
 * con distintas prioridades puedan procesar sus archivos de manera eficiente. 
 * * ---------------------------------------------------------------------------
 * 2. ARQUITECTURA TÉCNICA (MODELADO HÍBRIDO) 
 * ---------------------------------------------------------------------------
 * El sistema integra dos estructuras fundamentales de implementación propia 
 * para cumplir con los requisitos de eficiencia: 
 * * - MONTÍCULO BINARIO (Min-Heap): Gestiona la prioridad. Organiza los 
 * documentos basándose en una "etiqueta de tiempo" alterada según el tipo 
 * de usuario. Operaciones en O(log n). 
 * * - TABLA DE DISPERSIÓN (Hash Table): Vincula cada documento en la cola 
 * con su respectivo usuario, garantizando búsquedas con una complejidad 
 * cercana a O(1). 
 * * ---------------------------------------------------------------------------
 * 3. INTEGRANTES 
 * ---------------------------------------------------------------------------
 * * Adriana Julian CI: 28424728
 * * ---------------------------------------------------------------------------
 * 4. REPOSITORIO GITHUB 
 * ---------------------------------------------------------------------------
 * URL: https://github.com/Adri0712/Proyecto2_EDD_Impresora
 * * ---------------------------------------------------------------------------
 * 5. FUNCIONALIDADES CLAVE
 * ---------------------------------------------------------------------------
 * - GESTIÓN DE USUARIOS: Carga masiva mediante archivos .CSV. 
 * - SIMULACIÓN DE RELOJ: Cronómetro interno para etiquetas de tiempo. 
 * - CONTROL DE COLA: 
 * * Liberar Impresora (eliminar_min). 
 * * Eliminar Documento (mediante alteración de prioridad).
 * - VISUALIZACIÓN DUAL: Vista de secuencia y representación gráfica de árbol. 
 * * ---------------------------------------------------------------------------
 * 6. REQUERIMIENTOS TÉCNICOS
 * ---------------------------------------------------------------------------
 * - IDE: NetBeans. 
 * - Lenguaje: Java. 
 * - Restricción: Estructuras de datos implementadas sin librerías. 
 * - Documentación: Javadoc interno incluido. 
 * * ===========================================================================
 * "Imprimiendo tus sueños, una página a la vez."
 * ===========================================================================
 */
