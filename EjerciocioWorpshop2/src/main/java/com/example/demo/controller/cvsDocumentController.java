package com.example.demo.controller;

import com.example.demo.modelo.cvsDocument;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.cvsDocumentService;
import java.io.IOException;
import java.util.List;

@RestController

public class cvsDocumentController {

    private cvsDocumentService cvsDocumentService;

    @Autowired
    public cvsDocumentController(cvsDocumentService cvsDocumentService) {
        this.cvsDocumentService = cvsDocumentService;
    }

    @GetMapping("/document/")
    public List<cvsDocument> obtenerRegistros() throws IOException, CsvException {
        return this.cvsDocumentService.leerDocumento();
    }
}
