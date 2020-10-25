package Modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "provincia", schema = "aed_geografia", catalog = "")
public class ProvinciaEntity {
    private int codProvincia;
    private String capitalProvincia;
    private String superficieProvincia;
    private String poblacionProvincia;
    private String nombreProvincia;

    @Id
    @Column(name = "codProvincia")
    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    @Basic
    @Column(name = "capitalProvincia")
    public String getCapitalProvincia() {
        return capitalProvincia;
    }

    public void setCapitalProvincia(String capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    @Basic
    @Column(name = "superficieProvincia")
    public String getSuperficieProvincia() {
        return superficieProvincia;
    }

    public void setSuperficieProvincia(String superficieProvincia) {
        this.superficieProvincia = superficieProvincia;
    }

    @Basic
    @Column(name = "poblacionProvincia")
    public String getPoblacionProvincia() {
        return poblacionProvincia;
    }

    public void setPoblacionProvincia(String poblacionProvincia) {
        this.poblacionProvincia = poblacionProvincia;
    }

    @Basic
    @Column(name = "nombreProvincia")
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvinciaEntity that = (ProvinciaEntity) o;
        return codProvincia == that.codProvincia &&
                Objects.equals(capitalProvincia, that.capitalProvincia) &&
                Objects.equals(superficieProvincia, that.superficieProvincia) &&
                Objects.equals(poblacionProvincia, that.poblacionProvincia) &&
                Objects.equals(nombreProvincia, that.nombreProvincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProvincia, capitalProvincia, superficieProvincia, poblacionProvincia, nombreProvincia);
    }
}
