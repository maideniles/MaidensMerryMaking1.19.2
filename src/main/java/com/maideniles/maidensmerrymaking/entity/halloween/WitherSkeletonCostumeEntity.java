package com.maideniles.maidensmerrymaking.entity.halloween;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.piglin.AbstractPiglin;
import net.minecraft.world.level.Level;

public class WitherSkeletonCostumeEntity extends WitherSkeleton {
    public WitherSkeletonCostumeEntity(EntityType<? extends WitherSkeleton> p_34166_, Level p_34167_) {
        super(p_34166_, p_34167_);
    }

    protected void registerGoals() {
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractPiglin.class, true));
        super.registerGoals();
    }

    public boolean canBeAffected(MobEffectInstance p_34192_) {
        return p_34192_.getEffect() == MobEffects.WITHER ? false : super.canBeAffected(p_34192_);
    }
}
