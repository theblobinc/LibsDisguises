package me.libraryaddict.disguise.utilities;

import me.libraryaddict.disguise.utilities.reflection.ReflectionManager;
import org.bukkit.Sound;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Only living disguises go in here!
 */
public enum DisguiseSound {
    ARMOR_STAND(Sound.ENTITY_ARMOR_STAND_HIT, null, Sound.ENTITY_ARMOR_STAND_BREAK, Sound.ENTITY_ARMOR_STAND_FALL,
            Sound.ENTITY_ARMOR_STAND_PLACE),

    ARROW(null, null, null, null, Sound.ENTITY_ARROW_HIT, Sound.ENTITY_ARROW_SHOOT),

    BAT(Sound.ENTITY_BAT_HURT, null, Sound.ENTITY_BAT_DEATH, Sound.ENTITY_BAT_AMBIENT, Sound.ENTITY_PLAYER_SMALL_FALL,
            Sound.ENTITY_BAT_LOOP, Sound.ENTITY_PLAYER_BIG_FALL, Sound.ENTITY_BAT_TAKEOFF),

    BLAZE(Sound.ENTITY_BLAZE_HURT, null, Sound.ENTITY_BLAZE_DEATH, Sound.ENTITY_BLAZE_AMBIENT,
            Sound.ENTITY_PLAYER_SMALL_FALL, Sound.ENTITY_PLAYER_BIG_FALL, Sound.ENTITY_BLAZE_BURN,
            Sound.ENTITY_BLAZE_SHOOT),

    BOAT(null, Sound.ENTITY_BOAT_PADDLE_WATER, null, null, Sound.ENTITY_BOAT_PADDLE_LAND),

    CAVE_SPIDER(Sound.ENTITY_SPIDER_HURT, Sound.ENTITY_SPIDER_STEP, Sound.ENTITY_SPIDER_DEATH,
            Sound.ENTITY_SPIDER_AMBIENT),

    CHICKEN(Sound.ENTITY_CHICKEN_HURT, Sound.ENTITY_CHICKEN_STEP, Sound.ENTITY_CHICKEN_DEATH,
            Sound.ENTITY_CHICKEN_AMBIENT, Sound.ENTITY_PLAYER_SMALL_FALL, Sound.ENTITY_CHICKEN_EGG,
            Sound.ENTITY_PLAYER_BIG_FALL),

    COD(Sound.ENTITY_COD_HURT, null, Sound.ENTITY_COD_DEATH, Sound.ENTITY_COD_AMBIENT, Sound.ENTITY_COD_FLOP,
            Sound.ENTITY_FISH_SWIM),

    COW(Sound.ENTITY_COW_HURT, Sound.ENTITY_COW_STEP, Sound.ENTITY_COW_DEATH, Sound.ENTITY_COW_AMBIENT),

    CREEPER(Sound.ENTITY_CREEPER_HURT, Sound.BLOCK_GRASS_STEP, Sound.ENTITY_CREEPER_DEATH, null,
            Sound.ENTITY_CREEPER_PRIMED),

    DOLPHIN(Sound.ENTITY_DOLPHIN_HURT, Sound.ENTITY_DOLPHIN_SWIM, Sound.ENTITY_DOLPHIN_DEATH,
            new Sound[]{Sound.ENTITY_DOLPHIN_AMBIENT, Sound.ENTITY_DOLPHIN_AMBIENT_WATER}, Sound.ENTITY_DOLPHIN_ATTACK,
            Sound.ENTITY_DOLPHIN_EAT, Sound.ENTITY_DOLPHIN_SPLASH, Sound.ENTITY_DOLPHIN_PLAY, Sound.ENTITY_DOLPHIN_JUMP,
            Sound.ENTITY_FISH_SWIM),

    DONKEY(Sound.ENTITY_DONKEY_HURT, new Sound[]{Sound.BLOCK_GRASS_STEP, Sound.ENTITY_HORSE_STEP_WOOD,},
            Sound.ENTITY_DONKEY_DEATH, Sound.ENTITY_DONKEY_AMBIENT, Sound.ENTITY_HORSE_GALLOP,
            Sound.ENTITY_HORSE_SADDLE, Sound.ENTITY_DONKEY_ANGRY, Sound.ENTITY_HORSE_ARMOR, Sound.ENTITY_HORSE_LAND,
            Sound.ENTITY_HORSE_JUMP, Sound.ENTITY_HORSE_ANGRY, Sound.ENTITY_DONKEY_CHEST),

