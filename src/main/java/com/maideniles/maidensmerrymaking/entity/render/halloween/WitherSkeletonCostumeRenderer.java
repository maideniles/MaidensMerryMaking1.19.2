package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class WitherSkeletonCostumeRenderer extends MobRenderer<WitherSkeleton, SkeletonModel<WitherSkeleton>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/wither_skeleton_costume.png");

    public WitherSkeletonCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new SkeletonModel<>(p_173952_.bakeLayer(ModelLayers.WITHER_SKELETON)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(WitherSkeleton p_114482_) {
        return COSTUME_LOCATION;
    }

}
