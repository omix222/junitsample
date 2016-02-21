package hiromitest.sample;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CarTest {

	@Test
	public void testDef() {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6");

		// Verify
		// まずは List のサイズが期待値通りであるかを確認する
		assertThat(list.size(), is(6));
		// で、その後に、個々の要素について期待値通りであるかを確認していく
		assertThat(list.get(0), is("1"));
		assertThat(list.get(1), is("2"));
		assertThat(list.get(2), is("3"));
		assertThat(list.get(3), is("4"));
		assertThat(list.get(4), is("5"));
		assertThat(list.get(5), is("6"));
		}
	@Test
	public void testHasItem() {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6");
		// Verify
		assertThat(list, hasItems("1", "2", "3", "4", "5", "6"));
		assertThat(list, hasItems("6", "5", "4", "3", "2", "1"));
	}

	@Test
	public void testContais() {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6");
		// Verify
		assertThat(list, contains("1", "2", "3", "4", "5", "6"));  // こちらはグリーン
//		assertThat(list, contains("6", "5", "4", "3", "2", "1"));  // こちらはレッド
	}


}
