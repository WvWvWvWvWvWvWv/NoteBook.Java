public class Notebook {
    String name;
    int ozu;
    int disk;
    String op;
    String color;

    public Notebook(String name, int ozu, int disk, String op, String color) {
        this.name = name;
        this.ozu = ozu;
        this.disk = disk;
        this.op = op;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Название: " + name +
                ", ОЗУ: " + ozu +
                ", Объём Ж/Д: " + disk +
                ", Операционнная система: " + op +
                ", Цвет: " + color;
    }



}

