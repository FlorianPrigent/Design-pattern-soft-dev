package edu.insightr.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality)
    {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality()
    {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() - 2);
        }

        if (this.getSellIn() < 0) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() - 2);
            }
        }
    }
}
