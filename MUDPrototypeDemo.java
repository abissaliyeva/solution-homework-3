package assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room room = new Room("prototype","all rooms are same");
        NPC npc = new NPC("prototype","all npcs are same",100);

        Room room1 = room.cloneEntity();
        Room room2 = room.cloneEntity();

        room1 = new Room("clone",room1.getDescription());
        room2 = new Room(room1.getName(),room2.getDescription());

        NPC npc1 = npc.cloneEntity();
        NPC npc2 = npc.cloneEntity();

        npc1 = new NPC("clone NPC",npc1.getDescription(),75);
        npc2 = new NPC("clone2 NPC",npc2.getDescription(),50);

        room.show();
        room1.show();
        room2.show();

        npc.show();
        npc1.show();
        npc2.show();
    }
}
