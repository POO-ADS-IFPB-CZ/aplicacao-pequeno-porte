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

    //Jeito desorganizado de fazer a leitura...
    try(BufferedReader reader = new BufferedReader(
            new FileReader(file)
    )){
        List<Pessoa> pessoas = reader.lines().map(l -> {
            String[] strings = l.split(";");
            String cpf = strings[0];
            String nome = strings[1];
            return new Pessoa(cpf,nome);
        }).toList();
        System.out.println(pessoas);
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado");
    } catch (IOException e) {
        System.out.println("Falha ao ler arquivo");
    }


}
