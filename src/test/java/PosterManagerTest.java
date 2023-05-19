import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Poster;
import ru.netology.statistic.PosterManager;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();
    Poster film1 = new Poster(1, "Бладшот", "боевик");
    Poster film2 = new Poster(1, "Вперед", "мультфильм");
    Poster film3 = new Poster(1, "Отель 'Белград'", "комедия");
    Poster film4 = new Poster(1, "Джентльмены", "боевик");
    Poster film5 = new Poster(1, "Человек-Невидимка", "ужасы");
    Poster film6 = new Poster(1, "Тролли.Мировой тур", "мультфильм");
    Poster film7 = new Poster(1, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
    }

    @Test
    public void shouldAddNewFilm() {
        Poster film8 = new Poster(8, "Фильм новый", "триллер");
        manager.addFilm(film8);
        Poster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8};
        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilm() {
        Poster[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm() {
        Poster[] expected = {film7, film6, film5, film4, film3};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmMoreLimit() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Poster[] expected = {film4, film3, film2};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmLessLimit() {
        PosterManager manager = new PosterManager(6);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Poster[] expected = {film4, film3, film2, film1};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmEqualsLimit() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Poster[] expected = {film4, film3, film2, film1};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
