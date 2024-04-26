package org.example;

public class SmashBrossCharacter {
    // Atrributos de clase
    protected String name;
    protected Integer attackPts;
    protected Integer defensePts;

    //protected WebDriver driver;

    // Metodos (Los metodos son las funciones propias de la clase)

    //public SmashBrossCharacter (String name, Integer attackPts, Integer defensePts, WebDriver driver ) {
    //}

    // Metodo Especial: Constructor
    public SmashBrossCharacter (String name, Integer attackPts, Integer defensePts) {
        this.assignStats(name, attackPts, defensePts);
        System.out.println("Character created!");
    }

    public SmashBrossCharacter () {
        System.out.println("Character created! But without stats");
    }

    protected void assignStats (String name, Integer attackPts, Integer defensePts) {
        this.name = name;
        this.attackPts = attackPts;
        this.defensePts = defensePts;
    }

    protected void saludar () {
        System.out.println("Hola!");
    }
}
