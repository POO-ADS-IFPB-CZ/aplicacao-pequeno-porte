void main() {

    File file = new File("arquivo.txt");

    if(!file.exists()){
        try{
            file.createNewFile();
        }catch (IOException ex){
            System.out.println("Falha ao criar");
        }
    }

}
