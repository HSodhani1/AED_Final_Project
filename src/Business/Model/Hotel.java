package Business.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Business.Model.Room.RoomType;

/**
 *
 * @author Hardik
 */

public class Hotel extends Enterprise {

    private RoomList roomListDirec;
    private List<Manager> listOfManager;
    private List<LaundaryOrg> laundaryOrg;
    private List<TransportationOrg> transportationOrgList;

    public Hotel() {

    }

    public Hotel(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        roomListDirec = new RoomList();
        transportationOrgList = new ArrayList<>();
        laundaryOrg = new ArrayList<>();
    }

    public List<LaundaryOrg> getLaundaryOrg() {
        return laundaryOrg;
    }

    public void setLaundaryOrg(List<LaundaryOrg> laundaryList) {
        this.laundaryOrg = laundaryList;
    }

    public List<TransportationOrg> getTransportationOrgList() {
        return transportationOrgList;
    }

    public void setTransportationOrgList(List<TransportationOrg> transportationList) {
        this.transportationOrgList = transportationList;
    }

    public RoomList getRoomListDirec() {
        return roomListDirec;
    }

    public void setRoomListDirec(RoomList roomList) {
        this.roomListDirec = roomList;
    }

    public List<Room> availableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : roomListDirec.getListOfRooms()) {
            if (room.getRoomType().equals(roomType) && room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> bookRooms(Date startDate, Date endDate, int count, RoomType roomType) {
        List<Room> availableRooms = availableRooms(startDate, endDate, roomType);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("Rooms not available for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked room list
        return availableRooms.subList(0, count);
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUsername().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addLaundaryOrg(String name, String contact, String city) {
        LaundaryOrg laundaryOrg1 = new LaundaryOrg(name, contact, city);
        laundaryOrg.add(laundaryOrg1);
    }

    public void addTransportationOrg(String name, String contact, String networkName) {
        TransportationOrg to = new TransportationOrg(name, contact, networkName);
        transportationOrgList.add(to);
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

    public void deleteLaundary(LaundaryOrg laundary) {
        laundaryOrg.remove(laundary);
    }

    public void deleteTransportation(TransportationOrg transport) {
        transportationOrgList.remove(transport);
    }

}