    DROWNED(new Sound[]{Sound.ENTITY_DROWNED_HURT, Sound.ENTITY_DROWNED_HURT_WATER},
            new Sound[]{Sound.ENTITY_DROWNED_STEP, Sound.ENTITY_DROWNED_SWIM},
            new Sound[]{Sound.ENTITY_DROWNED_DEATH, Sound.ENTITY_DROWNED_DEATH_WATER},
            new Sound[]{Sound.ENTITY_DROWNED_AMBIENT, Sound.ENTITY_DROWNED_AMBIENT_WATER}, Sound.ENTITY_DROWNED_SHOOT),

    ELDER_GUARDIAN(new Sound[]{Sound.ENTITY_ELDER_GUARDIAN_HURT, Sound.ENTITY_ELDER_GUARDIAN_HURT_LAND}, null,
            new Sound[]{Sound.ENTITY_ELDER_GUARDIAN_DEATH, Sound.ENTITY_ELDER_GUARDIAN_DEATH_LAND},
            new Sound[]{Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, Sound.ENTITY_ELDER_GUARDIAN_AMBIENT_LAND},
            Sound.ENTITY_ELDER_GUARDIAN_FLOP),

    ENDER_DRAGON(Sound.ENTITY_ENDER_DRAGON_HURT, null, Sound.ENTITY_ENDER_DRAGON_DEATH,
            Sound.ENTITY_ENDER_DRAGON_AMBIENT, Sound.ENTITY_GENERIC_SMALL_FALL, Sound.ENTITY_GENERIC_BIG_FALL,
            Sound.ENTITY_ENDER_DRAGON_FLAP, Sound.ENTITY_ENDER_DRAGON_GROWL),

    ENDERMAN(Sound.ENTITY_ENDERMAN_HURT, Sound.BLOCK_GRASS_STEP, Sound.ENTITY_ENDERMAN_DEATH,
            Sound.ENTITY_ENDERMAN_AMBIENT, Sound.ENTITY_ENDERMAN_SCREAM, Sound.ENTITY_ENDERMAN_TELEPORT,
            Sound.ENTITY_ENDERMAN_STARE),

    ENDERMITE(Sound.ENTITY_ENDERMITE_HURT, Sound.ENTITY_ENDERMITE_STEP, Sound.ENTITY_ENDERMITE_DEATH,
            Sound.ENTITY_ENDERMITE_AMBIENT),

    EVOKER(Sound.ENTITY_EVOKER_HURT, null, Sound.ENTITY_EVOKER_DEATH, Sound.ENTITY_EVOKER_AMBIENT,
            Sound.ENTITY_EVOKER_CAST_SPELL, Sound.ENTITY_EVOKER_PREPARE_ATTACK, Sound.ENTITY_EVOKER_PREPARE_SUMMON,
            Sound.ENTITY_EVOKER_PREPARE_WOLOLO),

    EVOKER_FANGS(null, null, null, null, Sound.ENTITY_EVOKER_FANGS_ATTACK),

    GHAST(Sound.ENTITY_GHAST_HURT, null, Sound.ENTITY_GHAST_DEATH, Sound.ENTITY_GHAST_AMBIENT,
            Sound.ENTITY_PLAYER_SMALL_FALL, Sound.ENTITY_GHAST_SHOOT, Sound.ENTITY_PLAYER_BIG_FALL,
            Sound.ENTITY_GHAST_SCREAM, Sound.ENTITY_GHAST_WARN),

    GIANT(Sound.ENTITY_PLAYER_HURT, Sound.BLOCK_GRASS_STEP, null, null),

    GUARDIAN(new Sound[]{Sound.ENTITY_GUARDIAN_HURT, Sound.ENTITY_GUARDIAN_HURT_LAND}, null,
            new Sound[]{Sound.ENTITY_GUARDIAN_DEATH, Sound.ENTITY_GUARDIAN_DEATH_LAND},
            new Sound[]{Sound.ENTITY_GUARDIAN_AMBIENT, Sound.ENTITY_GUARDIAN_AMBIENT_LAND}, Sound.ENTITY_GUARDIAN_FLOP),

