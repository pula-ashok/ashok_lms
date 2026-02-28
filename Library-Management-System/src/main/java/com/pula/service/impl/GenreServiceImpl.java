package com.pula.service.impl;

import com.pula.model.Genre;
import com.pula.repository.GenreRepository;
import com.pula.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    @Override
    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }
}
