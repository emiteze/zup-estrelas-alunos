package br.com.zup.estrelas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.estrelas.alunos.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	
	}

