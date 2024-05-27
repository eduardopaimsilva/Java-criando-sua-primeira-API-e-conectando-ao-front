package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporada,
                       Double avaliacao,
                       Categoria genero,
                       String ators,
                       String poster,
                       String sinopse) {
}
