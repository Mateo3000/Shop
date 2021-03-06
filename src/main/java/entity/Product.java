package entity;

public class Product {
    private Long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private Integer productCount;

    public Product(Long id, String productName, float price, float weight, String color, Integer productCount)
    {
        this.id = id;
        this.productName = productName;
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.productName = productName;
    }
    public Long getId ()
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

    public void setProductCount(Integer productCount)
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
