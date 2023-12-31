package com.avi.major.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.major.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByCategory_Id(Integer id);

}
