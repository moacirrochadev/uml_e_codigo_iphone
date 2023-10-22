import java.util.ArrayList;
import java.util.List;

class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }
}

class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        for (Musica musica : musicas) {
            System.out.println(musica.getNome() + " - " + musica.getArtista());
        }
    }
}

class ReprodutorDeMusica {
    private Playlist playlistAtual;

    public void reproduzirMusica(Musica musica) {
        System.out.println("Reproduzindo: " + musica.getNome() + " - " + musica.getArtista());
    }

    public void definirPlaylist(Playlist playlist) {
        this.playlistAtual = playlist;
    }
}

public class ExemploReprodutorDeMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Música 1", "Artista 1");
        Musica musica2 = new Musica("Música 2", "Artista 2");

        Playlist playlist = new Playlist("Minha Playlist");
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);

        ReprodutorDeMusica reprodutor = new ReprodutorDeMusica();
        reprodutor.definirPlaylist(playlist);
        reprodutor.reproduzirMusica(musica1);
    }
}

