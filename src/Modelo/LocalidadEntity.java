package Modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "localidad", schema = "aed_geografia", catalog = "")
public class LocalidadEntity {
    private int codLocalidad;
    private String nombreLocalidad;
    private String poblacionLocalidad;
    private String capitalLocalidad;

    @Id
    @Column(name = "codLocalidad")
    public int getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(int codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    @Basic
    @Column(name = "nombreLocalidad")
    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    @Basic
    @Column(name = "poblacionLocalidad")
    public String getPoblacionLocalidad() {
        return poblacionLocalidad;
    }

    public void setPoblacionLocalidad(String poblacionLocalidad) {
        this.poblacionLocalidad = poblacionLocalidad;
    }

    @Basic
    @Column(name = "capitalLocalidad")
    public String getCapitalLocalidad() {
        return capitalLocalidad;
    }

    public void setCapitalLocalidad(String capitalLocalidad) {
        this.capitalLocalidad = capitalLocalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalidadEntity that = (LocalidadEntity) o;
        return codLocalidad == that.codLocalidad &&
                Objects.equals(nombreLocalidad, that.nombreLocalidad) &&
                Objects.equals(poblacionLocalidad, that.poblacionLocalidad) &&
                Objects.equals(capitalLocalidad, that.capitalLocalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codLocalidad, nombreLocalidad, poblacionLocalidad, capitalLocalidad);
    }
}
