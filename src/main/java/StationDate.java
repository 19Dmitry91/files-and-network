public class StationDate {

    private String name;
    private String date;

    public StationDate(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "StationDates{" + "name = " + name + "\\" + ", date = " + date + "\\" + "}";
    }
}
