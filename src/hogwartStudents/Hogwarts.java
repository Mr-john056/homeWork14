public class Hogwarts {
    private String name;
    private String surname;
    private int transgression;
    private int powerMagic;

    public Hogwarts(String name, String surname, int transgression, int powerMagic) {
        this.name = name;
        this.surname = surname;
        this.transgression = transgression;
        this.powerMagic = powerMagic;
    }

    @Override
    public String toString() {
        return "Основные свойства{" +
                "Трансгрессия = " + transgression +
                ", Сила магии = " + powerMagic +
                '}';
    }

    public String compare(Hogwarts hogwarts) {
        return (powerMagic + transgression) > (hogwarts.getPowerMagic() + hogwarts.getTransgression()
                + hogwarts.getName() + hogwarts.getSurname() + "Обладает большей мощностью магии чем ") + hogwarts.getName() + hogwarts.getSurname();
        return getName() + getSurname() + "Обладает меньшей мощностью магии чем" + hogwarts.getName() + hogwarts.getSurname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }
}
