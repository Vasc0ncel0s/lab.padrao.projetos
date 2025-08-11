package br.Dio.com.lab.padrao.projetos.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.Dio.com.lab.padrao.projetos.model.Endereco;


    @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
    public interface ViaCepService {

        @GetMapping("/{cep}/json/")
        Endereco consultarCep(@PathVariable("cep") String cep);
    }

