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
        Bukkit.getLogger().info("Plugin enabled successfully!")
    }

    /**
     * Called when the plugin is disabled
     */
    override fun onDisable() {
        Bukkit.getLogger().info("Plugin disabled.")
    }
}
