package assignment1;

import mud.Room;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    public Dungeon(String name){
        this.name = name;
        rooms = new ArrayList<>();
        npcs = new ArrayList<>();
    }
}
