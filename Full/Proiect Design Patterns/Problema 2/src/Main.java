// Exemplu de utilizare
public class Main {
    public static void main(String[] args) {
        CasaDiscuri casaDiscuri = new CasaDiscuri();

        Observator fan1 = new Fan("John");
        Observator fan2 = new Fan("Jane");
        Observator critic1 = new Critic("Mike");

        casaDiscuri.adaugaObservator(fan1);
        casaDiscuri.adaugaObservator(fan2);
        casaDiscuri.adaugaObservator(critic1);

        Album album1 = new Album("Album 1");
        Album album2 = new Album("Album 2");
        Artist artist1 = new Artist("Artist 1");
        Artist artist2 = new Artist("Artist 2");

        casaDiscuri.adaugaAlbum(album1);
        casaDiscuri.adaugaArtist(artist1);

        casaDiscuri.eliminaAlbum(album1);
        casaDiscuri.eliminaArtist(artist1);
    }
}
