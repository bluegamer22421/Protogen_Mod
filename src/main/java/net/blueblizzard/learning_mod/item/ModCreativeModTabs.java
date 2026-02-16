package net.blueblizzard.learning_mod.item;

import net.blueblizzard.learning_mod.LearningMod;
import net.blueblizzard.learning_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PROTOGEN_TAB = CREATIVE_MODE_TABS.register("learningmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAM.get()))
                    .title(Component.translatable("creativetab.learningmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAM.get());

                        output.accept(ModBlocks.RAM_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
