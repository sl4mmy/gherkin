package gherkin.parser;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;


public class FilterMethodFactoryTest {

	@Test
	public void getFilterMethod_withString_returnsTagFilterMethod()  {
		IFilterMethod method = new FilterMethodFactory().getFilterMethod(String.class);
		assertEquals(TagFilterMethod.class, method.getClass());
	}

	@Test
	public void getFilterMethod_withLong_returnsLineFilterMethod()  {
		IFilterMethod method = new FilterMethodFactory().getFilterMethod(Long.class);
		assertEquals(LineFilterMethod.class, method.getClass());
	}

	@Test
	public void getFilterMethod_withOther_returnsNameFilterMethod()  {
		IFilterMethod method = new FilterMethodFactory().getFilterMethod(Pattern.class);
		assertEquals(NameFilterMethod.class, method.getClass());
	}
	
}
