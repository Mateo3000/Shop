public class Product {
    private long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private int productCount;

    public Product(long id, String productName, float price, float weight, String color, int productCount)
    {
        this.id = id;
        this.productName = productName;
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.productName = productName;
    }
    public long getId ()
    {
        return id;
    }
    public String getProductName()
    {
        return productName;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public Float getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }

    public void setProductCount(int productCount)
    {
        this.productCount = productCount;
    }
    @Override
    public String toString()
    {
        return "Product{" + "id=" + id + ", productName='" + productName + '\'' + ", price=" + price + ", weight=" + weight +
                ", color='" + color + '\'' + ", productCount=" + productCount + '}';
    }
}
