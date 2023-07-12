package com.carneiroinc.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carneiroinc.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
