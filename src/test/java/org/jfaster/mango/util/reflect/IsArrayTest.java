
package org.jfaster.mango.util.reflect;

import org.junit.Test;

import java.io.Serializable;
import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author Kenji Nicholson
 */
public class IsArrayTest {

  @Test
  public void testIsArray() throws Exception {
      TypeToken<List<String>> token = new TypeToken<List<String>>() {};
      assertTrue(token.isArray());
  }

}
