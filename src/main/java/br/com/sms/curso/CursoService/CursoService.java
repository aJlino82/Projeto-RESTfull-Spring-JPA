package br.com.sms.curso.CursoService;

import br.com.sms.curso.domain.Curso;

import java.util.Date;
import java.util.List;

public interface CursoService {
    void save(Curso curso);

    void update(Long id, Curso curso);

    void delete(Long id);

    Curso findById(Long id);

    List<Curso> FindAll();

    Curso updateDataInicio(Long id, Date dataInicio);
}