    HORSE(Sound.ENTITY_HORSE_HURT, new Sound[]{Sound.ENTITY_HORSE_STEP, Sound.ENTITY_HORSE_STEP_WOOD},
            Sound.ENTITY_HORSE_DEATH, Sound.ENTITY_HORSE_AMBIENT, Sound.ENTITY_HORSE_GALLOP, Sound.ENTITY_HORSE_SADDLE,
            Sound.ENTITY_DONKEY_ANGRY, Sound.ENTITY_HORSE_ARMOR, Sound.ENTITY_HORSE_LAND, Sound.ENTITY_HORSE_JUMP,
            Sound.ENTITY_HORSE_ANGRY, Sound.ENTITY_HORSE_EAT, Sound.ENTITY_HORSE_BREATHE),

    HUSK(Sound.ENTITY_HUSK_HURT, Sound.ENTITY_HUSK_STEP, Sound.ENTITY_HUSK_DEATH, Sound.ENTITY_HUSK_AMBIENT,
            Sound.ENTITY_HUSK_CONVERTED_TO_ZOMBIE),

    ILLUSIONER(Sound.ENTITY_ILLUSIONER_HURT, null, Sound.ENTITY_ILLUSIONER_DEATH, Sound.ENTITY_ILLUSIONER_AMBIENT,
            Sound.ENTITY_ILLUSIONER_CAST_SPELL, Sound.ENTITY_ILLUSIONER_PREPARE_BLINDNESS,
            Sound.ENTITY_ILLUSIONER_PREPARE_MIRROR, Sound.ENTITY_ILLUSIONER_MIRROR_MOVE),

    IRON_GOLEM(Sound.ENTITY_IRON_GOLEM_HURT, Sound.ENTITY_IRON_GOLEM_STEP, Sound.ENTITY_IRON_GOLEM_DEATH,
            Sound.ENTITY_IRON_GOLEM_ATTACK),

    LLAMA(Sound.ENTITY_LLAMA_HURT, Sound.ENTITY_LLAMA_STEP, Sound.ENTITY_LLAMA_DEATH, Sound.ENTITY_LLAMA_AMBIENT,
            Sound.ENTITY_LLAMA_ANGRY, Sound.ENTITY_LLAMA_CHEST, Sound.ENTITY_LLAMA_EAT, Sound.ENTITY_LLAMA_SWAG),

    MAGMA_CUBE(Sound.ENTITY_MAGMA_CUBE_HURT, Sound.ENTITY_MAGMA_CUBE_JUMP,
            new Sound[]{Sound.ENTITY_MAGMA_CUBE_DEATH, Sound.ENTITY_MAGMA_CUBE_DEATH_SMALL}, null,
            Sound.ENTITY_MAGMA_CUBE_SQUISH, Sound.ENTITY_MAGMA_CUBE_SQUISH_SMALL),

    MULE(Sound.ENTITY_MULE_HURT, Sound.BLOCK_GRASS_STEP, Sound.ENTITY_MULE_DEATH, Sound.ENTITY_MULE_AMBIENT,
            Sound.ENTITY_MULE_CHEST),

    MUSHROOM_COW(Sound.ENTITY_COW_HURT, Sound.ENTITY_COW_STEP, Sound.ENTITY_COW_DEATH, Sound.ENTITY_COW_AMBIENT),

    OCELOT(Sound.ENTITY_CAT_HURT, Sound.BLOCK_GRASS_STEP, Sound.ENTITY_CAT_DEATH,
            new Sound[]{Sound.ENTITY_CAT_AMBIENT, Sound.ENTITY_CAT_PURR, Sound.ENTITY_CAT_PURREOW},
            Sound.ENTITY_CAT_HISS),

    PARROT(Sound.ENTITY_PARROT_HURT, Sound.ENTITY_PARROT_STEP, Sound.ENTITY_PARROT_DEATH, Sound.ENTITY_PARROT_AMBIENT,
            Arrays.stream(Sound.values())
                    .filter(sound -> sound.name().contains("PARROT_IMITATE") || sound == Sound.ENTITY_PARROT_EAT ||
                            sound == Sound.ENTITY_PARROT_FLY).toArray(Sound[]::new)),

    PIG(Sound.ENTITY_PIG_HURT, Sound.ENTITY_PIG_STEP, Sound.ENTITY_PIG_DEATH, Sound.ENTITY_PIG_AMBIENT),

    PIG_ZOMBIE(Sound.ENTITY_ZOMBIE_PIGMAN_HURT, null, Sound.ENTITY_ZOMBIE_PIGMAN_DEATH,
            Sound.ENTITY_ZOMBIE_PIGMAN_AMBIENT, Sound.ENTITY_ZOMBIE_PIGMAN_ANGRY),

