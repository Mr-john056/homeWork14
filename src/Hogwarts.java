public class Hogwarts {
    private String name;
    private String surname;
    private int transgression;
    private int powerMagic;

    public Hogwarts(String name, String surname, String transgression, String powerMagic) {
        this.name = name;
        this.surname = surname;
        this.transgression = Integer.parseInt(transgression);
        this.powerMagic = Integer.parseInt(powerMagic);
    }

    public String toString() {
        return "Основные свойства{" +
                "Трансгрессия = " + transgression +
                ", Сила магии = " + powerMagic +
                '}';
    }

    public String compare(Hogwarts hogwarts) {
        return (powerMagic + transgression) > (int) hogwarts.getPowerMagic() + hogwarts.getTransgression() ?
                getName() + getSurname() + "Обладает большей мощностью магии чем " + hogwarts.getName() + hogwarts.getSurname() :
                getName() + getSurname() + "Обладает меньшей мощностью магии чем" + hogwarts.getName() + hogwarts.getSurname();
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
