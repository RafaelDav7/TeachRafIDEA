import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {
    static Cat newCat;

    @BeforeEach
    public void setUp() {
         newCat = new Cat("Murka", 3);
    }

    @Test
    public void shouldGetAge() {
        Assertions.assertEquals(3, newCat.getAge());
    }
    @Test
    public void shouldMeow() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assertions.assertEquals( "Meow!", output.toString());
    }
    @Test
    public void shouldSetName() {
        newCat.name = "Vasia";
        Assertions.assertEquals(newCat.name, "Vasia");
    }
    @Test
    public void shouldGetName() {
        Assertions.assertEquals(newCat.name, "Murka");
    }
    @AfterEach
    public  void remove() {
        newCat = null;
    }


}
