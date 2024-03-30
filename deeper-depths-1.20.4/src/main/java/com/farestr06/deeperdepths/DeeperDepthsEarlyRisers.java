package com.farestr06.deeperdepths;

import com.chocohead.mm.api.ClassTinkerers;
import com.chocohead.mm.api.EnumAdder;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;
import net.minecraft.block.MapColor;
import net.minecraft.util.Formatting;

public class DeeperDepthsEarlyRisers implements Runnable{
    @Override
    public void run() {
        MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();

        String rarity = remapper.mapClassName("intermediary", "net.minecraft.class_1814");
        String formatting = remapper.mapClassName("intermediary", "net.minecraft.class_124");

        EnumAdder rarityAdder = ClassTinkerers.enumBuilder(rarity, 'L'+formatting+';');
        rarityAdder.addEnum("SOUL", Formatting.DARK_AQUA);


        String mapColor = remapper.mapClassName("intermediary", "net.minecraft.class_3620");
        String dyeColor = remapper.mapClassName("intermediary", "net.minecraft.class_1767");

        EnumAdder dyeColorAdder = ClassTinkerers.enumBuilder(dyeColor,"I", "Ljava.lang.String;", "I", 'L' + mapColor + ';', "I", "I");
        dyeColorAdder.addEnum("UNPIGMENTED", () -> new Object[] {
                16,
                "unpigmented",
                0xa54a12,
                MapColor.TERRACOTTA_BROWN,
                0x0f0f0f,
                0x0f0f0f
        });
        dyeColorAdder.addEnum("WHITE_PIGMENT", () -> new Object[] {
                17,
                "white_pigment",
                0xffffff,
                MapColor.WHITE,
                0xffffff,
                0xffffff
        });
        dyeColorAdder.addEnum("LIGHT_GRAY_PIGMENT", () -> new Object[] {
                18,
                "light_gray_pigment",
                0xa4a4a4,
                MapColor.LIGHT_GRAY,
                0xa4a4a4,
                0xa4a4a4
        });
        dyeColorAdder.addEnum("DARK_GRAY_PIGMENT", () -> new Object[] {
                19,
                "dark_gray_pigment",
                0x767676,
                MapColor.GRAY,
                0x767676,
                0x767676
        });
        dyeColorAdder.addEnum("RED_PIGMENT", () -> new Object[] {
                20,
                "red_pigment",
                0xf63838,
                MapColor.BRIGHT_RED,
                0xf63838,
                0xf63838
        });
        dyeColorAdder.addEnum("ORANGE_PIGMENT", () -> new Object[] {
                21,
                "orange_pigment",
                0xf69638,
                MapColor.ORANGE,
                0xf69638,
                0xf69638
        });
        dyeColorAdder.addEnum("YELLOW_PIGMENT", () -> new Object[] {
                22,
                "yellow_pigment",
                0xf6f638,
                MapColor.GOLD,
                0xf6f638,
                0xf6f638
        });
        dyeColorAdder.addEnum("CHARTREUSE_PIGMENT", () -> new Object[] {
                23,
                "chartreuse_pigment",
                0x96f638,
                MapColor.EMERALD_GREEN,
                0x96f638,
                0x96f638
        });
        dyeColorAdder.addEnum("GREEN_PIGMENT", () -> new Object[] {
                24,
                "green_pigment",
                0x38f638,
                MapColor.GREEN,
                0x38f638,
                0x38f638
        });
        dyeColorAdder.addEnum("SPRING_GREEN_PIGMENT", () -> new Object[] {
                25,
                "spring_green_pigment",
                0x38f696,
                MapColor.LICHEN_GREEN,
                0x38f696,
                0x38f696
        });
        dyeColorAdder.addEnum("CYAN_PIGMENT", () -> new Object[] {
                26,
                "cyan_pigment",
                0x38f6f6,
                MapColor.DIAMOND_BLUE,
                0x38f6f6,
                0x38f6f6
        });
        dyeColorAdder.addEnum("CAPRI_PIGMENT", () -> new Object[] {
                27,
                "capri_pigment",
                0x74b4f6,
                MapColor.LIGHT_BLUE,
                0x74b4f6,
                0x74b4f6
        });
        dyeColorAdder.addEnum("ULTRAMARINE_PIGMENT", () -> new Object[] {
                28,
                "ultramarine_pigment",
                0x8484f6,
                MapColor.LAPIS_BLUE,
                0x8484f6,
                0x8484f6
        });
        dyeColorAdder.addEnum("VIOLET_PIGMENT", () -> new Object[] {
                29,
                "violet_pigment",
                0x9638f6,
                MapColor.PURPLE,
                0x9638f6,
                0x9638f6
        });
        dyeColorAdder.addEnum("MAGENTA_PIGMENT", () -> new Object[] {
                30,
                "magenta_pigment",
                0xc151f6,
                MapColor.MAGENTA,
                0xc151f6,
                0xc151f6
        });
        dyeColorAdder.addEnum("PINK_PIGMENT", () -> new Object[] {
                31,
                "pink_pigment",
                0xf638f6,
                MapColor.PINK,
                0xf638f6,
                0xf638f6
        });
        dyeColorAdder.addEnum("ROSE_PIGMENT", () -> new Object[] {
                32,
                "rose_pigment",
                0xf63896,
                MapColor.TERRACOTTA_PINK,
                0xf63896,
                0xf63896
        });
        dyeColorAdder.build();

    }
}
