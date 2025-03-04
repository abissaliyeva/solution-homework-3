package assignment3;

import assignment1.Dungeon;
import mud.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon();
        Room room = new Room("prototype","blablabla");

        Room room1 = room.cloneEntity();   //clones 'room'
        Room room2 = room.cloneEntity();   //clones 'room'
        Room room3 = room1.cloneEntity();  //clones 'room1'

        room1 = new Room("room1","clones the prototype");
        room2 = new Room("room2",room2.getDescription()); //clones
        room3 = new Room("room3",room1.getDescription());

        dungeon.addRooms(room);
        dungeon.addRooms(room1);
        dungeon.addRooms(room2);
        dungeon.addRooms(room3);

        dungeon.show();
    }
}
