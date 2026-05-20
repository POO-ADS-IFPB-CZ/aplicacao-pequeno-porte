void main() {

    File file = new File("data/arquivo.txt");

    if(!file.exists()){
        try{
            File parent = new File(file.getAbsoluteFile().getParent());
            parent.mkdir();
            file.createNewFile();
        }catch (IOException ex){
            System.out.println("Falha ao criar");
        }
    }

    System.out.println("Tamanho: "+file.length());
    System.out.println("Diretório pai: "+file.getAbsoluteFile().getParent());
    System.out.println("Caminho: "+file.getAbsoluteFile().getPath());

}
