package com.carneiroinc.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carneiroinc.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
