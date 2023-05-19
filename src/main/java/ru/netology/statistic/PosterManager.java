package ru.netology.statistic;

public class PosterManager {
    public Poster[] films = new Poster[0];
    private int limit = 5;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {

    }

    public void addFilm(Poster film) {
        Poster[] tmp = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Poster[] findAll() {
        return films;
    }

    public Poster[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        Poster[] tmp = new Poster[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
