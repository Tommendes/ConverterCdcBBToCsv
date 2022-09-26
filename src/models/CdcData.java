package models;

import java.util.Objects;

public class CdcData {
    private String nome;
    private String cpf;
    private String contrato;
    private String dataContrato;
    private Integer parcela;
    private Integer parcelas;
    private String valor;

    public CdcData() {
    };


    public CdcData(String nome, String cpf, String contrato, String dataContrato, Integer parcela, Integer parcelas, String valor) {
        this.nome = nome;
        this.cpf = cpf;
        this.contrato = contrato;
        this.dataContrato = dataContrato;
        this.parcela = parcela;
        this.parcelas = parcelas;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContrato() {
        return this.contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDataContrato() {
        return this.dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Integer getParcela() {
        return this.parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public Integer getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public CdcData nome(String nome) {
        setNome(nome);
        return this;
    }

    public CdcData cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public CdcData contrato(String contrato) {
        setContrato(contrato);
        return this;
    }

    public CdcData dataContrato(String dataContrato) {
        setDataContrato(dataContrato);
        return this;
    }

    public CdcData parcela(Integer parcela) {
        setParcela(parcela);
        return this;
    }

    public CdcData parcelas(Integer parcelas) {
        setParcelas(parcelas);
        return this;
    }

    public CdcData valor(String valor) {
        setValor(valor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CdcData)) {
            return false;
        }
        CdcData cdcData = (CdcData) o;
        return Objects.equals(nome, cdcData.nome) && Objects.equals(cpf, cdcData.cpf) && Objects.equals(contrato, cdcData.contrato) && Objects.equals(dataContrato, cdcData.dataContrato) && Objects.equals(parcela, cdcData.parcela) && Objects.equals(parcelas, cdcData.parcelas) && Objects.equals(valor, cdcData.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, contrato, dataContrato, parcela, parcelas, valor);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", contrato='" + getContrato() + "'" +
            ", dataContrato='" + getDataContrato() + "'" +
            ", parcela='" + getParcela() + "'" +
            ", parcelas='" + getParcelas() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }

}
