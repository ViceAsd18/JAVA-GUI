package modelo;

public class Pokemon {
    private int idPokemon;
    private String nombre;
    private String especia;
    private String tipoPrincipal;
    private String tipoSecundario;
    private int nivel;
    private int idEntrenador;

    public Pokemon() {
    }

    public Pokemon(int idPokemon, String nombre, String especia, String tipoPrincipal, String tipoSecundario, int nivel, int idEntrenador) {
        this.idPokemon = idPokemon;
        this.nombre = nombre;
        this.especia = especia;
        this.tipoPrincipal = tipoPrincipal;
        this.tipoSecundario = tipoSecundario;
        this.nivel = nivel;
        this.idEntrenador = idEntrenador;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecia() {
        return especia;
    }

    public void setEspecia(String especia) {
        this.especia = especia;
    }

    public String getTipoPrincipal() {
        return tipoPrincipal;
    }

    public void setTipoPrincipal(String tipoPrincipal) {
        this.tipoPrincipal = tipoPrincipal;
    }

    public String getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(String tipoSecundario) {
        this.tipoSecundario = tipoSecundario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "idPokemon=" + idPokemon + ", nombre=" + nombre + ", especia=" + especia + ", tipoPrincipal=" + tipoPrincipal + ", tipoSecundario=" + tipoSecundario + ", nivel=" + nivel + ", idEntrenador=" + idEntrenador + '}';
    }
}
