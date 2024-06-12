package com.example.library.Serviceimpl;

import com.example.library.Service.LibraryService;
import com.example.library.model.Library;
import com.example.library.Repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {
    private final LibraryRepo libraryRepo;
    @Autowired
    public LibraryServiceImpl(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }

    @Override
    public Library saveLibrary(Library library) {
        return libraryRepo.save(library) ;
    }

    @Override
    public List<Library> getAllBooks()
    {
        return (List<Library>) libraryRepo.findAll();
    }

    @Override
    public Library updateLibrary(Library library) {
        return libraryRepo.save(library);
    }



    @Override
    public Optional<Library> getById(Long id) {
        return libraryRepo.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        libraryRepo.deleteById(id);
    }


}
