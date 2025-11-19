package eu.pb4.sguinf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SGuiMod {
    public static final String MOD_ID = "sguinf";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static void initialize() {
        LOGGER.info("Server GUI (SGui) loaded!");
    }
}