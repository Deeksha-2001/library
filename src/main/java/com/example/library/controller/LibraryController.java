package com.example.library.controller;

import com.example.library.Service.LibraryService;
import com.example.library.Serviceimpl.LibraryServiceImpl;
import com.example.library.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class LibraryController {
    @Autowired
    private final LibraryServiceImpl libraryService;
    @Autowired
    public LibraryController(LibraryServiceImpl libraryService) {
       this.libraryService = libraryService;
    }



    @GetMapping("/getbooks")
    public String getbooks(Model model)
    {
        model.addAttribute("library", new Library());
        model.addAttribute("libraries",libraryService.getAllBooks());
        return "index";
    }

    @PostMapping("/savelibrary")
    public String saveLibrary(Library library)
    {
        System.out.println(library.toString());
        Library lib=libraryService.saveLibrary(library);
        return  "redirect:/getbooks";
    }
    @PostMapping("/updatelibrary")
    public String updateLibrary(Library library)
    {
        Library lib=libraryService.updateLibrary(library);
        return "redirect:/getbooks";
    }
    @GetMapping("/editlibrary/{id} ")
    public String editLibrary(@PathVariable("id") Long id, Model model)
    {
       Optional <Library> libraryOptional=libraryService.getById(id);
       if(libraryOptional.isPresent())
       {
           model.addAttribute("lib",libraryOptional.get());
           return "editlibrary";

       }
       return "redirect:/getbooks";

    }
}
