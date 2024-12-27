package modelo;

public class Estadisticas {
    private int idPokemon;
    private int victorias;
    private int derrotas;
    private int combatesTotales;

    public Estadisticas() {
    }

    public Estadisticas(int idPokemon, int victorias, int derrotas, int combatesTotales) {
        this.idPokemon = idPokemon;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.combatesTotales = combatesTotales;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getCombatesTotales() {
        return combatesTotales;
    }

    public void setCombatesTotales(int combatesTotales) {
        this.combatesTotales = combatesTotales;
    }

    @Override
    public String toString() {
        return "Estadisticas{" + "idPokemon=" + idPokemon + ", victorias=" + victorias + ", derrotas=" + derrotas + ", combatesTotales=" + combatesTotales + '}';
    }
}
