package core.basesyntax;

public abstract class Figure implements Area, Drawable, Randomizable {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
