/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.repositories;

/**
 *
 * @author 22890
 */

import com.examen.examen.models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.examen.examen.models.Produit;

public interface ProduitRepository extends MongoRepository<Produit, String>{
    
}