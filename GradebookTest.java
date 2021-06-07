
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTest {
Gradebook g1;
Gradebook g2;


	@Before
	public void setUp() throws Exception {
		g1=new Gradebook(5);
		g2=new Gradebook(5);
		g1.addScore(76);
		g2.addScore(56);

	}

	@After
	public void tearDown() throws Exception {
		g1=null;
		g2=null;
	}

	@Test
	public void test() {
		assertEquals(76, g1.sum(),76);
		assertEquals(56, g2.sum(),56);
		
		assertEquals(-99, g1.minimum(),-99);
		assertEquals(-99, g2.minimum(),-99);
		
		assertEquals(76, g1.finalScore(),76);
		assertEquals(56, g2.finalScore(),56);

	}

}
