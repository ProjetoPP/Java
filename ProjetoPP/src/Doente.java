public class Doente {
    private String codigo;
    private String nome;
    private String localidade;
    private String enfermariaInternado;
    private String numeroCama;
    private String estado; //moderado, grave ou muito grave
    private String dataEntrada;
    private String dataSaida;
    
    public Doente() {
    }
    
    public Doente(String codigo, String nome, String localidade, String localInternamento, String numeroCama, String estado, String dataEntrada, String dataSaida) {
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.enfermariaInternado = localInternamento;
        this.numeroCama = numeroCama;
        this.estado = estado;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getCodigoDoente() {
        return codigo;
    }

    public void setCodigoDoente(String codigoDoente) {
        this.codigo = codigoDoente;
    }

    public String getNomeDoente() {
        return nome;
    }

    public void setNomeDoente(String nomeDoente) {
        this.nome = nomeDoente;
    }

    public String getLocalidadeOrigem() {
        return localidade;
    }

    public void setLocalidadeOrigem(String localidadeOrigem) {
        this.localidade = localidadeOrigem;
    }

    public String getEnfermariaInternado() {
        return enfermariaInternado;
    }

    public void setEnfermariaInternado(String enfermariaInternado) {
        this.enfermariaInternado = enfermariaInternado;
    }

    public String getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(String numeroCama) {
        this.numeroCama = numeroCama;
    }

    public String getGravidadeEstado() {
        return estado;
    }

    public void setGravidadeEstado(String gravidadeEstado) {
        this.estado = gravidadeEstado;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Doente{" + "codigo=" + codigo + ", nome=" + nome + ", localidade=" + localidade + ", enfermariaInternado=" + enfermariaInternado + ", numeroCama=" + numeroCama + ", estado=" + estado + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + '}';
    }
    
    
}
