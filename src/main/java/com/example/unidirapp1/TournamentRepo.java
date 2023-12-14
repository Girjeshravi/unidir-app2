package com.example.unidirapp1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface TournamentRepo extends JpaRepository<Tournament, Integer> {
}