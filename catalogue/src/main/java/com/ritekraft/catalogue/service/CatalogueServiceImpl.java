package com.ritekraft.catalogue.service;

import com.ritekraft.catalogue.entity.Catalogue;
import com.ritekraft.catalogue.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    CatalogueRepository catalogueRepo;



    @Override
    public Catalogue addProduct(Catalogue catalogue) {
        catalogueRepo.save(catalogue);
        return catalogue;
    }

    @Override
    public Catalogue updateProduct(Catalogue catalogue) {
        Optional<Catalogue> cat = catalogueRepo.findById(catalogue.getId());
        if(cat.isPresent()){
            Catalogue existingCat = cat.get();
            existingCat.setTitle(catalogue.getTitle());
            existingCat.setAvailability(catalogue.getAvailability());
            existingCat.setAuthor(catalogue.getAuthor());
            existingCat.setGenre(catalogue.getGenre());
            existingCat.setIsbn(catalogue.getIsbn());
            existingCat.setDescription(catalogue.getDescription());
            existingCat.setLanguage(catalogue.getLanguage());
            existingCat.setPrice(catalogue.getPrice());
            existingCat.setPublisher(catalogue.getPublisher());
            existingCat.setNumberOfPages(catalogue.getNumberOfPages());
            existingCat.setPublishedDate(catalogue.getPublishedDate());
            catalogueRepo.save(existingCat);
            return existingCat;
        }
        return null;
    }

    @Override
    public List<Catalogue> getAllItems() {
        List<Catalogue> ls = new ArrayList<>();
        for (Catalogue c : catalogueRepo.findAll()){
            ls.add(c);
        }
        return ls;
    }

    @Override
    public String deleteProductById(String productId) {
        Optional<Catalogue> c = catalogueRepo.findById(productId);
        if(c.isPresent()){
            catalogueRepo.delete(c.get());
            return "Product Deleted Successfully!";
        }
        return "Ooops...  No Product Found!";
    }
}
