package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Optional;
import java.util.function.Function;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    Optional<Serie>findByTituloContainingIgnoreCase(String nomeSerie);
}
