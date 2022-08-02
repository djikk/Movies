import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmManagerTest {

    @Test

    public void findAllFilms() {
        FilmsManager filmsManager = new FilmsManager(6);

        filmsManager.addFilm("film1");
        filmsManager.addFilm("film2");
        filmsManager.addFilm("film3");
        filmsManager.addFilm("film4");
        filmsManager.addFilm("film5");
        filmsManager.addFilm("film6");
        filmsManager.addFilm("film7");
        filmsManager.addFilm("film8");
        filmsManager.addFilm("film9");
        filmsManager.addFilm("film10");

        String[] actual = filmsManager.findAllFilms();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void LimitIsLessThanLength() {
        FilmsManager manager = new FilmsManager(9);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findLastFilms();
        String[] expected = {"film10","film9", "film8", "film7","film6", "film5", "film4", "film3", "film2"};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void LimitAndLengthAreEquals() {
        FilmsManager manager = new FilmsManager(10);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findLastFilms();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void LimitIsMoreThanLength() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findLastFilms();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }
}