
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste TestProperty.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TestProperty
{

    private Property property1;

    /**
     * Construtor default para a classe de teste TestProperty
     */
    public TestProperty()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        property1 = new Property("T3 Monte Belo", 150000.0);
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
        property1 = null;
    }

    @Test
    public void testConstructor(){
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0 , property1.getPrice()); 
    }

    @Test
    public void testToStrng(){
        assertEquals("Descricao    : T3 Monte Belo\nPreco        : 150000.0",
                     property1.toString());
    }
}
