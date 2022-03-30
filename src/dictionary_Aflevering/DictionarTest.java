package dictionary_Aflevering;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import static org.junit.Assert.*;


public class DictionarTest {
    Dictionary<Integer, String> dictionary;
   

    @Before
    public void setUp() throws Exception {
        dictionary = new DictionaryHashMap<>();

        
    }
    
    @Test
    @Order(1)
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

    @Test
    @Order(2)
    public void test_keyNotNull() {
        assertThrows(IllegalArgumentException.class, () -> dictionary.put(null, "Lars Allan"));
    }

    @Test
    @Order(3)
    public void test_valueNotNull() {
        assertThrows(IllegalArgumentException.class, () -> dictionary.put(7777, null));
    }

    
    
}
