package Model.services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import Business.Model.Booking;
import Business.Model.BusinessEvent;

/**
 *
 * @author Aparna
 */

public class BusinessEventService extends Service {

    private Booking id;

    public static enum BusinessEventServiceType {
        PHOTOGRAPHY,
        DECOR,
        CATERING
    }

    private Map<BusinessEventServiceType, Integer> businessEventServiceTypes;

    public BusinessEventService(BusinessEvent business, Date eventDate) {
        super(business, ServiceType.BUSINESS_EVENT, eventDate);
        this.businessEventServiceTypes = new HashMap<>();
    }

    public Map<BusinessEventServiceType, Integer> getBusinessEventServiceTypes() {
        return businessEventServiceTypes;
    }

    public void setBusinessEventServiceTypes(Map<BusinessEventServiceType, Integer> businessEventServiceTypes) {
        this.businessEventServiceTypes = businessEventServiceTypes;
    }

    public void addService(BusinessEventServiceType type, int cost) {
        businessEventServiceTypes.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nBusiness Event service details:");
        sb.append("\n").append(TAB).append("Organization conducting event: ").append(enterprise);
        sb.append("\n").append(TAB).append("Date of event: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (businessEventServiceTypes == null || businessEventServiceTypes.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for the business event:");
            for (Map.Entry<BusinessEventServiceType, Integer> entry : businessEventServiceTypes.entrySet()) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", entry.getKey(), entry.getValue()));
            }
            sb.append("\n").append(TAB).append("Total cost for business event: $").append(totalCost);
        }
        return sb.toString();
    }
}
