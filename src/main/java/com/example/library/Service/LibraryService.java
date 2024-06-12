package com.example.library.Service;

import com.example.library.model.Library;

import java.util.List;
import java.util.Optional;

public interface LibraryService {


    Library saveLibrary(Library library);

    List<Library> getAllBooks();

    Library updateLibrary(Library library );


    Optional<Library> getById(Long id);

    void deleteByID (Long id);
}
