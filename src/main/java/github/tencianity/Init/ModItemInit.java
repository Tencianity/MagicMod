package github.tencianity.Init;

import github.tencianity.MagicMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItemInit {

    public static final Item FIRE_BALL = register("fire_ball", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, MagicMod.id(name), item);
    }

    public static void load() {}
}
