package betteragriculture.blocks;

import net.minecraft.util.IStringSerializable;

public enum TinyTileColorsEnum implements IStringSerializable {
	
	
    BLUE(0, "blue"),
    BROWN(1, "brown"),
	CYAN(2, "cyan"),
	GREEN(3, "green"),
	GREY(4, "grey"),
	LIGHTBLUE(5, "lightblue"),
	LIGHTGREY(6, "lightgrey"),
	LIME(7, "lime"),
	MAGENTA(8, "magenta"),
	ORANGE(9, "orange"),
	PINK(10, "pink"),
	PURPLE(11, "purple"),
	RED(12, "red"),
	WHITE(11, "white"),
	YELLOW(11, "yellow");


    private int ID;
    private String name;
    
    private TinyTileColorsEnum(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}