package com.maideniles.maidensmerrymaking.entity.custom;

import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;

public class ColoredChickenEntity extends Chicken {
    private static final Ingredient FOOD_ITEMS = Ingredient.of(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);
    public float flap;
    public float flapSpeed;
    public float oFlapSpeed;
    public float oFlap;
    public float flapping = 1.0F;
    private float nextFlap = 1.0F;
    public int eggTime = this.random.nextInt(6000) + 6000;
    public boolean isColoredChickenJockey;

    public ColoredChickenEntity(EntityType<? extends Chicken> p_28236_, Level p_28237_) {
        super(p_28236_, p_28237_);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    protected float getStandingEyeHeight(Pose p_28251_, EntityDimensions p_28252_) {
        return this.isBaby() ? p_28252_.height * 0.85F : p_28252_.height * 0.92F;
    }


    public static AttributeSupplier setAttributes() {
        return Chicken.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 4.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25f).build();
    }

    public void aiStep() {
        super.aiStep();
        this.oFlap = this.flap;
        this.oFlapSpeed = this.flapSpeed;
        this.flapSpeed = (float)((double)this.flapSpeed + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.flapSpeed = Mth.clamp(this.flapSpeed, 0.0F, 1.0F);
        if (!this.onGround && this.flapping < 1.0F) {
            this.flapping = 1.0F;
        }

        this.flapping = (float)((double)this.flapping * 0.9D);
        Vec3 vec3 = this.getDeltaMovement();
        if (!this.onGround && vec3.y < 0.0D) {
            this.setDeltaMovement(vec3.multiply(1.0D, 0.6D, 1.0D));
        }

        this.flap += this.flapping * 2.0F;
        if (!this.level.isClientSide && this.isAlive() && !this.isBaby() && !this.isColoredChickenJockey() && --this.eggTime <= 0) {
            this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            if(random.nextInt(5)== 0){
                this.spawnAtLocation(ModItems.PURPLE_EGG.get());
            }
           else if(random.nextInt(5)== 1){
                this.spawnAtLocation(ModItems.PINK_EGG.get());
            }

           else if(random.nextInt(5)== 2){
                this.spawnAtLocation(ModItems.BLUE_EGG.get());
            }

           else if(random.nextInt(5)== 3){
                this.spawnAtLocation(ModItems.YELLOW_EGG.get());
            }

           else  if(random.nextInt(5)== 4){
                this.spawnAtLocation(Items.EGG);
            }
            this.eggTime = this.random.nextInt(6000) + 6000;
        }

    }

    protected boolean isFlapping() {
        return this.flyDist > this.nextFlap;
    }

    protected void onFlap() {
        this.nextFlap = this.flyDist + this.flapSpeed / 2.0F;
    }

    public boolean causeFallDamage(float p_148875_, float p_148876_, DamageSource p_148877_) {
        return false;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_28262_) {
        return SoundEvents.CHICKEN_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.CHICKEN_DEATH;
    }

    protected void playStepSound(BlockPos p_28254_, BlockState p_28255_) {
        this.playSound(SoundEvents.CHICKEN_STEP, 0.15F, 1.0F);
    }

    public ColoredChickenEntity getBreedOffspring(ServerLevel p_148884_, AgeableMob p_148885_) {
        return ModEntityTypes.COLORED_CHICKEN.get().create(p_148884_);
    }

    public boolean isFood(ItemStack p_28271_) {
        return FOOD_ITEMS.test(p_28271_);
    }

    public int getExperienceReward() {
        return this.isChickenJockey() ? 10 : super.getExperienceReward();
    }

    public void readAdditionalSaveData(CompoundTag p_28243_) {
        super.readAdditionalSaveData(p_28243_);
        this.isColoredChickenJockey = p_28243_.getBoolean("IsColoredChickenJockey");
        if (p_28243_.contains("EggLayTime")) {
            this.eggTime = p_28243_.getInt("EggLayTime");
        }

    }

    public void addAdditionalSaveData(CompoundTag p_28257_) {
        super.addAdditionalSaveData(p_28257_);
        p_28257_.putBoolean("IsColoredChickenJockey", this.isColoredChickenJockey);
        p_28257_.putInt("EggLayTime", this.eggTime);
    }

    public boolean removeWhenFarAway(double p_28266_) {
        return this.isColoredChickenJockey();
    }

    public void positionRider(Entity p_28269_) {
        super.positionRider(p_28269_);
        float f = Mth.sin(this.yBodyRot * ((float)Math.PI / 180F));
        float f1 = Mth.cos(this.yBodyRot * ((float)Math.PI / 180F));
        float f2 = 0.1F;
        float f3 = 0.0F;
        p_28269_.setPos(this.getX() + (double)(0.1F * f), this.getY(0.5D) + p_28269_.getMyRidingOffset() + 0.0D, this.getZ() - (double)(0.1F * f1));
        if (p_28269_ instanceof LivingEntity) {
            ((LivingEntity)p_28269_).yBodyRot = this.yBodyRot;
        }

    }

    public boolean isColoredChickenJockey() {
        return this.isColoredChickenJockey;
    }

    public void setColoredChickenJockey(boolean p_28274_) {
        this.isColoredChickenJockey = p_28274_;
    }
}