package Business.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hardik
 */

public class EnterpriseDirectory {

    private List<Hotel> listOfHotel;
    private List<BusinessEvent> listOfEvents;
    private List<HealthClub> listOfHealthClub;
    private List<Restaurant> listOfRestaurants;

    public EnterpriseDirectory() {
        listOfHotel = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfHealthClub = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
    }

    public List<Hotel> getListOfHotel() {
        return listOfHotel;
    }

    public void setListOfHotel(List<Hotel> listOfHotel) {
        this.listOfHotel = listOfHotel;
    }

    public List<BusinessEvent> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<BusinessEvent> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<HealthClub> getListOfHealthClub() {
        return listOfHealthClub;
    }

    public void setListOfHealthClub(List<HealthClub> listOfHealthClub) {
        this.listOfHealthClub = listOfHealthClub;
    }

    public List<Restaurant> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void setListOfRestaurants(List<Restaurant> listOfRestaurants) {
        this.listOfRestaurants = listOfRestaurants;
    }

    public void addHealthClub(String name, String contact) {
        HealthClub healthClub = new HealthClub(name, contact);
        listOfHealthClub.add(healthClub);
    }

    public void addRestaurant(String name, String contact) {
        Restaurant restaurant = new Restaurant(name, contact);
        listOfRestaurants.add(restaurant);
    }

    public void addBusinessEvent(String name, String contact) {
        BusinessEvent event = new BusinessEvent(name, contact);
        listOfEvents.add(event);
    }

    public void addHotel(String name, String contact) {
        Hotel hotel = new Hotel(name, contact);
        listOfHotel.add(hotel);
    }

    public Hotel findHotel(String hotelName) {
        for (Hotel hotel : listOfHotel) {
            if (hotel.getName().equals(hotelName)) {
                return hotel;
            }
        }
        return null;
    }

    public HealthClub findHealthClub(String clubName) {
        for (HealthClub club : listOfHealthClub) {
            if (club.getName().equals(clubName)) {
                return club;
            }
        }
        return null;
    }

    public Restaurant findRestaurant(String name) {
        for (Restaurant restaurant : listOfRestaurants) {
            if (restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public BusinessEvent findEvent(String name) {
        for (BusinessEvent event : listOfEvents) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public void deleteEnterpriseEvent(BusinessEvent event) {
        listOfEvents.remove(event);
    }

    public void deleteEnterpriseHealthClub(HealthClub health) {
        listOfHealthClub.remove(health);
    }

    public void deleteEnterpriseRestaurant(Restaurant res) {
        listOfRestaurants.remove(res);
    }

    public void deleteEnterpriseHotel(Hotel hotel) {
        listOfHotel.remove(hotel);
    }
}
