package edu.insightr.gildedrose;

public class Backstage extends Item{
    public Backstage(String name, int sellIn, int quality)
    {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality()
    {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);

            if (this.getName() == "Backstage passes to a TAFKAL80ETC concert") {
                if (this.getSellIn() < 11) {
                    if (this.getQuality() < 50) {
                        this.setQuality(this.getQuality() + 1);
                    }
                }

                if (this.getSellIn() < 6) {
                    if (this.getQuality() < 50) {
                        this.setQuality(this.getQuality() + 1);
                    }
                }
            }
        }
    }
}
