public class Slizerin extends Hogwarts {
    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, String surname, String transgression, String powerMagic, String theTrick, String determination, String ambition, String resourcefulness, String lustForPower) {
        super(name, surname, transgression, powerMagic);
        this.theTrick = Integer.parseInt(theTrick);
        this.determination = Integer.parseInt(determination);
        this.ambition = Integer.parseInt(ambition);
        this.resourcefulness = Integer.parseInt(resourcefulness);
        this.lustForPower = Integer.parseInt(lustForPower);
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Свойства факультета Слизерин{" +
                "Хитрость = " + theTrick +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + lustForPower +
                '}';
    }

    public String compare(Slizerin slizerin) {
        return (theTrick + determination + ambition + resourcefulness + lustForPower) > (int) slizerin.theTrick + slizerin.determination + slizerin.ambition + slizerin.resourcefulness + slizerin.lustForPower ?
                getName() + getSurname() + "Обладает большей мощностью магии чем " + slizerin.getName() + slizerin.getSurname() :
                getName() + getSurname() + "Обладает меньшей мощностью магии чем" + slizerin.getName() + slizerin.getSurname();
    }
}
