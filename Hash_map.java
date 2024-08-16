import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, Object> primera = new HashMap<String, Object>();  

primera.put("name", "Carlos");
primera.put("age", 10);
primera.put(null, null);
primera.put("score", 25);
System.err.println(primera);

HashMap<String, Integer> segundo = new HashMap<String, Integer>();  

segundo.put("score1", null);
segundo.put("score2", 10);
segundo.put("score3", 12);
segundo.put("score4", 25);
System.out.println(segundo);

HashMap<String, String> tercero = new HashMap<String, String>();  

tercero.put("object1", "Casa");
tercero.put("object2", "Animal");
tercero.put("object3", "Piedra");
tercero.put("object4", "Color");
System.err.println(tercero);
    }
}
