package Pacote;

public class No<T> {

    private T dado;
    private No proximoNo;

    public No(T dado) {
        this.dado = dado;
        this.proximoNo = null;
    }
    public No(){
        this.proximoNo = null;
    }

    public No(T dado, No proximoNo) {
        this.dado = dado;
        this.proximoNo = proximoNo;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
