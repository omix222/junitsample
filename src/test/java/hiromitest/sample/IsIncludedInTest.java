package hiromitest.sample;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IsIncludedInTest {

	@Test
	public void isIncludedInテスト(){
	    List<Status> list = Arrays.asList(Status.Hoge, Status.Fuga, Status.Piyo);
	    assertThat(Status.Hoge, is(IsIncludedIn.includedIn(list)));
	    assertThat(Status.Other, is(not(IsIncludedIn.includedIn(list))));
	}
}
