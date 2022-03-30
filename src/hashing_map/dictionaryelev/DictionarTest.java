package hashing_map.dictionaryelev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class DictionarTest {
    Dictionary<Integer, String> dictionary;
   

    @Before
    public void setUp() throws Exception {
        // dictionary = new DictionaryHashMap<>();
        dictionary = new DictionaryLinked<>();
        
    }
    
    @Test
    public void test() {
        assertTrue(dictionary.isEmpty());
        assertEquals(0, dictionary.size());

        dictionary.put(8, "hans");
        dictionary.put(3, "viggo");
        
        assertFalse(dictionary.isEmpty());
        assertEquals(2, dictionary.size());

        assertEquals("hans", dictionary.get(8));

        dictionary.put(7, "bent");
        dictionary.put(2, "lene");
        
        assertFalse(dictionary.isEmpty());
        assertEquals(4, dictionary.size());
        
        assertEquals("viggo", dictionary.remove(3));

        assertEquals(3, dictionary.size());
        
        assertEquals("hans", dictionary.put(8, "Ida"));
        assertEquals("Ida", dictionary.get(8));

    }

    
    
}
