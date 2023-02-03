package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.ZombieVillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class ZombieVillagerCostumeRenderer extends MobRenderer<ZombieVillager, ZombieVillagerModel<ZombieVillager>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/zombie_villager_costume.png");

    public ZombieVillagerCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new ZombieVillagerModel<>(p_173952_.bakeLayer(ModelLayers.ZOMBIE_VILLAGER)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(ZombieVillager p_114482_) {
        return COSTUME_LOCATION;
    }

}
