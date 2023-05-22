package lista_iv_1;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    ArrayList<Contato> contatos = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public ArrayList<Contato> getContato(TipoContato tipo) {
        ArrayList<Contato> contatos_encontrados = new ArrayList<>();

        for (Contato contato : this.contatos) {
            if (contato.tipo == tipo) {
                contatos_encontrados.add(contato);
            }
        }

        return contatos_encontrados;
    }

    public boolean possuiEmail() {
        for (Contato contato : this.contatos) {
            if (contato.tipo == TipoContato.EMAIL) return true;
        }

        return false;
    }

    public boolean possuiTelefone() {
        for (Contato contato : this.contatos) {
            if (contato.tipo == TipoContato.TELEFONE) return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Pessoa [contatos=" + contatos + ", nome=" + nome + "]";
    }
}
