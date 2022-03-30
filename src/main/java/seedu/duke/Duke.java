package seedu.duke;

import util.exceptions.NullException;

/**
 * Main entry-point for the java.duke.Duke application.
 */
public class Duke {
    public static void hello() {
        String logo = "Simplst";
        System.out.println("Hello from\n" + logo);
        System.out.println("What would you like to do?");
    }

    private static void bye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) throws NullException {
        UserInterface ui;
        // boolean isSaveFileLoaded = hasSaveFileLoad();

        hello();
        Warehouse w = new Warehouse();
        Display.tryRestoreWarehouseState();

        if (false) {
            // load save file;
            // int capacity = 0;
            // welcome user back;
            // ui = new UserInterface(new Warehouse(capacity));
        } else {
            Boolean restoreStatus = false;
            restoreStatus = w.restoreWarehouseState();
            if (!restoreStatus){
                Display.warehouseInitPrompt();
                w = new Warehouse();
                w.setTotalCapacity(1000f);
            } else {
                // SUCCESS
                Display.warehouseStateRestored();
            }
            ui = new UserInterface(w);
        }
        ui.run();
        bye();
    }
}
