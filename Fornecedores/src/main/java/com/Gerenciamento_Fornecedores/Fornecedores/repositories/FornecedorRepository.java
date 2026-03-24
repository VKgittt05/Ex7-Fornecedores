package com.Gerenciamento_Fornecedores.Fornecedores.repositories;

import com.Gerenciamento_Fornecedores.Fornecedores.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}

