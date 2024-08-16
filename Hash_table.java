import java.util.Hashtable;

public class Hash_table{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        Hashtable primera = new Hashtable();  

primera.put("name", "Carlos");
primera.put("age", 10);
primera.put("friend", "Robert");
primera.put("score", 25);
System.err.println(primera);

@SuppressWarnings("rawtypes")
Hashtable segundo = new Hashtable();  

segundo.put("score1", 30);
segundo.put("score2", 10);
segundo.put("score3", 12);
segundo.put("score4", 25);
System.out.println(segundo.keySet());

Hashtable tercero = new Hashtable();  

tercero.put("object1", "Casa");
tercero.put("object2", "Animal");
tercero.put("object3", "Piedra");
tercero.put("object4", "Color");
System.err.println(tercero.values());

        }
}