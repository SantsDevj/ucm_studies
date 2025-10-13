package inter_exercises.ex005;

public class Tarefa {
    
    //Atributos desta Classe
    private String titulo;
    private Prioridade pr;
    private Integer duracaoMinutos;

    

    public Tarefa(String titulo, Prioridade pr, Integer duracaoMinutos) {
        this.titulo = titulo;
        this.pr = pr;
        this.duracaoMinutos = duracaoMinutos;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Prioridade getPr() {
        return pr;
    }
    public void setPr(Prioridade pr) {
        this.pr = pr;
    }
    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
