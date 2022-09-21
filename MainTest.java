/* 
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * Sept 20, 2022
 * macOS
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void testFindPattern(){
        assertEquals(" 1 3 5", Main.findPattern("asdfghjkl;eiunvrqfnoj", "adg"));
        assertEquals(" 4", Main.findPattern("asdfghj", "f"));
        assertEquals(" 12", Main.findPattern("aaaaaaaaaaa aaaaaaaaaaa", " "));
        assertEquals("", Main.findPattern("", "random"));
        assertEquals(" 1 3 5", Main.findPattern("w o w", "wow"));
    }
}
