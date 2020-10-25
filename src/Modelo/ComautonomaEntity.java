package Modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comautonoma", schema = "aed_geografia", catalog = "")
public class ComautonomaEntity {
    private int codComAutonoma;
    private String poblacionComunidad;
    private String nombreComunidad;
    private String superficieComunidad;
    private String capitalComunidad;

    @Id
    @Column(name = "codComAutonoma")
    public int getCodComAutonoma() {
        return codComAutonoma;
    }

    public void setCodComAutonoma(int codComAutonoma) {
        this.codComAutonoma = codComAutonoma;
    }

    @Basic
    @Column(name = "poblacionComunidad")
    public String getPoblacionComunidad() {
        return poblacionComunidad;
    }

    public void setPoblacionComunidad(String poblacionComunidad) {
        this.poblacionComunidad = poblacionComunidad;
    }

    @Basic
    @Column(name = "nombreComunidad")
    public String getNombreComunidad() {
        return nombreComunidad;
    }

    public void setNombreComunidad(String nombreComunidad) {
        this.nombreComunidad = nombreComunidad;
    }

    @Basic
    @Column(name = "superficieComunidad")
    public String getSuperficieComunidad() {
        return superficieComunidad;
    }

    public void setSuperficieComunidad(String superficieComunidad) {
        this.superficieComunidad = superficieComunidad;
    }

    @Basic
    @Column(name = "capitalComunidad")
    public String getCapitalComunidad() {
        return capitalComunidad;
    }

    public void setCapitalComunidad(String capitalComunidad) {
        this.capitalComunidad = capitalComunidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComautonomaEntity that = (ComautonomaEntity) o;
        return codComAutonoma == that.codComAutonoma &&
                Objects.equals(poblacionComunidad, that.poblacionComunidad) &&
                Objects.equals(nombreComunidad, that.nombreComunidad) &&
                Objects.equals(superficieComunidad, that.superficieComunidad) &&
                Objects.equals(capitalComunidad, that.capitalComunidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codComAutonoma, poblacionComunidad, nombreComunidad, superficieComunidad, capitalComunidad);
    }
}
