package com.ritekraft.catalogue.controller;

import com.ritekraft.catalogue.entity.Catalogue;
import com.ritekraft.catalogue.service.CatalogueServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogue")
@CrossOrigin("*")
public class CatalogueController {

    CatalogueServiceImpl serviceImpl;

    @PostMapping("/addProd")
    public Catalogue addProd(@RequestBody Catalogue catalogue){
        Catalogue cat = serviceImpl.addProduct(catalogue);
        return  cat;

    }

    @PutMapping("/updateProd")
    public Catalogue updateProd(@RequestBody Catalogue catalogue){
        Catalogue cat = serviceImpl.updateProduct(catalogue);
        return cat;
    }

    @GetMapping("/getAllProd")
    public List<Catalogue> getAllProd(){
        List<Catalogue> list = serviceImpl.getAllItems();
        return list;
    }

    @DeleteMapping("/deleteProd")
    public String deleteProdById(String productId){
        return  serviceImpl.deleteProductById(productId);
    }

}
