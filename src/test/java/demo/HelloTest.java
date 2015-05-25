package demo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by yulu on 25/5/15.
 */
public class HelloTest extends TestCase {
  @Test
  public void testSayHello() {
    Hello hello = new Hello();
    assertEquals("Hello, Gradle", hello.sayHello());
  }

}