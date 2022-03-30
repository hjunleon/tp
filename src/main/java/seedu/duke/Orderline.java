package seedu.duke;

import org.json.simple.JSONObject;
import seedu.duke.JsonKeyConstants.GoodKeys;
import seedu.duke.JsonKeyConstants.OrderlinesKeys;

/*
 * Class to handle the Goods information
 *
 * FOR NOW id we can manually input?
 * Ideas - id can track and give to the goods we add automatically
 */
public class Orderline extends Good {
    private int quantityFulfilled = 0;
    private Boolean isCheckedOff = false;
//    private Good good;

    public Orderline(String SKU, String name, String description, Float unitPrice, String unitItem,
                     Boolean isUnitWhole, Float baseArea, Float volume, Boolean isPerishable,
                     Float quantity
    ) {
        super(SKU, name, description, unitPrice, unitItem, isUnitWhole, baseArea, volume, isPerishable, quantity);
    }

    public void checkOff() {
        this.isCheckedOff = true;
    }

    public int getQuantityFulfilled() {
        return quantityFulfilled;
    }

    public void setQuantityFulfilled(int quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }

//    public Good getGood(){
//        return this.good;
//    }
//
//    public int getGoodId(){
//        return this.good.getId();
//    }

    public JSONObject serialize() {
        JSONObject jo = super.serialize();
        jo.put(OrderlinesKeys.isCheckedOff, this.isCheckedOff);
        jo.put(OrderlinesKeys.quantityFulfilled, this.quantityFulfilled);
        return jo;
    }

}
