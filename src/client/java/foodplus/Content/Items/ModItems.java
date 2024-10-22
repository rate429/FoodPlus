package foodplus.Content.Items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import foodplus.FoodPlus;

public class ModItems {
    public static Item register(Item item, String id) {
		// Create the identifier for the item.
		Identifier itemID = Identifier.of(FoodPlus.MOD_ID, id);

		// Register the item.
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

		// Return the registered item!
		return registeredItem;
	}


    public static void initialize() {
        
    }
}
