package br.Dio.com.lab.padrao.projetos.service;

import br.Dio.com.lab.padrao.projetos.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}