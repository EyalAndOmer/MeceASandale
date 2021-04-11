package sk.majba.player;

public enum AttributeType {
    STRENGHT("Strenght"), AGILITY("Agility"), ATTACK("Attack"), DEFENCE("Defence"), HEALTH("Health"),
    CHARISMA("Charisma"), STAMINA("Stamina");

    private String attributeName;

    AttributeType(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return this.attributeName;
    }
}
