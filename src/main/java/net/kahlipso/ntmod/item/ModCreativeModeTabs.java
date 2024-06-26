package net.kahlipso.ntmod.item;

import net.kahlipso.ntmod.NewTrierMod;
import net.kahlipso.ntmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewTrierMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creative.custom_tab"))
            .displayItems((pParameters, pOutput) -> {
                //Material Items
                pOutput.accept(ModItems.SAPPHIRE.get());
                pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                //Items
                pOutput.accept(ModItems.METAL_DETECTOR.get());
                pOutput.accept(ModItems.SAPPHIRE_STAFF.get());

                //Foods and Consumables
                pOutput.accept(ModItems.STRAWBERRY.get());

                pOutput.accept((ModBlocks.SOUND_BLOCK.get()));

                pOutput.accept((ModBlocks.SAPPHIRE_BLOCK.get()));
                pOutput.accept((ModBlocks.RAW_SAPPHIRE_BLOCK.get()));

                pOutput.accept((ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()));
                pOutput.accept((ModBlocks.NETHER_SAPPHIRE_ORE.get()));
                pOutput.accept((ModBlocks.SAPPHIRE_ORE.get()));
                pOutput.accept((ModBlocks.END_STONE_SAPPHIRE_ORE.get()));

                pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
            })
            .build());
    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
