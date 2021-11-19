
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        
        stock.add(new Product(101, "RedWine"));
        stock.add(new Product(102, "AppleWine"));
        stock.add(new Product(103, "GrapesWine"));
        stock.add(new Product(104, "OrangeWine"));
        stock.add(new Product(105, "whiteWines"));
        stock.add(new Product(106, "RoseWine"));
        stock.add(new Product(107, "SparklingWine"));
        stock.add(new Product(108, "DesertWine"));
        stock.add(new Product(109, "FortifiedWine"));
        stock.add(new Product(110, "MerlotWine"));
        
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 1500);
        stock.buyProduct(102, 2500);
        stock.buyProduct(103, 8000);
        stock.buyProduct(104, 100);
        stock.buyProduct(105, 800);
        stock.buyProduct(106, 1700);
        stock.buyProduct(107, 1950);
        stock.buyProduct(108, 150);
        stock.buyProduct(109, 1000);
        stock.buyProduct(110, 4780);
        
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 700);
    }    
}