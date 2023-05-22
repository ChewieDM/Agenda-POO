package lista_iv_1;

public class Telefone extends Contato {
    private String telefone;

    public Telefone(String telefone) {
        super(TipoContato.TELEFONE);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Telefone [telefone = " + telefone + " TipoContato = " + tipo.toString() + "]";
    }
}
