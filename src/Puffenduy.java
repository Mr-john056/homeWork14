public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, String surname, String transgression, String powerMagic, String industriousness, String loyalty, String honesty) {
        super(name, surname, transgression, powerMagic);
        this.industriousness = Integer.parseInt(industriousness);
        this.loyalty = Integer.parseInt(loyalty);
        this.honesty = Integer.parseInt(honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Свойства факультета Пуффендуй{" +
                "Трудолюбие = " + industriousness +
                ", Честь = " + loyalty +
                ", Храбрость = " + honesty +
                '}';
    }

    public String compare(Puffenduy puffenduy) {
        return (industriousness + loyalty + honesty) > (int) puffenduy.industriousness + puffenduy.loyalty + puffenduy.honesty ?
                getName() + getSurname() + "Обладает большей мощностью магии чем " + puffenduy.getName() + puffenduy.getSurname() :
                getName() + getSurname() + "Обладает меньшей мощностью магии чем" + puffenduy.getName() + puffenduy.getSurname();
    }
}
