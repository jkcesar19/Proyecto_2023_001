package Dato.Clase;

/**
 * @fecha: 01/02/2023
 * @author Llaguento Carlos Cesar Jk
 */
public class ArchivoPdf {
private int idpdf;
private String usuar;
private String destino;
private String nompdf;
private String asunto;
private String descrip;
private byte[] pdf;
private String estado;
private String est;

    public int getIdpdf() {
        return idpdf;
    }

    public void setIdpdf(int idpdf) {
        this.idpdf = idpdf;
    }

    public String getUsuar() {
        return usuar;
    }

    public void setUsuar(String usuar) {
        this.usuar = usuar;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNompdf() {
        return nompdf;
    }

    public void setNompdf(String nompdf) {
        this.nompdf = nompdf;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

}
