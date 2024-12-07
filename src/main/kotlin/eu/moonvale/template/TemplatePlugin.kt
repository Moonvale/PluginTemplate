package eu.moonvale.template

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

/**
 * Main class of the plugin
 */
class TemplatePlugin : JavaPlugin() {
    /**
     * Called when the plugin is enabled
     */
    override fun onEnable() {
        logger.info("Plugin enabled successfully!")
    }

    /**
     * Called when the plugin is disabled
     */
    override fun onDisable() {
        logger.info("Plugin disabled.")
    }
}
