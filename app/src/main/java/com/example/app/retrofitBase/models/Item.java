package com.example.app.retrofitBase.models;

import com.google.gson.annotations.SerializedName;

public class Item {
    private String _id;
    private String __v;
    private String lacre;
    private String processo;
    private String posicao;
    private String grupo;
    private String obs;
    private String imagem;



    public
    String getText() {
        return text;
    }

    @SerializedName("body")
    private String text;


    public
    String get_id() {
        return _id;
    }

    public
    String get__v() {
        return __v;
    }

    public
    String getLacre() {
        return lacre;
    }

    public
    void setLacre(String lacre) {
        this.lacre = lacre;
    }

    public
    String getProcesso() {
        return processo;
    }

    public
    void setProcesso(String processo) {
        this.processo = processo;
    }

    public
    String getPosicao() {
        return posicao;
    }

    public
    void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public
    String getGrupo() {
        return grupo;
    }

    public
    void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public
    String getObs() {
        return obs;
    }

    public
    void setObs(String obs) {
        this.obs = obs;
    }

    public
    String getImagem() {
        return imagem;
    }

    public
    void setImagem(String imagem) {
        this.imagem = imagem;
    }


}
