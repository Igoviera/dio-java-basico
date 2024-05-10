public enum EsradoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    Rio_JANEIRO ("RJ", "Rio de Janeiro");

    private String nome;
    private String sigla;

    private EsradoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
