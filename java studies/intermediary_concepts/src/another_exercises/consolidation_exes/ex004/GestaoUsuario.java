package another_exercises.consolidation_exes.ex004;

public class GestaoUsuario {
    String UsuarioActual;

    public void iniciarSeccao(String nomeUsuario){
        this.UsuarioActual = nomeUsuario;
    }

    public void finalizarSeccao(){
        this.UsuarioActual = null;
    }
}
