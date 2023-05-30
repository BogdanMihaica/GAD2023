import java.util.ArrayList;
import java.util.List;

// Clasa abstractă pentru invitați
abstract class Invitat {
    protected String nume;

    public Invitat(String nume) {
        this.nume = nume;
    }

    public abstract void adaugaInvitat(Invitat invitat);
    public abstract void eliminaInvitat(Invitat invitat);
    public abstract void afiseazaDetalii();
}
