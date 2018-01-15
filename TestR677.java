import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class TestR677.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestR677
{
    /**
     * Default constructor for test class TestR677
     */
    public TestR677()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public ArrayList<String> t1(){
        EjercicioR677 objeto = new EjercicioR677();
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Adios");
        palabras.add("Hello");
        return objeto.devolverPalabraMasLarga(palabras);
    }
}
