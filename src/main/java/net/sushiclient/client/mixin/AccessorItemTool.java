package net.sushiclient.client.mixin;

import net.minecraft.item.ItemTool;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ItemTool.class)
public interface AccessorItemTool {

    @Accessor("attackDamage")
    float getAttackDamage();
}
