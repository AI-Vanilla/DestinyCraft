
package net.destinycraft.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import net.destinycraft.init.Destinycraft2ModBlocks;

import java.util.function.Predicate;
import java.util.List;

public class WeaponCoreOreFeature extends OreFeature {
	public static WeaponCoreOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new WeaponCoreOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("destinycraft2:weapon_core_ore", FEATURE, new OreConfiguration(WeaponCoreOreFeatureRuleTest.INSTANCE, Destinycraft2ModBlocks.WEAPON_CORE_ORE.defaultBlockState(), 9));
		PLACED_FEATURE = PlacementUtils.register("destinycraft2:weapon_core_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(15), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(86)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	public WeaponCoreOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class WeaponCoreOreFeatureRuleTest extends RuleTest {
		static final WeaponCoreOreFeatureRuleTest INSTANCE = new WeaponCoreOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<WeaponCoreOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<WeaponCoreOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("destinycraft2:weapon_core_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, RandomSource random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
