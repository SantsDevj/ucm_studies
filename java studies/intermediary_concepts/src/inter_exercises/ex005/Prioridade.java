package inter_exercises.ex005;

public enum Prioridade {
    BAIXA(1), MEDIA(2), ALTA(3);

    private int nivel;

    Prioridade(int nivel){
        this.nivel = nivel;
    }

    //Método para obter valor do nível
    public int getNivel() {
        return nivel;
    }
}
