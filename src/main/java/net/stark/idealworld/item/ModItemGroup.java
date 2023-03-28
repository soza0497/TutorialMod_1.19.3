package net.stark.idealworld.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stark.idealworld.TutorialMod;

public class ModItemGroup {
    public static ItemGroup CITRINE;
    public static void registerItemGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup_citrine"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
