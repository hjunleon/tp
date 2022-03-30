package seedu.duke.ObjectFactories;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import seedu.duke.JsonKeyConstants.OrderKeys;
import seedu.duke.Order;
import seedu.duke.Orderline;
import util.exceptions.InvalidFileException;
import util.exceptions.InvalidObjectType;
import util.exceptions.WrongCommandException;

import java.util.ArrayList;
import java.util.Map;

public class OrderFactory {
    public static Order formOrder(Object orderObject) throws WrongCommandException, InvalidFileException, InvalidObjectType {
        String orderId = null;
        String receiver = null;
        String shippingAddress = null;
        ArrayList<Orderline> orderlines = new ArrayList<Orderline>();
        Float totalCost = 0F;
        String toFulfilBy = null;
        String fulfilledBy = null;
        Boolean isFulfilled = null;
        String comments = null;
        if (orderObject instanceof JSONObject) {
            JSONObject jOrderObject = (JSONObject) orderObject;
            boolean status = false;
            orderId = (String)jOrderObject.get(OrderKeys.orderId);
            receiver = (String)jOrderObject.get(OrderKeys.receiver);
            shippingAddress = (String)jOrderObject.get(OrderKeys.shippingAddress);
            totalCost = Float.parseFloat((String)jOrderObject.get(OrderKeys.totalCost));
            toFulfilBy = (String)jOrderObject.get(OrderKeys.toFulfilBy);
            isFulfilled = Boolean.parseBoolean((String)jOrderObject.get(OrderKeys.isFulfilled));
            comments = (String)jOrderObject.get(OrderKeys.comments);
            JSONArray jOrderlines = Json

            orderlines = (String)jOrderObject.get(OrderKeys.orderlines);
        } else if (orderObject instanceof Map) {
            Map orderMap = (Map) orderObject;
        } else {
            throw new InvalidObjectType("Order should either be JSONObject or Map type");
        }
        Order order = null;
        try {
            order = new Order(orderId, receiver, shippingAddress, toFulfilBy, comments);
        }
        return order;
}
