package com.hudeing.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {

    private Context context;
    private SharedPreferences preferences;
    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private SharedPreferences.Editor editor;
    private final String CHAVE_NOME = "nome";

    public AnotacaoPreferencias(Context c) {
        this.context = c;
        this.preferences = this.context.getSharedPreferences(this.NOME_ARQUIVO, 0);
        this.editor = this.preferences.edit();
    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(this.CHAVE_NOME, anotacao);
        editor.commit();
    }

    public String recuperarAnotacao() {
        return this.preferences.getString(this.CHAVE_NOME,"");
    }
}
