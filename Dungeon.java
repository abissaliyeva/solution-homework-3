package assignment1;

import mud.Room;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    public Dungeon() {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<NPC> getNpcs() {
        return npcs;
    }

    public void addNpcs(NPC npc) {
        this.npcs.add(npc);
    }

    public void addRooms(Room room) {
        this.rooms.add(room);
    }
    public void show() {
        System.out.println("dungeon name: " + getName());
        System.out.println("rooms: " );
        for (Room room: rooms) {
            System.out.println(room.getName() + ": " + room.getDescription());
        }
        System.out.println("NPCs: ");
        for (NPC npc: npcs) {
            System.out.println(npc.getName());
        }
    }
}
