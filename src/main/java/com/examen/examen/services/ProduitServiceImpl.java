/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.services;

/**
 *
 * @author 22890
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.models.Produit;
import com.examen.examen.repositories.ProduitRepository;

@Service
public class ProduitServiceImpl extends ProduitService {
    
    @Autowired
    private ProduitRepository produitRepository;

    public Produit create(Produit data){
        return produitRepository.save(data);
    }
    public Produit update(Produit data) {
        return produitRepository.save(data);
    }

    public List<Produit> findAll(){
        return produitRepository.findAll();
    }
    public Optional<Produit> findById(String id){
        return produitRepository.findById(id);
    }
    public void delete(String id){

        produitRepository.deleteById(id);
    }
}
