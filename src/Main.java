import dao.GenericDao;
import model.Pessoa;
import service.PessoaService;

void main() {

    PessoaService service = null;
    try {
        service = new PessoaService();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    try {
        Optional<Pessoa> pessoa = service.buscarPorCpf("222.222.222-02");
        if(pessoa.isPresent()){

        }
    } catch (IOException e) {
        System.out.println("Falha ao abrir arquivo");
    } catch (ClassNotFoundException e) {
        System.out.println("Falha ao ler arquivo");
    }

}
