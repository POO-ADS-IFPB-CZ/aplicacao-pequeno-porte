package dao;

import java.util.Set;

//Padronizar os servicos
public interface Dao<T> {

    Set<T> listar();
    boolean salvar(T objeto);
    boolean atualizar(T objeto);
    boolean deletar(T objeto);

}
