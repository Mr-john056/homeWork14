public abstract class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int creativity;

    public Kogtevran(String name, String surname, String transgression, String powerMagic, String mind, String wisdom, String creativity){
        super(name, surname, transgression, powerMagic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
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
}
