package pkg;

import org.tinylog.Logger;

public class main {

    public static void main(String[] args) {
        Logger.error("This is an ERROR");
        Logger.warn("This is a WARN");
        Logger.info("This is an INFO");
        Logger.debug("This is a DEBUG");
        Logger.trace("This is a TRACE");
        Logger.info("User's name is {}",System.getProperty("user.name"));
        Logger.info("User's name is "+System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"), "Something went wrong");
    }
}
