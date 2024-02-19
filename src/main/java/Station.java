public class Station {

    private String name;
    private String line;
    private boolean hasConnection;

    public Station(String name, String line, boolean hasConnection) {
        this.name = name;
        this.line = line;
        this.hasConnection = hasConnection;
    }

    public String getName() {
        return name;
    }

    public String getLine() {
        return line;
    }

    public boolean getHasConnection() {
        return hasConnection;
    }

    @Override
    public String toString() {
        return "Station{" + "name = " + name + "\\" + ", line = " + line + "\\" + "}";
    }
}
