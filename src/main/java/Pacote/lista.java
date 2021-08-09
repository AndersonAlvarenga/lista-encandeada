package Pacote;

public class lista<T> {

    private No<T> noRef;

    public lista() {
        this.noRef = null;
    }
    public T get(int index){
        return this.getNo(index).getDado();
    }
    public T remove(int index){
        System.out.println("entro");
        this.validaIndex(index);
        No<T>pivo = this.getNo(index);
        if(index== 0){
            this.noRef=pivo.getProximoNo();
            return pivo.getDado();
        }
        No<T> noAnterior = this.getNo(index-1);
        noAnterior.setProximoNo(pivo.getProximoNo());
        return pivo.getDado();

    }
    private No<T> getNo(int index){
        this.validaIndex(index);
        No<T> noAux = this.noRef;
        No<T> noResp = null;
        for(int i = 0;i<=index;i++){
            noResp = noAux;
            noAux=noAux.getProximoNo();
        }
        return noResp;
    }

    public void add(T conteudo) {
        No<T> novo = new No(conteudo);
        if(isEmpty()){
            this.noRef=novo;
            return;
        }
        No<T> noAux = this.noRef;
        for(int i = 0;i<this.size()-1;i++){
            noAux=noAux.getProximoNo();
        }
        noAux.setProximoNo(novo);
    }

    public int size() {
        int tamanho=0;
        No noAux = this.noRef;
        while (true) {
            if (noAux != null) {
                tamanho++;
                if (noAux.getProximoNo() != null) {
                    noAux = noAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanho;
    }
    private void validaIndex(int index){
        if(index>this.size()){
            throw new IndexOutOfBoundsException("Index maior que o tamanho da lista");
        }
    }

    public boolean isEmpty() {
        return this.noRef == null ? true : false;
    }

    @Override
    public String toString() {
        String srt = "";
        No<T> noAux = this.noRef;
        for(int i = 0;i<this.size();i++){
            srt+="Conteudo: "+noAux.getDado()+" ------->";
            noAux=noAux.getProximoNo();
        }
        return srt+="null";
    }
}
