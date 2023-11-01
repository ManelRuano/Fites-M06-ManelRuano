package cat.iesesteveterradas.fites;

import java.util.Objects;

/**
 * Estem parlant de serialitzar objectes.
 * Cal que s'asseguris que aquesta classe implementa
 * el necessari.
 */

public class Exercici3nau {
    private static final long serialVersionUID = 1L;

    String nom;
    String pais;
    int any;

    public Exercici3nau (String nom, String pais, int any) {
        this.nom = nom;
        this.pais = pais;
        this.any = any;
    }

    @Override
    public String toString () {
        return this.nom + ", " + this.pais + " " + this.any;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercici3nauSolucio)) return false;
        Exercici3nauSolucio that = (Exercici3nauSolucio) o;
        return any == that.any &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pais, any);
    }
}