    PLAYER(Sound.ENTITY_PLAYER_HURT, Arrays.stream(Sound.values())
            .filter(sound -> sound.name().startsWith("BLOCK_") && sound.name().endsWith("_STEP")).toArray(Sound[]::new),
            Sound.ENTITY_PLAYER_DEATH, null),

    PHANTOM(Sound.ENTITY_PHANTOM_HURT, new Sound[]{Sound.ENTITY_PHANTOM_FLAP, Sound.ENTITY_PHANTOM_SWOOP},
            Sound.ENTITY_PHANTOM_DEATH, Sound.ENTITY_PHANTOM_AMBIENT, Sound.ENTITY_PHANTOM_BITE),

    POLAR_BEAR(Sound.ENTITY_POLAR_BEAR_HURT, Sound.ENTITY_POLAR_BEAR_STEP, Sound.ENTITY_POLAR_BEAR_DEATH,
            new Sound[]{Sound.ENTITY_POLAR_BEAR_AMBIENT, Sound.ENTITY_POLAR_BEAR_AMBIENT_BABY},
            Sound.ENTITY_POLAR_BEAR_WARNING),

    PUFFERFISH(Sound.ENTITY_PUFFER_FISH_HURT, null, Sound.ENTITY_PUFFER_FISH_DEATH, Sound.ENTITY_PUFFER_FISH_AMBIENT,
            Sound.ENTITY_PUFFER_FISH_BLOW_OUT, Sound.ENTITY_PUFFER_FISH_BLOW_UP, Sound.ENTITY_PUFFER_FISH_FLOP,
            Sound.ENTITY_PUFFER_FISH_STING, Sound.ENTITY_FISH_SWIM),

    RABBIT(Sound.ENTITY_RABBIT_HURT, Sound.ENTITY_RABBIT_JUMP, Sound.ENTITY_RABBIT_DEATH, Sound.ENTITY_RABBIT_AMBIENT,
            Sound.ENTITY_RABBIT_ATTACK),

    SALMON(Sound.ENTITY_SALMON_HURT, null, Sound.ENTITY_SALMON_DEATH, Sound.ENTITY_SALMON_AMBIENT,
            Sound.ENTITY_SALMON_FLOP, Sound.ENTITY_FISH_SWIM),

    SHEEP(Sound.ENTITY_SHEEP_HURT, Sound.ENTITY_SHEEP_STEP, Sound.ENTITY_SHEEP_DEATH, Sound.ENTITY_SHEEP_AMBIENT,
            Sound.ENTITY_SHEEP_SHEAR),

    SHULKER(new Sound[]{Sound.ENTITY_SHULKER_HURT, Sound.ENTITY_SHULKER_HURT_CLOSED}, null, Sound.ENTITY_SHULKER_DEATH,
            Sound.ENTITY_SHULKER_AMBIENT, Sound.ENTITY_SHULKER_OPEN, Sound.ENTITY_SHULKER_CLOSE,
            Sound.ENTITY_SHULKER_TELEPORT),

    SILVERFISH(Sound.ENTITY_SILVERFISH_HURT, Sound.ENTITY_SILVERFISH_STEP, Sound.ENTITY_SILVERFISH_DEATH,
            Sound.ENTITY_SILVERFISH_AMBIENT),

    SKELETON(Sound.ENTITY_SKELETON_HURT, Sound.ENTITY_SKELETON_STEP, Sound.ENTITY_SKELETON_DEATH,
            Sound.ENTITY_SKELETON_AMBIENT),

    SKELETON_HORSE(Sound.ENTITY_SKELETON_HORSE_HURT, new Sound[]{Sound.BLOCK_GRASS_STEP, Sound.ENTITY_HORSE_STEP_WOOD},
            Sound.ENTITY_SKELETON_HORSE_DEATH,
            new Sound[]{Sound.ENTITY_SKELETON_HORSE_AMBIENT, Sound.ENTITY_SKELETON_HORSE_AMBIENT_WATER},
            Sound.ENTITY_HORSE_GALLOP, Sound.ENTITY_HORSE_SADDLE, Sound.ENTITY_HORSE_ARMOR, Sound.ENTITY_HORSE_LAND,
            Sound.ENTITY_HORSE_JUMP, Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER, Sound.ENTITY_SKELETON_HORSE_JUMP_WATER,
            Sound.ENTITY_SKELETON_HORSE_SWIM, Sound.ENTITY_SKELETON_HORSE_STEP_WATER),

