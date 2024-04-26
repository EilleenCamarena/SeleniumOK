package org.example;

public class Kirby extends SmashBrossCharacter{
    private final String name = "Kirby";

    private final Integer attackPts = 10;

    private final Integer defensePts = 40;

    private String color ;

    // protected WebDriver driver,

    //public Kirby (String color,WebDriver driver) {
    //}

    public Kirby (String color) {
        super();
        super.assignStats(this.name, this.attackPts, this.defensePts);
        this.color = color;
    }
    protected void saludar () {
        System.out.println("Hola cara de bola");
    }

}
