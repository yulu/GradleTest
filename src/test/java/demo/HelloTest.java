package demo;

import gui.ava.html.image.generator.HtmlImageGenerator;
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

    HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
    imageGenerator.loadHtml("<b>Hello World!</b> Please goto <a title=\"Goto Google\" href=\"http://www.google.com\">Google</a>." +
      "<img src=\"http://www.dosavannah.com/sites/default/files/photos/cake.jpg\" height = \"42\" width=\"42\">");
    imageGenerator.saveAsImage("hello-world.png");
    imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
  }

}