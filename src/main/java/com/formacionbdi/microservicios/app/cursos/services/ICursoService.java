package com.formacionbdi.microservicios.app.cursos.services;

import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;
import com.formacionbdi.microservicios.commons.services.ICommonService;

/**
* @autor: URTAAV
*/

public interface ICursoService extends ICommonService<Curso>{

	public Curso findCursoByAlumnoId(Long id);
}
