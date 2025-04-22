package com.example.Parcial2Landinez.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Document(collection = "estudiantes")
public class Estudiante {
    @Id
    private String id;
    private String tipoDocumento;
    private String numeroDocumento;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String segundoNombre;
    private String correoElectronico;
    private String numeroTelefonico;
    private String numeroRegistro;
    private int puntaje;
    private String saberProPuntajeNivel;
    private int comunicacionEscrita;
    private String comunicacionEscritaNivel;
    private int razonamientoCuantitativo;
    private String razonamientoCuantitativoNivel;
    private int lecturaCritica;
    private String lecturaCriticaNivel;
    private int competenciasCiudadanas;
    private String competenciasCiudadanasNivel;
    private int ingles;
    private String inglesNivel;
    private int formulacionProyectosIngenieria;
    private String formulacionProyectosIngenieriaNivel;
    private int pensamientoCientificoMatematicasEstadistica;
    private String pensamientoCientificoMatematicasEstadisticaNivel;
    private int diseñoSoftware;
    private String diseñoSoftwareNivel;
    private String nivelIngles;
    
    // Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getSaberProPuntajeNivel() {
		return saberProPuntajeNivel;
	}
	public void setSaberProPuntajeNivel(String saberProPuntajeNivel) {
		this.saberProPuntajeNivel = saberProPuntajeNivel;
	}
	public int getComunicacionEscrita() {
		return comunicacionEscrita;
	}
	public void setComunicacionEscrita(int comunicacionEscrita) {
		this.comunicacionEscrita = comunicacionEscrita;
	}
	public String getComunicacionEscritaNivel() {
		return comunicacionEscritaNivel;
	}
	public void setComunicacionEscritaNivel(String comunicacionEscritaNivel) {
		this.comunicacionEscritaNivel = comunicacionEscritaNivel;
	}
	public int getRazonamientoCuantitativo() {
		return razonamientoCuantitativo;
	}
	public void setRazonamientoCuantitativo(int razonamientoCuantitativo) {
		this.razonamientoCuantitativo = razonamientoCuantitativo;
	}
	public String getRazonamientoCuantitativoNivel() {
		return razonamientoCuantitativoNivel;
	}
	public void setRazonamientoCuantitativoNivel(String razonamientoCuantitativoNivel) {
		this.razonamientoCuantitativoNivel = razonamientoCuantitativoNivel;
	}
	public int getLecturaCritica() {
		return lecturaCritica;
	}
	public void setLecturaCritica(int lecturaCritica) {
		this.lecturaCritica = lecturaCritica;
	}
	public String getLecturaCriticaNivel() {
		return lecturaCriticaNivel;
	}
	public void setLecturaCriticaNivel(String lecturaCriticaNivel) {
		this.lecturaCriticaNivel = lecturaCriticaNivel;
	}
	public int getCompetenciasCiudadanas() {
		return competenciasCiudadanas;
	}
	public void setCompetenciasCiudadanas(int competenciasCiudadanas) {
		this.competenciasCiudadanas = competenciasCiudadanas;
	}
	public String getCompetenciasCiudadanasNivel() {
		return competenciasCiudadanasNivel;
	}
	public void setCompetenciasCiudadanasNivel(String competenciasCiudadanasNivel) {
		this.competenciasCiudadanasNivel = competenciasCiudadanasNivel;
	}
	public int getIngles() {
		return ingles;
	}
	public void setIngles(int ingles) {
		this.ingles = ingles;
	}
	public String getInglesNivel() {
		return inglesNivel;
	}
	public void setInglesNivel(String inglesNivel) {
		this.inglesNivel = inglesNivel;
	}
	public int getFormulacionProyectosIngenieria() {
		return formulacionProyectosIngenieria;
	}
	public void setFormulacionProyectosIngenieria(int formulacionProyectosIngenieria) {
		this.formulacionProyectosIngenieria = formulacionProyectosIngenieria;
	}
	public String getFormulacionProyectosIngenieriaNivel() {
		return formulacionProyectosIngenieriaNivel;
	}
	public void setFormulacionProyectosIngenieriaNivel(String formulacionProyectosIngenieriaNivel) {
		this.formulacionProyectosIngenieriaNivel = formulacionProyectosIngenieriaNivel;
	}
	public int getPensamientoCientificoMatematicasEstadistica() {
		return pensamientoCientificoMatematicasEstadistica;
	}
	public void setPensamientoCientificoMatematicasEstadistica(int pensamientoCientificoMatematicasEstadistica) {
		this.pensamientoCientificoMatematicasEstadistica = pensamientoCientificoMatematicasEstadistica;
	}
	public String getPensamientoCientificoMatematicasEstadisticaNivel() {
		return pensamientoCientificoMatematicasEstadisticaNivel;
	}
	public void setPensamientoCientificoMatematicasEstadisticaNivel(
			String pensamientoCientificoMatematicasEstadisticaNivel) {
		this.pensamientoCientificoMatematicasEstadisticaNivel = pensamientoCientificoMatematicasEstadisticaNivel;
	}
	public int getDiseñoSoftware() {
		return diseñoSoftware;
	}
	public void setDiseñoSoftware(int diseñoSoftware) {
		this.diseñoSoftware = diseñoSoftware;
	}
	public String getDiseñoSoftwareNivel() {
		return diseñoSoftwareNivel;
	}
	public void setDiseñoSoftwareNivel(String diseñoSoftwareNivel) {
		this.diseñoSoftwareNivel = diseñoSoftwareNivel;
	}
	public String getNivelIngles() {
		return nivelIngles;
	}
	public void setNivelIngles(String nivelIngles) {
		this.nivelIngles = nivelIngles;
	}
}