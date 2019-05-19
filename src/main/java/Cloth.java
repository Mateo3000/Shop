import javafx.scene.paint.Material;

public class Cloth extends Product {
    private String size;
    private Material material;

    public Cloth(long id, String productName, float price, float weight, String color, int productCount, String size, Material material)
    {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize()
    {
        return size;
    }

    public Material getMaterial()
    {
        return material;
    }
    @Override
    public String toString()
    {
        return super.toString() + "Cloth{" + "size='" + size + '\'' + ", material='" + material + '\'' + '}';
    }
}
