package assignment1;

import mud.Room;

import java.util.List;

public interface IDungeonBuilder {
    IDungeonBuilder setName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}
