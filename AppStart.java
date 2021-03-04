
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart{
    
    public static void main(String[] args){
        Size size = Size.MEDIUM;
        
        System.out.println("Name         : " + size.toString() ); //?
        System.out.println("toString()   : \"" + size.toString() + "\"");
        System.out.println("Ordem        : " + size.ordinal());
        System.out.println("Valor mínimo : " + size.getMinValue());
        System.out.println("Valor máximo : " + size.getMaxValue());
        System.out.println("Codigo       : \'"+ size.getCode() + "\'");
    }
}
