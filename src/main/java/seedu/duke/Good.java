package seedu.duke;

import org.json.simple.JSONObject;
import seedu.duke.JsonKeyConstants.GoodKeys;

public class Good extends UnitGood {
    private int id;
    private Float quantity = 0f;

    public Good(String SKU, String name, String description, Float unitPrice, String unitItem,
                Boolean isUnitWhole, Float baseArea, Float volume, Boolean isPerishable,
                Float quantity
    ) {
        super(SKU, name, description, unitPrice, unitItem, isUnitWhole, baseArea, volume, isPerishable);
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }


    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (float) quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public void removeQuantity(Float quantity) {
        this.quantity -= quantity;
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public JSONObject serialize() {
        JSONObject jo = super.serialize();
        jo.put(GoodKeys.quantity,this.quantity);
        return jo;
    }






//    public UnitGood assignUnitGood(
//            String SKU, String name,
//            String description,
//            Float unitPrice,
//            String unitItem,
//            Boolean isUnitWhole,
//            Float baseArea,
//            Float volume,
//            Boolean isPerishable) {
//        UnitGood newUnitGood = new UnitGood(SKU,
//                name, description, unitPrice, unitItem, isUnitWhole, baseArea, volume, isPerishable
//        );
//        setUnitGood(newUnitGood);
//        return newUnitGood;
//    }

//    public void setUnitGood(UnitGood unitGood) {
//        this.unitGood = unitGood;
//    }


//    public UnitGood getUnitGood() {
//        return this.unitGood;
//    }


}
