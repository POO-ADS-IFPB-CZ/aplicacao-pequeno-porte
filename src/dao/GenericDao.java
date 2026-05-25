package dao;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class GenericDao<T> implements Dao<T> {

    private File file;

    public GenericDao(String path) throws IOException {
        file = new File(path);
        if(!file.exists()){
            File parent = new File(file.getAbsoluteFile().getParent());
            parent.mkdir();
            file.createNewFile();
        }
    }

    @Override
    public Set<T> listar() {
        return Set.of();
    }

    @Override
    public boolean salvar(T objeto) {
        return false;
    }

    @Override
    public boolean atualizar(T objeto) {
        return false;
    }

    @Override
    public boolean deletar(T objeto) {
        return false;
    }
}