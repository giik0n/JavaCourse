import java.awt.*;

public class Door extends Rectangle{
    int length, width;
    String material;
    Color color;
    boolean isLock, isRightHanded;
    public Door(int length, int width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public boolean isRightHanded() {
        return isRightHanded;
    }

    public void setRightHanded(boolean rightHanded) {
        isRightHanded = rightHanded;
    }
}
