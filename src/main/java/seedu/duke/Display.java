package seedu.duke;

import util.exceptions.LargeQuantityException;
import util.exceptions.ItemDoesNotExistException;
import util.exceptions.WrongCommandException;

import java.util.ArrayList;

public class Display {

//    public static void addGood(String id, String name, String qty,
//                               String desc, ArrayList<Orderline> userOrderlines) throws WrongCommandException {
//        if (id.isBlank() || name.isBlank() || qty.isBlank()) {
//            throw new WrongCommandException("add", true);
//        }
//        try {
//            Orderline orderline = new Orderline(
//                    Integer.parseInt(id),
//                    name,
//                    Integer.parseInt(qty),
//                    desc);
//            userOrderlines.add(orderline);
//            System.out.printf("%d %s %s added\n", orderline.getQuantity(), orderline,
//                    checkPlural(orderline.getQuantity()));
//        } catch (NumberFormatException e) {
//            throw new WrongCommandException("add", true);
//        }
//    }

    // Function to print grammar for statements to print
//    public static String checkPlural(int numberOfGoods) {
//        if (numberOfGoods <= 1) {
//            return "is ";
//        } else {
//            return "are ";
//        }
//    }


    // Prompts

    public static void warehouseInitPrompt(){
        System.out.println("New login. Please type the total number of goods"
                + " your warehouse can hold");
    }

    // process output
    public static void tryRestoreWarehouseState(){
        System.out.println("Attempt to restore warehouse state from savefile");
    }

    // state output
    public static void warehouseCapacity(String capacity){
        System.out.printf("Current Warehouse capacity is %d m3\n", capacity );
    }

    // successful output

    public static void orderAdded(String id){
        System.out.println("Order " + id + " is added");
    }

    public static void inventoryGoodQtyRemoved(Float qty, String goodName) {
        System.out.println(qty + " of " + goodName + " has been removed.");
    }

    public static void orderlineCheckedOff(String unitGoodName, String orderId) {
        System.out.println(unitGoodName + "of order " + orderId + " has been removed.");
    }



    public static void displayStorageCapacity(Float percentageCapacity) {
        System.out.println("Storage capacity: " + percentageCapacity + '%');
    }

    public static void warehouseStateSaved(String filepath) {
        System.out.println("Warehouse information succesfully stored in " + filepath);
    }

    public static void warehouseStateRestored(){
        System.out.println("Warehouse state successfully restored!");
    }

    // error outputs
    public static void nonExistentGood() {
        System.out.println("The goods you are trying to remove are not on the current list. "
                + "Please try another id or add the goods first.");
    }

    public static void qtyRemoveMoreThanExists() {
        System.out.println("The quantity input is larger than the current quantity of the goods. "
                + "Please enter the command again with a smaller quantity.");
    }

    public static void capacityOccupiedInvalid(){
        System.out.println("Occupied capacity provided is invalid");
    }

    public static void totalCapacityInvalid(){
        System.out.println("Total capacity provided is invalid");
    }

    // exception outputs
    public static void goodDontExistException() {
        System.out.println("This type of Good you are trying to remove does not exist.\n"
                + "Please type a valid id.");
    }

    public static void serializeException(String obj) {
        System.out.println("The following " + obj + " has trouble serializing."); // perhaps reattempt reserializing?
    }

    public static void largeQuantityException(String a, String b){
        System.out.println(a + " shouldn't exceed " + b);
    }

    public static void jsonParseException(String fp){
        System.out.println("File: " + fp + " is not a valid json file.");
    }

    public static void numberFormatException(){
        System.out.println("Number formatting invalid");
    }

    public static void numberFormatException(String val, String type){
        System.out.println(val + " can't be intrepreted as type " + type);
    }



    // Command related

    public static void help() {
        System.out.println("* Add order `add o/ id/ID r/RECEIVER a/SHIPPING_ADDRESS`\n"
                + "* Add good `add g/ oid/ORDER_ID gid/GOOD_ID n/NAME q/QUANTITY d/DESCRIPTION`\n"
                + "* Remove order: `remove o/ i/ID`\n"
                + "* Remove good: `remove g/ i/ID q/QUANTITY`\n"
                + "* List all orders: `list o/`\n"
                + "* List all goods: `list g/`\n"
                + "* View order: `view o/ id/ORDER_ID`\n"
                + "* View good: `view g/ id/GOOD_ID`\n"
                + "* Total quantity of goods: `total g/`\n"
                + "* Total quantity of orders: `total o/`\n"
                + "* Storage capacity of warehouse: `storage-capacity`");
    }

    public static void tryCommandAgain() {
        System.out.println("Please enter the command again.");
    }


}
