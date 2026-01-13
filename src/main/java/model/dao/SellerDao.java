package model.dao;

import model.entitites.Seller;

import java.util.List;

public interface SellerDao {

    void inset(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
