package assignment2;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name,this.description,this.health);
    }

    @Override
    public void show() {
        System.out.println(getName() + ": " + getDescription() + "\thealth: " + getHealth());
    }
}
