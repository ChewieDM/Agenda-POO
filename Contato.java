package lista_iv_1;

public abstract class Contato {
    protected TipoContato tipo;

    public Contato(TipoContato tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Contato [tipo=" + tipo + "]";
    }
}
