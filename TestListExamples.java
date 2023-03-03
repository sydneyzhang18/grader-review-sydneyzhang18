import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}


public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testFilter1() {
    ArrayList<String> input1 = new ArrayList<String> ();
    input1.add("MOON");
    input1.add("moon");
    input1.add("no");
    ArrayList<String> output1 = new ArrayList<String> ();
    output1.add("MOON");
    output1.add("moon");
    IsMoon sc = new IsMoon();
    
    assertEquals(output1, ListExamples.filter(input1, sc));

    
 }
 @Test
 public void testFilter2(){
    ArrayList<String> input2 = new ArrayList<String> ();
    input2.add("MOON");
    input2.add("no");
    input2.add("moon");
    ArrayList<String> output1 = new ArrayList<String> ();
    output1.add("MOON");
    output1.add("moon");
    IsMoon sc = new IsMoon();
    assertEquals(output1,ListExamples.filter(input2, sc));
 }

}
