

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    Company company1;
    User client1;
    User client2;
    User seller1;
    User seller2;
    Property property1;
    Property property2;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {   company1 =new Company();
        client1 = new User("José Manuel" , "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        property1 = new Property ("T1", 150000.0);
        property2 = new Property ("T3", 160000.0);
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
        assertNotNull(company1.getSellers());
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSells());
        assertNotNull(company1.getProperties());
        
    }
    
    @Test
    public void testRegisterClient(){
        company1.registerClient(client1);
    }
    
    @Test
    public void testRegisterClients(){
        company1.registerClient(client1);
        company1.registerClient(client2);
    }
    
    @Test 
    public void testRegisterClientDuplicate(){
        assertTrue(company1.registerClient(client1));
        assertFalse(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertFalse(company1.registerClient(null));
    }
    @Test 
    void testRegisterSeller(){
        company1.registerSeller(seller1);
    }
    
    @Test
    public void testRegisterSellers(){
        company1.registerSeller(seller1);
        company1.registerSeller(seller2);
    }
    @Test 
    public void testRegisterSellerDuplicate(){
        assertTrue(company1.registerClient(client1));
        assertFalse(company1.registerClient(client1));
    }
    @Test
    public void testRegisterSellerNull(){
        assertFalse(company1.registerClient(null));
    }
    @Test
    public void testRegisterPropertyNull(){
        assertFalse(company1.registerProperty(null));
    }
    @Test 
    public void testRegisterPropertyDuplicate(){
        assertTrue(company1.registerProperty(property1));
        assertFalse(company1.registerProperty(property1));
    }
    @Test
    public void testRegisterPropertys(){
        company1.registerProperty(property1);
        company1.registerProperty(property2);
    }
    @Test
    public void testRegisterProperty(){
        company1.registerProperty(property1);
    }
}
