package DZ036;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;

    public Model() {
        this.films = new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm){
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);
    }

    public Collection getAllFilm(){
        return films.values();
    }
}

class Film{
    private String title;
    private String genre;
    private String director;
    private String yearOfRelease;
    private String duration;
    private String atelier;
    private String actors;

    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название");
        this.genre = (String) dictFilm.get("жанр");
        this.director = (String) dictFilm.get("режисёра");
        this.yearOfRelease = (String) dictFilm.get("год выпуска");
        this.duration = (String) dictFilm.get("длительность");
        this.atelier = (String) dictFilm.get("студию");
        this.actors = (String) dictFilm.get("актёров");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDuration() {
        return duration;
    }

    public String getAtelier() {
        return atelier;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ')';
    }
}