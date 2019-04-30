package main;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF PROJECT
 * 
 */
public class ValidationTest {
	TicTacToe m;
	@SuppressWarnings("static-access")
	@Test
	public void limitTesting() {
		m = new TicTacToe();
		m.ticbox = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m.ticbox[i][j] = 0;
			}
		}
		m.ticbox[0][0]=1;
		assertEquals(false,m.validate(3, 3, m.ticbox));
		assertEquals(true,m.validate(0, 2, m.ticbox));
		assertEquals(false,m.validate(0, 0, m.ticbox));
		assertEquals(true,m.validate(1, 1, m.ticbox));
	}
}
