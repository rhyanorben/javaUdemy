package org.example.secao20springboot.models.repositories;

import org.example.secao20springboot.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContaining(String nome);

}
