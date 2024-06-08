/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.models;

/**
 *
 * @author 22890
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
   @Id
   private String id;
   private String codeProduit;
   private String nomProduit;
   private int quantite;
   private  double prixAchat;
   private double prixVente;
   private Boolean perissable;
   private Categorie categorie;

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

