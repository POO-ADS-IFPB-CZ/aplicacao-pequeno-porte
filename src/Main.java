import dao.GenericDao;
import model.Pessoa;

void main() {

    GenericDao<Pessoa> genericDao = null;

    try {
        genericDao = new GenericDao<>(
                "data/Pessoas.dat");
    } catch (IOException e) {
        System.out.println("Falha ao abrir arquivo");
    }

    try{
        System.out.println(genericDao.listar());
    } catch (IOException e) {
        System.out.println("Falha ao abrir arquivo");
    } catch (ClassNotFoundException e) {
        System.out.println("Falha ao ler arquivo");
    }

}
