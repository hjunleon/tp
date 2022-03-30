package seedu.duke;

import org.json.simple.JSONObject;
import seedu.duke.JsonKeyConstants.UnitGoodKeys;

public class UnitGood {
    private int id;
    private String SKU;
    private String name;
    private String description;
    private Float unitPrice; //in dollars
    private String unitQuantity;
    private Boolean isUnitWhole;
    private Float baseArea;
    private Float volume;
    private Boolean isPerishable;

    public UnitGood(String SKU,
                    String name,
                    String description,
                    Float unitPrice,
                    String unitQuantity,
                    Boolean isUnitWhole,
                    Float baseArea,
                    Float volume,
                    Boolean isPerishable) {

        this.SKU = SKU;
        this.name = name;
        this.description = description;
        this.baseArea = baseArea;
        this.unitPrice = unitPrice;
        this.unitQuantity = unitQuantity;
        this.isUnitWhole = isUnitWhole;
        this.volume = volume;
        this.isPerishable = isPerishable;

    }

    public String getSummary() {
        return String.format("%s: %s\n" +
                        "Cost: $%.2f/%s",
                name, description, unitPrice, unitQuantity
        );
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%d - %s (%s)", id, name, description);
    }

    public JSONObject serialize() {
        JSONObject jo = new JSONObject();
        jo.put(UnitGoodKeys.id, this.id);
        jo.put(UnitGoodKeys.name, this.name);
        jo.put(UnitGoodKeys.SKU, this.SKU);
        jo.put(UnitGoodKeys.description, this.description);
        jo.put(UnitGoodKeys.unitPrice, this.unitPrice);
        jo.put(UnitGoodKeys.unitQuantity, this.unitQuantity);
        jo.put(UnitGoodKeys.isUnitWhole, this.isUnitWhole);
        jo.put(UnitGoodKeys.baseArea, this.baseArea);
        jo.put(UnitGoodKeys.volume, this.volume);
        jo.put(UnitGoodKeys.isPerishable, this.isPerishable);
        return jo;
    }


}
