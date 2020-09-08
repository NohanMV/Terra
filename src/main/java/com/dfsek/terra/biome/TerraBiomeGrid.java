package com.dfsek.terra.biome;

import org.bukkit.World;
import org.polydev.gaea.biome.BiomeGrid;

public class TerraBiomeGrid extends BiomeGrid {
    private final TerraBiome[][] grid = new TerraBiome[][] {
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS},
            {TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS, TerraBiome.MOUNTAINS}};

    public TerraBiomeGrid(World w) {
        super(w, 1f/256, 1f/512);
        super.setGrid(grid);
    }
}