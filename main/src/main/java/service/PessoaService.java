package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Pessoa;
import repository.PessoaRepository;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    // Aqui você pode adicionar os métodos para manipular as pessoas
}
