import java.util.Objects;
    /*
        * @author Alexander Panishchev
        *Task:
        * Inheritance
        2. Create another class as a super class for your one.  Or create a daughterly class for your one.
        * */
public class FlatRectangularBox extends  RectangularBox{
    int id, length, width;
    // Child class of RectangularBox
    public FlatRectangularBox(int length, int width) {
        super(length, width, 0);
        this.id = id;
        this.length = length;
        this.width = width;
    }
    //------------Getters-Setters------------------
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlatRectangularBox that = (FlatRectangularBox) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

        @Override
        public String toString() {
            return getClass().getName()+" {" +
                    "id=" + id +
                    ", length=" + length +
                    ", width=" + width +
                    '}';
        }
    }
