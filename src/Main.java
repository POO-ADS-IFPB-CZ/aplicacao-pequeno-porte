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

    //Jeito desorganizado...
    try(BufferedWriter writer = new BufferedWriter(
            new FileWriter(file, true)
    )){
        writer.write("Hello World");
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Falha ao escrever no arquivo");
    }


}
