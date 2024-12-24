package com.ritekraft.catalogue.service;

import com.ritekraft.catalogue.entity.Catalogue;

import java.util.List;

public interface CatalogueService {

    Catalogue addProduct (Catalogue catalogue);
    Catalogue updateProduct (Catalogue catalogue);
    List<Catalogue> getAllItems();
    String deleteProductById(String productId);
}
