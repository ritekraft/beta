package com.ritekraft.catalogue.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Catalogue {
    @Id

    private Long id;


    private String title;


    private String author;


    private String isbn;

    private LocalDate publishedDate;

    private Double price;

    private String genre;

    private String language;

    private String publisher;


    private String description;

    private Integer numberOfPages;

    private Boolean availability;
}
