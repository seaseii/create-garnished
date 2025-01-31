package net.dakotapride.garnished.gen;

import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class PecanTreeGrower extends AbstractTreeGrower {

	@Nullable
	@Override
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
		return GarnishedFeatures.PECAN_TREE_CONFIGURED;
	}
}
