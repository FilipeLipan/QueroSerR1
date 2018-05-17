package gabriel.app.queroserr1.models.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ConfigurationQuestion extends RealmObject{
    @PrimaryKey
    private int id;
    private int tempo;
    private int tamanhoTextoEnunciado;
    private int tamanhoTextoOpcoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTamanhoTextoEnunciado() {
        return tamanhoTextoEnunciado;
    }

    public void setTamanhoTextoEnunciado(int tamanhoTextoEnunciado) {
        this.tamanhoTextoEnunciado = tamanhoTextoEnunciado;
    }

    public int getTamanhoTextoOpcoes() {
        return tamanhoTextoOpcoes;
    }

    public void setTamanhoTextoOpcoes(int tamanhoTextoOpcoes) {
        this.tamanhoTextoOpcoes = tamanhoTextoOpcoes;
    }
}
