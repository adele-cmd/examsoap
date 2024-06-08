/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.repositories;

/**
 *
 * @author 22890
 */
import org.springframework.data.mongodb.repository.MongoRepository;

import com.examen.examen.models.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String>{
    
}

