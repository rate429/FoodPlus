package foodplus.Content.Items.Food;

import foodplus.Content.Items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class Charry {
    public static final FoodComponent CHARRY_FOOD_COMPONENT = new FoodComponent.Builder()
		.alwaysEdible()
		.snack()
		// The duration is in ticks, 20 ticks = 1 second
		.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6 * 20, 1), 1.0f)
		.build();
    
    public static final Item CHARRY_FOOD = ModItems.register(
		new Item(new Item.Settings().food(CHARRY_FOOD_COMPONENT)),
		"Charry_Food"
    );
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
		.register((itemGroup) -> itemGroup.add(CHARRY_FOOD));
     }
}
