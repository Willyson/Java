
package Model;

import java.util.Date;


public class Pessoa {
    private String idPessoa;
    private String nomePessoa; 
    private Date DtNasc;
    private Logradouro end;

    public Pessoa(String idPessoa, String nomePessoa, Date DtNasc) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.DtNasc = DtNasc;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Date getDtNasc() {
        return DtNasc;
    }

    public void setDtNasc(Date DtNasc) {
        this.DtNasc = DtNasc;
    }

    public Logradouro getEnd() {
        return end;
    }

    public void setEnd(Logradouro end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", DtNasc=" + DtNasc + ", end=" + end + '}';
    }
    
    
    
}
