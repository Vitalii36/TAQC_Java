package HW9;


enum Colors {RED, GREEN, WHITE};
enum Types {TRIANGULAR, SQUARE, RECTANGULAR};

public class Plants {

    public Integer size;
    public String color;
    public String type;

    Plants() {};
    Plants(Integer size, String color, String type){
        setSize(size);
        setColor(color);
        setType(type);
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setColor(String color) {
        try {
            Colors newColor = Colors.valueOf(color);
            this.color = color;
        }
        catch (Exception e) {
            ColorException newColorException = new ColorException();
            System.out.println(newColorException.toString());
        }
    }

    public void setType(String type) {
        try {
            Types newType = Types.valueOf(type);
            this.type = type;
        }
        catch (Exception e) {
            TypeException newTypeException = new TypeException();
            System.out.println(newTypeException.toString());
        }
    }
}