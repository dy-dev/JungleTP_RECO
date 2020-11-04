package com.arcreane;

public class Prey {
    int m_iLifePoint;

    public void drink(WaterSpot p_WaterSpot){
        //Quantité d'eau qu'il souhaite boire, mais il faut demander à la waterspot
        //si il peut effectivement boire autant d'eau que ca
        int waterWanted = (int)(Math.random()*250);
        //Ici l'utilisation des getter / setter simple n'est pas suffisant car
        //il peut y avoir un probleme de quantité accessible
        // il va donc falloir ajouter une méthode supplémentaire dans waterspot
        //pour lui demander la quantité qu'il peut boire par rapport à la quantité d'eau
        //qu'il désire
        //int tmp = p_WaterSpot.getTotalWaterQuantity() - waterDrunk;
        //p_WaterSpot.setTotalWaterQuantity(tmp);
        int waterDrunk = p_WaterSpot.drink(waterWanted);
        m_iLifePoint += waterDrunk;
    }
}
