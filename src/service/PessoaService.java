package service;

import dao.GenericDao;
import exception.IdadeInvalidaException;
import model.Pessoa;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;
import java.util.Set;

//Gerenciar regras de negócio
public class PessoaService {

    private GenericDao<Pessoa> pessoaDao;

    public PessoaService() throws IOException {
        pessoaDao = new GenericDao<>("data/Pessoas.dat");
    }
    
    public Optional<Pessoa> buscarPorCpf(String cpf) throws IOException, 
            ClassNotFoundException {
        return pessoaDao.listar().stream()
                .filter(p -> p.getCpf().equals(cpf))
                .findFirst();
    }

    public Set<Pessoa> listar() throws IOException, ClassNotFoundException {
        return pessoaDao.listar();
    }

    public boolean salvar(Pessoa pessoa) throws IOException, ClassNotFoundException,
            IdadeInvalidaException {
        if(validarPessoa(pessoa)){
            return pessoaDao.salvar(pessoa);
        }
        return false;
    }

    public boolean atualizar(Pessoa pessoa) throws IOException, ClassNotFoundException {
        return pessoaDao.atualizar(pessoa);
    }

    public boolean deletar(Pessoa pessoa) throws IOException, ClassNotFoundException {
        return pessoaDao.deletar(pessoa);
    }

    private boolean validarPessoa(Pessoa pessoa) throws
            IdadeInvalidaException{
        if(Period.between(pessoa.getNascimento(), LocalDate.now())
                .getYears()<14){
            throw new IdadeInvalidaException(
                    "Usuário não pode ter menos de 14 anos");
        }
        //TODO: Fazer mais validações
        return true;
    }

}
