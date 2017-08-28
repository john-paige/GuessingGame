import java.util.Random;


public class Jar {
    private String itemsInJar;
    private int itemCapacity;
    private int itemCount;

    public Jar(String itemsInJar, int itemCapacity) {
        this.itemsInJar = itemsInJar;
        this.itemCapacity = itemCapacity;
    }

    public void fill() {
        Random rd = new Random();
        itemCount = rd.nextInt(itemCapacity) + 1;
    }


    public String getItemsInJar() {
        return itemsInJar;
    }

    public void setItemsInJar(String itemsInJar) {
        this.itemsInJar = itemsInJar;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getItemCapacity() {
        return this.itemCapacity;
    }

    public void setItemCapacity(int itemCapacity) {
        this.itemCapacity = itemCapacity;
    }
}

