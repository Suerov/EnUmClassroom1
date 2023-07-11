public enum Week {
    Monday("Monday" + "\n" + "Дуйшонбу куну жава окуйм"),
    Tusday("Tuesday" + "\n" + "Шейшемби куну Англис тил сабагын окуйм ");
    private String Name;
    Week(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString() {
        return "Week:" + "\n" +
                "Name:" + Name;
    }
}
