package Modelo;

public class Produto {
    private String ID_PRODUTO;
    private String ID_FORNECEDOR;
    private String FORNECEDOR;
    private String NOME_PRODUTO;
    private String VALOR_UNI;
    private String FABRICANTE;

    public String getID_PRODUTO() {
        return ID_PRODUTO;
    }

    public void setID_PRODUTO(String ID_PRODUTO) {
        this.ID_PRODUTO = ID_PRODUTO;
    }

    public String getID_FORNECEDOR() {
        return ID_FORNECEDOR;
    }

    public void setID_FORNECEDOR(String ID_FORNECEDOR) {
        this.ID_FORNECEDOR = ID_FORNECEDOR;
    }

    public String getFORNECEDOR() {
        return FORNECEDOR;
    }

    public void setFORNECEDOR(String FORNECEDOR) {
        this.FORNECEDOR = FORNECEDOR;
    }

    public String getNOME_PRODUTO() {
        return NOME_PRODUTO;
    }

    public void setNOME_PRODUTO(String NOME_PRODUTO) {
        this.NOME_PRODUTO = NOME_PRODUTO;
    }

    public String getVALOR_UNI() {
        return VALOR_UNI;
    }

    public void setVALOR_UNI(String VALOR_UNI) {
        this.VALOR_UNI = VALOR_UNI;
    }

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public void setFABRICANTE(String FABRICANTE) {
        this.FABRICANTE = FABRICANTE;
    }
}
