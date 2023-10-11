import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}