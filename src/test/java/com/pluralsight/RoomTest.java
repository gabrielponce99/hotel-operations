package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //arrange
        Room room = new Room(1, 139, false, false);

        //act
        room.checkIn();

        //assert: expected then actual
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomNotOccupiedAndStillDirty() {
        Room room = new Room(1, 139, true, false);

        room.checkOut();

        assertEquals(false, room.isOccupied());
        assertEquals(false, room.isDirty());
        assertEquals(true, room.isAvailable());
    }

    @Test
    public void cleanRoom_should_markRoomAvailableAndStillDirty() {
        Room room = new Room(1, 139, false, true);

        room.cleanRoom();

        assertEquals(false, room.isOccupied());
        assertEquals(false, room.isDirty());
        assertEquals(true, room.isAvailable());
    }

}