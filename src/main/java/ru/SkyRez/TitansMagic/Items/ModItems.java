package ru.SkyRez.TitansMagic.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.SkyRez.TitansMagic.TitansMagic;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TitansMagic.MODID);
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

    public static final RegistryObject<Item> GlyphPen = ITEMS.register("glyph_pen",
            ()-> new Item(new Item.Properties()));
}
