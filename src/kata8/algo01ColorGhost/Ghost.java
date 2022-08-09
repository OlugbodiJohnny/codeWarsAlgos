package kata8.algo01ColorGhost;

public class Ghost {
    // your code goes here
    private String[] colorArray = new String[]{"white","yellow","purple","red"};
    private String color = colorArray[(int) (Math.random() * (3 + 1))];

    public String getColor () {
        return color;
    }
}
