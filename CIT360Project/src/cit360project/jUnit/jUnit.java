 import org.junit.*;
        import static org.junit.Assert.*;
         
        public class EnglishTest {
            private English a;
         
            @Before
            public void setUp(){
                a = new English();
            }
         
            @Test
            public void testAdd(){
                assertEquals(4, a.add(3, 1));
            }
         
            @Test
            public void testSub(){
                assertEquals(-4, a.sub(-3, 1));
            }
        }