package com.arcreane;

public class WaterSpot {
    private int m_iTotalWaterQuantity;

    public WaterSpot() {
        m_iTotalWaterQuantity = 5000;
    }

    public int getTotalWaterQuantity() {
        return m_iTotalWaterQuantity;
    }

    public void setTotalWaterQuantity(int p_iTotalWaterQuantity) {
        if(p_iTotalWaterQuantity > 0)
            m_iTotalWaterQuantity = p_iTotalWaterQuantity;
    }

    public int drink(int waterWanted) {
        //On déclare la variable qui va contenir la quantité d'eau à renvoyer
        int waterReturned = 0;

        //Si dans le plan d'eau il reste plus que la quantité demandé
        //par exemple l'animal souhaite boire 10l et il me reste 500l
        //alors je l'autorise à boire la quantité désirée

        if(m_iTotalWaterQuantity - waterWanted >= 0) {
            waterReturned = waterWanted;
        }
        //Dans le cas contraire, il ne me reste que 5l et il veut boire 10l
        //je ne lui renvoie que les 5l qui me reste
        else{
            waterReturned = m_iTotalWaterQuantity;
        }

        //Ne pas oublier avant de renvoyer l'eau de l'enlever à la
        //quantité totale
        m_iTotalWaterQuantity -= waterReturned;
        return waterReturned;
    }

    public void refill(int p_iQuantityWaterRained) {
        m_iTotalWaterQuantity += p_iQuantityWaterRained;
    }
}
