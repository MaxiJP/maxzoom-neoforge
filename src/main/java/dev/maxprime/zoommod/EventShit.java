package dev.maxprime.zoommod;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

public class EventShit {

    public static final KeyMapping EXAMPLE_MAPPING = new KeyMapping(
            "key.maxszoommod.zoom", // Will be localized using this translation key
            InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
            GLFW.GLFW_KEY_C, // Default key is C
            "key.categories.misc" // Mapping will be in the misc category
    );

    @SubscribeEvent // on the mod event bus only on the physical client
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(EXAMPLE_MAPPING);
    }

}
