package net.elad1010.ice_age.item;

import net.elad1010.ice_age.IceAge;
import net.elad1010.ice_age.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IceAge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ICE_AGE_TAB = CREATIVE_MODE_TABS.register("ice_age_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ICE_STONE.get()))
                    .title(Component.translatable("creativetab.ice_age_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ICE_SHARD.get());

                        pOutput.accept(ModBlocks.ICE_STONE.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
