package assignment1;

import mud.Room;

public interface IDungeonBuilder {

    public void setName(String name);
    public String getName();
    public void addRoom(Room room);
    public void addNPC(NPC npc);
}