    SLIME(new Sound[]{Sound.ENTITY_SLIME_HURT, Sound.ENTITY_SLIME_HURT_SMALL},
            new Sound[]{Sound.ENTITY_SLIME_JUMP, Sound.ENTITY_SLIME_JUMP_SMALL},
            new Sound[]{Sound.ENTITY_SLIME_DEATH, Sound.ENTITY_SLIME_DEATH_SMALL}, null, Sound.ENTITY_SLIME_ATTACK,
            Sound.ENTITY_SLIME_SQUISH, Sound.ENTITY_SLIME_SQUISH_SMALL),

    SNOWMAN(Sound.ENTITY_SNOW_GOLEM_HURT, null, Sound.ENTITY_SNOW_GOLEM_DEATH, Sound.ENTITY_SNOW_GOLEM_AMBIENT,
            Sound.ENTITY_SNOW_GOLEM_SHOOT),

    SPIDER(Sound.ENTITY_SPIDER_HURT, Sound.ENTITY_SPIDER_STEP, Sound.ENTITY_SPIDER_DEATH, Sound.ENTITY_SPIDER_AMBIENT),

    STRAY(Sound.ENTITY_STRAY_HURT, Sound.ENTITY_STRAY_STEP, Sound.ENTITY_STRAY_DEATH, Sound.ENTITY_STRAY_AMBIENT),

    SQUID(Sound.ENTITY_SQUID_HURT, null, Sound.ENTITY_SQUID_DEATH, Sound.ENTITY_SQUID_AMBIENT,
            Sound.ENTITY_SQUID_SQUIRT, Sound.ENTITY_FISH_SWIM),

    TROPICAL_FISH(Sound.ENTITY_TROPICAL_FISH_HURT, null, Sound.ENTITY_TROPICAL_FISH_DEATH,
            Sound.ENTITY_TROPICAL_FISH_AMBIENT, Sound.ENTITY_TROPICAL_FISH_FLOP, Sound.ENTITY_FISH_SWIM),

    TURTLE(new Sound[]{Sound.ENTITY_TURTLE_HURT, Sound.ENTITY_TURTLE_HURT_BABY},
            new Sound[]{Sound.ENTITY_TURTLE_SHAMBLE, Sound.ENTITY_TURTLE_SHAMBLE_BABY},
            new Sound[]{Sound.ENTITY_TURTLE_DEATH, Sound.ENTITY_TURTLE_DEATH_BABY}, Sound.ENTITY_TURTLE_AMBIENT_LAND,
            Sound.ENTITY_TURTLE_LAY_EGG),

    VEX(Sound.ENTITY_VEX_HURT, null, Sound.ENTITY_VEX_DEATH, Sound.ENTITY_VEX_AMBIENT, Sound.ENTITY_VEX_CHARGE),

    VILLAGER(Sound.ENTITY_VILLAGER_HURT, null, Sound.ENTITY_VILLAGER_DEATH, Sound.ENTITY_VILLAGER_AMBIENT,
            Sound.ENTITY_VILLAGER_TRADE, Sound.ENTITY_VILLAGER_NO, Sound.ENTITY_VILLAGER_YES),

    VINDICATOR(Sound.ENTITY_VINDICATOR_HURT, null, Sound.ENTITY_VINDICATOR_DEATH, Sound.ENTITY_VINDICATOR_AMBIENT),

    WITCH(Sound.ENTITY_WITCH_HURT, null, Sound.ENTITY_WITCH_DEATH, Sound.ENTITY_WITCH_AMBIENT),

    WITHER(Sound.ENTITY_WITHER_HURT, null, Sound.ENTITY_WITHER_DEATH, Sound.ENTITY_WITHER_AMBIENT,
            Sound.ENTITY_PLAYER_SMALL_FALL, Sound.ENTITY_WITHER_SPAWN, Sound.ENTITY_PLAYER_BIG_FALL,
            Sound.ENTITY_WITHER_SHOOT),

    WITHER_SKELETON(Sound.ENTITY_WITHER_SKELETON_HURT, Sound.ENTITY_WITHER_SKELETON_STEP,
            Sound.ENTITY_WITHER_SKELETON_DEATH, Sound.ENTITY_WITHER_SKELETON_AMBIENT),

    WOLF(Sound.ENTITY_WOLF_HURT, Sound.ENTITY_WOLF_STEP, Sound.ENTITY_WOLF_DEATH, Sound.ENTITY_WOLF_AMBIENT,
            Sound.ENTITY_WOLF_GROWL, Sound.ENTITY_WOLF_PANT, Sound.ENTITY_WOLF_HOWL, Sound.ENTITY_WOLF_SHAKE,
            Sound.ENTITY_WOLF_WHINE),

