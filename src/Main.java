import model.Pessoa;

void main() {

    File file = new File("data/Pessoas.dat");

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
        new Pessoa("111.111.111-01","João"),
        new Pessoa("222.222.222-02", "Maria"),
        new Pessoa("333.333.333-03", "Pedro")
    );

    try(ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream(file)
    )){
        out.writeObject(pessoas);
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado");
    } catch (IOException e) {
        System.out.println("Falha ao escrever no arquivo");
    }


}
