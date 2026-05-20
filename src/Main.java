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

    try(ObjectInputStream in = new ObjectInputStream(
            new FileInputStream(file)
    )){
        List<Pessoa> pessoas = (List<Pessoa>) in.readObject();
        System.out.println(pessoas);
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado");
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Falha ao ler arquivo");
    } catch (ClassNotFoundException e) {
        System.out.println("Falha ao converter para pessoas");
    }

//    List<Pessoa> pessoas = List.of(
//            new Pessoa("111.111.111-01", "João",
//                    LocalDate.of(2000,2,3)),
//            new Pessoa("222.222.222-02", "Maria",
//                    LocalDate.of(2000,2,3)),
//            new Pessoa("333.333.333-03", "Pedro",
//                    LocalDate.of(2000,2,3))
//
//            );
//
//    try(ObjectOutputStream out = new ObjectOutputStream(
//            new FileOutputStream(file)
//    )){
//        out.writeObject(pessoas);
//    } catch (FileNotFoundException e) {
//        System.out.println("Arquivo não encontrado");
//    } catch (IOException e) {
//        System.out.println("Falha ao escrever no arquivo");
//    }


}
