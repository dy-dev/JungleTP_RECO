package com.arcreane;

public class Main {

    public static void main(String[] args) {
        Terrain myTerrain = new Terrain(100);

        //Tant qu'il y a de la vie sur le terrain=> c qu'on appelle la game loop
        while (myTerrain.m_bHasStillLivingCreature) {
            myTerrain.step();
        }

        myTerrain.rain(500);
    }
}
