public class Email {
    private String direccionEmail;
    private TipoEmail tipo;

    public Email(String direccionEmail, TipoEmail tipo) {
        this.direccionEmail = direccionEmail;
        this.tipo = tipo;

    }
    public String getDireccionEmail() {
        return direccionEmail;

    }
    public void setDireccionEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }
    public TipoEmail getTipo() {
        return tipo;
    }
    public void setTipo(TipoEmail tipo) {
        this.tipo = tipo;
    }


}
