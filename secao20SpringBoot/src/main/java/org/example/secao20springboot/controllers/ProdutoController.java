package org.example.secao20springboot.controllers;

import jakarta.validation.Valid;
import org.example.secao20springboot.models.entities.Produto;
import org.example.secao20springboot.models.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{nome}")
    public Iterable<Produto> obterProduto(@PathVariable String nome){
        return produtoRepository.findByNomeContaining(nome);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable int id){
            return produtoRepository.findById(id);
    }

    @GetMapping("/pagina/{numeroPagina}")
    public Iterable<Produto> obterPorNumerosPagina(@PathVariable int numeroPagina){
        Pageable page = PageRequest.of(numeroPagina - 1, 3);
        return produtoRepository.findAll(page);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
    
}