    ZOMBIE(Sound.ENTITY_ZOMBIE_HURT, Sound.ENTITY_ZOMBIE_STEP, Sound.ENTITY_ZOMBIE_DEATH, Sound.ENTITY_ZOMBIE_AMBIENT,
            Sound.ENTITY_ZOMBIE_INFECT, Sound.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, Sound.ENTITY_ZOMBIE_BREAK_WOODEN_DOOR,
            Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR),

    ZOMBIE_HORSE(Sound.ENTITY_ZOMBIE_HORSE_HURT, new Sound[]{Sound.BLOCK_GRASS_STEP, Sound.ENTITY_HORSE_STEP_WOOD},
            Sound.ENTITY_ZOMBIE_HORSE_DEATH, Sound.ENTITY_ZOMBIE_HORSE_AMBIENT, Sound.ENTITY_HORSE_GALLOP,
            Sound.ENTITY_HORSE_SADDLE, Sound.ENTITY_HORSE_ARMOR, Sound.ENTITY_HORSE_LAND, Sound.ENTITY_HORSE_JUMP,
            Sound.ENTITY_HORSE_ANGRY),

    ZOMBIE_VILLAGER(Sound.ENTITY_ZOMBIE_VILLAGER_HURT, Sound.ENTITY_ZOMBIE_VILLAGER_STEP,
            Sound.ENTITY_ZOMBIE_VILLAGER_DEATH, Sound.ENTITY_ZOMBIE_VILLAGER_AMBIENT, Sound.ENTITY_ZOMBIE_INFECT,
            Sound.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, Sound.ENTITY_ZOMBIE_BREAK_WOODEN_DOOR,
            Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR);

    public enum SoundType {
        CANCEL,
        DEATH,
        HURT,
        IDLE,
        STEP
    }

    public static DisguiseSound getType(String name) {
        try {
            return valueOf(name);
        }
        catch (Exception ex) {
            return null;
        }
    }

    private float damageSoundVolume = 1F;
    private LinkedHashMap<Object, SoundType> disguiseSounds = new LinkedHashMap<>();

    DisguiseSound(Object hurt, Object step, Object death, Object idle, Sound... sounds) {
        addSound(hurt, SoundType.HURT);
        addSound(step, SoundType.STEP);
        addSound(death, SoundType.DEATH);
        addSound(idle, SoundType.IDLE);

        for (Sound obj : sounds) {
            addSound(obj, SoundType.CANCEL);
        }
    }

    private void addSound(Object sound, SoundType type) {
        if (sound == null) {
            return;
        }

        if (sound instanceof Sound) {
            addSound((Sound) sound, type);
        } else if (sound instanceof Sound[]) {
            for (Sound s : (Sound[]) sound) {
                addSound(s, type);
            }
        } else {
            throw new IllegalArgumentException("Was given an unknown object " + sound);
        }
    }

    private void addSound(Sound sound, SoundType type) {
        Object soundEffect = ReflectionManager.getCraftSound(sound);

        if (disguiseSounds.containsKey(soundEffect)) {
            DisguiseUtilities.getLogger().severe("Already doing " + sound);
        }

        disguiseSounds.put(soundEffect, type);
    }

    public float getDamageAndIdleSoundVolume() {
        return damageSoundVolume;
    }

    public Object getSound(SoundType type) {
        if (type == null) {
            return null;
        }

        for (Entry<Object, SoundType> entry : disguiseSounds.entrySet()) {
            if (entry.getValue() != type) {
                continue;
            }

            return entry.getKey();
        }

        return null;
    }

    public SoundType getSound(Object sound) {
        if (sound == null) {
            return null;
        }

        return disguiseSounds.get(sound);
    }

    /**
     * Used to check if this sound name is owned by this disguise sound.
     */
    public SoundType getType(Object sound, boolean ignoreDamage) {
        if (sound == null) {
            return SoundType.CANCEL;
        }

        SoundType soundType = getSound(sound);

        if (soundType == SoundType.DEATH || (ignoreDamage && soundType == SoundType.HURT)) {
            return null;
        }

        return soundType;
    }

    public boolean isCancelSound(String sound) {
        return getSound(sound) == SoundType.CANCEL;
    }

    public void setDamageAndIdleSoundVolume(float strength) {
        this.damageSoundVolume = strength;
    }
}
