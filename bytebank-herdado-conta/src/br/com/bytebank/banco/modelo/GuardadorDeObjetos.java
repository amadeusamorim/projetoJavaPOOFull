package br.com.bytebank.banco.modelo;

public class GuardadorDeObjetos {

    private Object[] objetos;
    private int ref;

    public GuardadorDeObjetos() {

        this.objetos = new Object[10];
    }

    public void adicionaObjeto (Object objeto) {

        this.objetos[ref] = objeto;
        this.ref++;
    }

    public Object getObjeto (int posicao) {

        return this.objetos[posicao];
    }

    public int getRef() {

        return this.ref;
    }

}