package kø_struktur.queues.queuetest;

import kø_struktur.queues.bryghus.Produkt;
import kø_struktur.queues.deque.CircularArrayDeque;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class DequeTest
{

    private CircularArrayDeque cad;

    private Produkt p1;
    private Produkt p2;
    private Produkt p3;
    private Produkt p4;
    private Produkt p5;
    private Produkt p6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

//        this.cad = new CircularArraycad(5);
//        this.cad = new Nodecad();
        this.cad = new CircularArrayDeque(20);

        p1 = new Produkt("Klosterbryg");
        p2 = new Produkt("Sweet Georgia Brown");
        p3 = new Produkt("Extra Pilsner");
        p4 = new Produkt("Classic Jazz");
        p5 = new Produkt("Klippekort 10 klip");
        p6 = new Produkt("Klippekort 6 klip");
    }

    @Test
    @Order(1)
    void test_cad_canAddFirst()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        cad.addFirst(p1);
        assertEquals(cad.getFirst(), p1);

        cad.addFirst(p2);
        assertEquals(cad.getFirst(), p2);

        cad.addFirst(p3);
        assertEquals(cad.getFirst(), p3);

        cad.addFirst(p4);
        assertEquals(cad.getFirst(), p4);

        cad.addFirst(p5);
        assertEquals(cad.getFirst(), p5);

        cad.addFirst(p6);
        assertEquals(cad.getFirst(), p6);
    }

    @Test
    @Order(2)
    void test_cad_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, cad.size());
        System.out.println("Størrelsen: " + cad.size());
        
        cad.addFirst(p1);
        assertEquals(1, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.addFirst(p2);
        assertEquals(2, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.addFirst(p3);
        assertEquals(3, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.addFirst(p4);
        assertEquals(4, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.addFirst(p5);
        assertEquals(5, cad.size());
        System.out.println("Størrelsen: " + cad.size());
        
        cad.addFirst(p6);
        assertEquals(6, cad.size());
        System.out.println("Størrelsen: " + cad.size());
        
        cad.removeFirst();
        assertEquals(5, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.removeFirst();
        assertEquals(4, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.removeFirst();
        assertEquals(3, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.removeFirst();
        assertEquals(2, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.removeFirst();
        assertEquals(1, cad.size());
        System.out.println("Størrelsen: " + cad.size());

        cad.removeFirst();
        assertEquals(0, cad.size());
        System.out.println("Størrelsen: " + cad.size());
        
    }

    @Test
    @Order(3)
    void test_cad_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(cad.isEmpty());

        cad.addFirst(p1);
        assertFalse(cad.isEmpty());

        cad.addFirst(p2);
        assertFalse(cad.isEmpty());

        cad.addFirst(p3);
        assertFalse(cad.isEmpty());

        cad.removeFirst();
        assertFalse(cad.isEmpty());

        cad.removeFirst();
        assertFalse(cad.isEmpty());

        cad.removeFirst();
        assertTrue(cad.isEmpty());
    }
}
