import java.util.ArrayList;
import java.util.List;

// Clasa CasaDiscuri care extinde Subiect
class CasaDiscuri extends Subiect {
    private List<Album> albume = new ArrayList<>();
    private List<Artist> artisti = new ArrayList<>();

    public void adaugaAlbum(Album album) {
        albume.add(album);
        notificaObservatori("Album adăugat: " + album.getNume());
    }

    public void eliminaAlbum(Album album) {
        albume.remove(album);
        notificaObservatori("Album eliminat: " + album.getNume());
    }

    public void adaugaArtist(Artist artist) {
        artisti.add(artist);
        notificaObservatori("Artist adăugat: " + artist.getNume());
    }

    public void eliminaArtist(Artist artist) {
        artisti.remove(artist);
        notificaObservatori("Artist eliminat: " + artist.getNume());
    }
}
