package com.pula.service;

import com.pula.model.Genre;
import org.springframework.stereotype.Service;

@Service
public interface GenreService {
    Genre createGenre(Genre genre);
}
