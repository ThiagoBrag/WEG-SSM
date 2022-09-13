package net.weg.wegssm.model.entities;

public class Solicitante {
    private String nomeUsuario, senhaUsuario, emailUsuario;

    public boolean login(String emailUsuario, String senhaUsuario) {
        return true;
    }

    public void criarDemanda() {}

    public void editarDemanda() {};
}
