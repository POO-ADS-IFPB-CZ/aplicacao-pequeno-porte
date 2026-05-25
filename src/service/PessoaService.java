package service;

import dao.GenericDao;
import model.Pessoa;

import java.io.IOException;
import java.util.Set;

//Gerenciar regras de negócio
public class PessoaService {

    private GenericDao<Pessoa> pessoaDao;

    public PessoaService() throws IOException {
        pessoaDao = new GenericDao<>("data/Pessoas.dat");
    }

    public Set<Pessoa> listar() throws IOException, ClassNotFoundException {
        return pessoaDao.listar();
    }

    public boolean salvar(Pessoa pessoa) throws IOException, ClassNotFoundException {
        return pessoaDao.salvar(pessoa);
    }

    public boolean atualizar(Pessoa pessoa) throws IOException, ClassNotFoundException {
        return pessoaDao.atualizar(pessoa);
    }

    public boolean deletar(Pessoa pessoa) throws IOException, ClassNotFoundException {
        return pessoaDao.deletar(pessoa);
    }

}
