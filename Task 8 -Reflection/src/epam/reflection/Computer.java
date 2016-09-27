package epam.reflection;

/**
 * Created by Витал on 26.09.2016.
 */
public class Computer {

      protected Group name;
    protected double frequency;
    protected int amount;
    protected int operMemory;
    protected int constMemory;

    public Computer() {
    }

    public Computer(Group name, double frequency, int amount, int operMemory, int constMemory) {
        this.name = name;
        this.frequency = frequency;
        this.amount = amount;
        this.operMemory = operMemory;
        this.constMemory = constMemory;
    }


    public Group getName() {
        return name;
    }

    public void setName(Group name) {
        this.name = name;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOperMemory() {
        return operMemory;
    }

    public void setOperMemory(int operMemory) {
        this.operMemory = operMemory;
    }

    public int getConstMemory() {
        return constMemory;
    }

    public void setConstMemory(int constMemory) {
        this.constMemory = constMemory;
    }


    public void setAllParameters(Group name, double frequency, int amount, int operMemory, int constMemory) {
        this.name = name;
        this.frequency = frequency;
        this.amount = amount;
        this.operMemory = operMemory;
        this.constMemory = constMemory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", amount=" + amount +
                ", operMemory=" + operMemory +
                ", constMemory=" + constMemory +
                '}';
    }
}

