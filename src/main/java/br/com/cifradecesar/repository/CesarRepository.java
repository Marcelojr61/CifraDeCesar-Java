package br.com.cifradecesar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cifradecesar.model.Cesar;

@Repository
public interface CesarRepository extends JpaRepository<Cesar, Long>{



}
