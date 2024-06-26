
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        clients = new ArrayList<User>();
        sellers = new ArrayList<User>();
        properties = new ArrayList<Property>();
        sells = new ArrayList<Sell>();

    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return clients;         // dummy implementation
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return sellers;         // dummy implementation
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return properties;         // dummy implementation
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return sells;         // dummy implementation
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if (client == null) { return false; }
        for(User clientInCompany: this.clients){
            if(client.equals(clientInCompany) ){
                return false;
            }
        }
        clients.add(client);
        return true;    
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if (seller == null) { return false; }
        for(User sellerInCompany: this.sellers){
            if(seller.equals(sellerInCompany) ){
                return false;
            }
        }
        sellers.add(seller);
        return true; 
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
         if (property == null) { return false; }
        for(Property propertyInCompany: this.properties){
            if(property.equals(propertyInCompany) ){
                return false;
            }
        }
        properties.add(property);
        return true; 
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        return true;         // dummy implementation
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        //if (property == null) { return false; }
        Sell dummySell = new Sell(client, seller, property);
        for(Sell sellerInCompany: this.sells){
            if(dummySell.equals(sellerInCompany)){
                return false;
            }
        }
        sells.add(new Sell(client, seller, property));
        return true; 
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        int result = 0;
        for(Sell sellInList: sells){
            if(sellInList.getDate().getYear() == year) {
                result++;
            }
        }
        return result;
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public User findSellerOfTheYear(int year) {
        User result = null;
        int topSells = 0;
        for(Sell sellInList: sells){
            if(sellInList.getDate().getYear() == year){
                if(sellInList.getSeller() != result){
                    topSells++;
                    result = sellInList.getSeller();
                }
            }
        }
        return result;
    }

}
