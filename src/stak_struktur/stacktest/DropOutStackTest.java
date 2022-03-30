package stak_struktur.stacktest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import stak_struktur.stack.ArrayDropOutStack;
import stak_struktur.stack.DropOutStackI;
import stak_struktur.stack.StackI;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DropOutStackTest {
	private StackI stack;
	private DropOutStackI dropOutStack;

	private Card card1;
	private Card card2;
	private Card card3;
	private Card card4;
	private Card card5;
	private Card card6;

	@BeforeEach
	void setUp() throws Exception {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

//		this.stack = new ArrayDropOutStack(5);
		this.dropOutStack = new ArrayDropOutStack(5);

		this.card1 = new Card("Spade", "Jack");
		this.card2 = new Card("Club", "2");
		this.card3 = new Card("Heart", "3");
		this.card4 = new Card("Heart", "4");
		this.card5 = new Card("Diamond", "5");
		this.card6 = new Card("Diamond", "6");
	}

	@Test
	@Order(1)
	void test_stack_drop_out() {
		dropOutStack.push(card1);
		dropOutStack.push(card2);
		dropOutStack.push(card3);
		dropOutStack.push(card4);
		dropOutStack.push(card5);
		dropOutStack.push(card6);
		System.out.println("stack = " + dropOutStack);
		assertEquals(5, dropOutStack.size());
	}

	@Test
	@Order(2)
	void test_stack_drop_out_multiple_times() {
		dropOutStack.push(card1);
		dropOutStack.push(card2);
		dropOutStack.push(card3);
		dropOutStack.push(card4);
		dropOutStack.push(card5);
		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card6);

		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card1);
		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card2);
		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card3);
		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card4);
		System.out.println("stack = " + dropOutStack);
		dropOutStack.push(card5);
		System.out.println("stack = " + dropOutStack);

	}

	class Card {
		public String symbol;
		public String ranking;

		public Card(String symbol, String ranking) {
			super();
			this.symbol = symbol;
			this.ranking = ranking;
		}

		@Override
		public String toString() {
			return this.symbol + ": " + this.ranking;
		}
	}
}


