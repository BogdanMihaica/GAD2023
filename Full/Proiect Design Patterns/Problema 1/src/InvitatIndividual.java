// Clasa pentru invitații individuali
class InvitatIndividual extends Invitat {
    public InvitatIndividual(String nume) {
        super(nume);
    }

    public void adaugaInvitat(Invitat invitat) {
        throw new UnsupportedOperationException();
    }

    public void eliminaInvitat(Invitat invitat) {
        throw new UnsupportedOperationException();
    }

    public void afiseazaDetalii() {
        System.out.println("Invitat individual: " + nume);
    }
}
