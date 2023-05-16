package gr.upatras.junit.first;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MyClassTest {
 @Test
 void testSubtract() {
 MyClass tester = new MyClass();
 assertEquals("ZERO", tester.subtract(0,0 ));
 }
}