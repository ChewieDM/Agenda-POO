package lista_iv_1;

import java.util.ArrayList;

public class Agenda {
    private String proprietario;
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Agenda() {}

    public Agenda(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa buscarPessoa(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }

        return null;
    }

    public void addContato(String nome, Contato contato) {
        Pessoa pessoa = buscarPessoa(nome);
        pessoa.addContato(contato);
    }

    public String exibirPessoas() {
        String ps = "";
        for (Pessoa pessoa : pessoas) {
            //System.out.println(pessoa.getNome());
            //System.out.println(pessoa.getContatos());
            ps += pessoa.toString();
            
        }
        return ps;

    }

    public void exibirContatosPessoas(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                System.out.println(pessoa.getContatos());
            }
        }
    }

    public void exibirPessoasComEmail() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.possuiEmail()) {
                System.out.println(pessoa.getNome());
            }
        }
    }

    public Pessoa recuperarPessoaPorEmail(String email) {
        for (Pessoa pessoa : pessoas) {
            ArrayList<Contato> contatos = pessoa.getContato(TipoContato.EMAIL);

            for (Contato contact : contatos) {
                if(contact instanceof Email) {
                    Email em = (Email) contact;

                    if (em.getEmail().equals(email)) {
                        return pessoa;
                    }
                }
            }
        }

        return null;
    }

    public Pessoa recuperarPessoaPorTelefone(String telefone) {
        for (Pessoa pessoa : pessoas) {
            ArrayList<Contato> contatos = pessoa.getContato(TipoContato.TELEFONE);

            for (Contato contact : contatos) {
                if(contact instanceof Telefone) {
                    Telefone tel = (Telefone) contact;

                    if (tel.getTelefone().equals(telefone)) {
                        return pessoa;
                    }
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Agenda [pessoas=" + pessoas + "]";
    }
}
