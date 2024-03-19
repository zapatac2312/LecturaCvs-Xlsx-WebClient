package com.example.demo.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.cvsDocument;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class cvsDocumentService {

    private cvsDocument cvsDocument;

    public cvsDocumentService( cvsDocument cvsDocument) throws FileNotFoundException {
        this.cvsDocument = cvsDocument;
    }

    public List<cvsDocument> leerDocumento(){
        CSVReader cvsReader = null;
        try {
            cvsReader = new CSVReader(new FileReader("D:\\ArchivosWorkshop\\people.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<cvsDocument> listaDocumentos = new ArrayList<>();
        List<String[]> lista = null;
        try {
            lista = cvsReader.readAll();
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
        for (String[] array : lista) {
            cvsDocument = new cvsDocument(array[1],array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            listaDocumentos.add(cvsDocument);
        }
        return listaDocumentos;
    }

}
