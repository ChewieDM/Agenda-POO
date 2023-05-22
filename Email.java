package lista_iv_1;

public class Email extends Contato {
    private String email;

    public Email(String email) {
        super(TipoContato.EMAIL);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Email(email = " + email + " TipoContato = " + tipo.toString() + ")";
    }
}
