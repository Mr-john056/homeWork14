public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int creativity;

    public Kogtevran(String name, String surname, String transgression, String powerMagic, String mind, String wisdom, String creativity) {
        super(name, surname, transgression, powerMagic);
        this.mind = Integer.parseInt(mind);
        this.wisdom = Integer.parseInt(wisdom);
        this.creativity = Integer.parseInt(creativity);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Свойства факультета Когтевран{" +
                "Ум =" + mind +
                ", Мудрость =" + wisdom +
                ", Творчество =" + creativity +
                '}';
    }

    public String compare(Kogtevran kogtevran) {
        return (mind + wisdom + creativity) > (int) kogtevran.mind + kogtevran.wisdom + kogtevran.creativity ?
                getName() + getSurname() + "Обладает большей мощностью магии чем " + kogtevran.getName() + kogtevran.getSurname() :
                getName() + getSurname() + "Обладает меньшей мощностью магии чем" + kogtevran.getName() + kogtevran.getSurname();
    }
}
