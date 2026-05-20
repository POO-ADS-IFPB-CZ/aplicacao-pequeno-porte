import model.Pessoa;

void main() {

    File file = new File("data/Pessoas.txt");

    if(!file.exists()){
        try{
            File parent = new File(file.getAbsoluteFile().getParent());
            parent.mkdir();
            file.createNewFile();
        }catch (IOException ex){
            System.out.println("Falha ao criar");
        }
    }

    List<Pessoa> pessoas = List.of(
            new Pessoa("111.111.111-01", "João"),
            new Pessoa("222.222.222-02", "Maria"),
            new Pessoa("333.333.333-03", "Pedro")
    );

    //Jeito desorganizado de fazer a escrita...
    try(BufferedWriter writer = new BufferedWriter(
            new FileWriter(file, true)
    )){
        for(Pessoa pessoa : pessoas){
            writer.write(pessoa.getCpf());
            writer.write(';');
            writer.write(pessoa.getNome());
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Falha ao escrever no arquivo");
    }


}
