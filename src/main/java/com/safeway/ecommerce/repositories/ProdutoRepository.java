package com.safeway.ecommerce.repositories;

import com.safeway.ecommerce.entities.Produto;
import com.safeway.ecommerce.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}