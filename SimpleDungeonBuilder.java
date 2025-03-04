package assignment1;

import mud.Room;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon();
    }
    public IDungeonBuilder setName(String name) {
        dungeon.setName(name);
        return this;
    }
    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRooms(room);
        return this;
    }
    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNpcs(npc);
        return this;
    }
    public Dungeon build() {
        return dungeon;
    }
}
