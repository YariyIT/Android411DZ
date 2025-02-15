package DZ036;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;
    private String dbName;
    public Model() {
        this.dbName = "db.txt";
        this.films = loadData(); // new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm){
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);
    }

    public Collection getAllFilm(){
        return films.values();
    }
    public Map getSingleFilm(String userTitle){
        Film film = films.get(userTitle);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", film.getTitle());
        dictFilm.put("жанр", film.getGenre());
        dictFilm.put("режиссёр", film.getDirector());
        dictFilm.put("год выпуска", film.getYearOfRelease());
        dictFilm.put("длительность", film.getDuration());
        dictFilm.put("студия", film.getAtelier());
        dictFilm.put("актёры", film.getActors());
        return dictFilm;
    }

    public Film removeFilm(String userTitle){
        return films.remove(userTitle);
    }

    public void saveData(){
        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(dbName))){
            oss.writeObject(films);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbName))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex){
            return new LinkedHashMap<>();
        }
    }


}

class Film implements Serializable {
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