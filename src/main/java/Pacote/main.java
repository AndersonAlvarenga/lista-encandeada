package Pacote;

public class main {
    public static  void main(String[] args){

        //criar lista
        lista<String> minhaFila = new lista<String>();

        //Adicionar itens na lisat
        minhaFila.add("teste1");
        minhaFila.add("teste2");
        minhaFila.add("teste3");
        minhaFila.add("teste4");


        //imprimir conteudo por posição
        System.out.println(minhaFila.get(0));
        System.out.println(minhaFila.get(1));
        System.out.println(minhaFila.get(2));
        System.out.println(minhaFila.get(3));

        System.out.println(minhaFila);

        minhaFila.remove(1);

        System.out.println(minhaFila);
    }
}
