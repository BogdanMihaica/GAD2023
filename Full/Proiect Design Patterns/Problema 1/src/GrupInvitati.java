import java.util.ArrayList;
import java.util.List;


class GrupInvitati extends Invitat {
    private List<Invitat> invitatList;

    public GrupInvitati(String nume) {
        super(nume);
        invitatList = new ArrayList<>();
    }

    public void adaugaInvitat(Invitat invitat) {
        invitatList.add(invitat);
    }

    public void eliminaInvitat(Invitat invitat) {
        invitatList.remove(invitat);
    }

    public void afiseazaDetalii() {
        System.out.println("Grup de invitați: " + nume);
        for (Invitat invitat : invitatList) {
            invitat.afiseazaDetalii();
        }
    }
}
