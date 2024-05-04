package net.elad1010.ice_age.item;

import net.elad1010.ice_age.IceAge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IceAge.MOD_ID);

    public final static RegistryObject<Item> ICE_SHARD = ITEMS.register("ice_shard", IceShard::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
