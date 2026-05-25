package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

//Padronizar os servicos
public interface Dao<T> {

    Set<T> listar() throws IOException, ClassNotFoundException;
    boolean salvar(T objeto) throws IOException, ClassNotFoundException;
    boolean atualizar(T objeto);
    boolean deletar(T objeto) throws IOException, ClassNotFoundException;

}
