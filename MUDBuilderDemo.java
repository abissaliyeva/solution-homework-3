package assignment1;

import mud.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Room room1 = new Room("room","some random room");
        NPC npc = new NPC("npc");

        Dungeon dungeon = builder.setName("dungeon").addRoom(room1).addNPC(npc).build();

        dungeon.show();
    }
}
