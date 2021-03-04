
/**
 * Size representa os tamanhas que a chavena de bebidas pode ter.
 * 
 * @author Margarida 
 * @version 04-03-2021
 */
public enum Size{
    SMALL(32, 36, "Pequeno", 'S'),

    MEDIUM(37, 44, "Médio", 'M'),

    LARGE(45, 52, "Grande", 'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    private Size(int minValue, int maxValue, String description, char code){
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }

    @Override
    public String toString() {
        return this.description;
    }

    /**Este método retorna a descrição de um tamanho.
     * return [String] description
    */
    public String getDescription() {
        return description;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public char getCode() {
        return code;
    }
}
