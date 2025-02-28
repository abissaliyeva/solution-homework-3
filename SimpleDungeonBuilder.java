package assignment1;

import mud.Room;
import assignment1.Dungeon;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void addNPC(NPC npc) {
        npcs.add(npc);
    }
    public
}
