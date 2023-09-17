public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, String transgression, String powerMagic, String nobility, String honor, String bravery) {
        super(name, surname, transgression, powerMagic);
        this.nobility = Integer.parseInt(nobility);
        this.honor = Integer.parseInt(honor);
        this.bravery = Integer.parseInt(bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Свойства факультета Гриффиндор{" +
                "Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery +
                '}';
    }

    public String compare(Griffindor griffindor) {
        return (nobility + honor + bravery) > (int) griffindor.getNobility() + griffindor.getHonor() + griffindor.getBravery() ?
                getName() + getSurname() + "Обладает большей мощностью магии чем " + griffindor.getName() + griffindor.getSurname() :
                getName() + getSurname() + "Обладает меньшей мощностью магии чем" + griffindor.getName() + griffindor.getSurname();
    }
}
