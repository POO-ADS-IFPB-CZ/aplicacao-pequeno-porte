package dao;

import java.io.*;
import java.util.HashSet;
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
    public Set<T> listar() throws IOException, ClassNotFoundException {
        if(file.length()>0){
            try(ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file)
            )){
               return (Set<T>) in.readObject();
            }
        }
        //Arquivo está vazio, retornar novo conjunto
        return new HashSet<>();
    }

    @Override
    public boolean salvar(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = listar();
        if(objetos.add(objeto)){
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    @Override
    public boolean atualizar(T objeto) {
        return false;
    }

    @Override
    public boolean deletar(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = listar();
        if(objetos.remove(objeto)){
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    private void atualizarArquivo(Set<T> objetos) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file)
        )){
            out.writeObject(objetos);
        }
    }

}