package ru.netology.statistic;

public class Poster {
    private int filmID;
    private String titleFilm;
    private String filmGenre;

    public Poster(int filmID, String titleFilm, String filmGenre) {
        this.filmGenre = filmGenre;
        this.titleFilm = titleFilm;
        this.filmID = filmID;
    }

    public int getFilmID() {
        return filmID;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
