package hiromitest.sample;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ItemTest {

	@Test
	//@Ignore("equalsメソッドがオーバーライドされていないため失敗する")
	public void Objectのequalsメソッドを利用する() {
	    // Setup
	    Item expected = Item.newItem(1L, "test", 2000, "説明", null);
	    Item actual = Item.newItem(1L, "test", 2000, "説明", new Date());
	    // Exercise
	    // - 略 -
	    // Verify
	    assertThat(actual, is(expected));
	}
	@Test
	public void 個別にアサーションを行う() throws Exception {
	    // Setup
	    Item expected = Item.newItem(1L, "test", 2000, "説明", null);
	    Item actual = Item.newItem(1L, "test", 2000, "説明", new Date());
	    // Exercise
	    // - 略 -
	    // Verify
	    assertThat("id", actual.id, is(expected.id));
	    assertThat("name", actual.name, is(expected.name));
	    assertThat("price", actual.price, is(expected.price));
	    assertThat("description", actual.description, is(expected.description));
	}

	@Test
	public void 個別にアサーションを行うメソッドを使う() throws Exception {
	    // Setup
	    Item expected = Item.newItem(1L, "test", 2000, "説明", null);
	    Item actual = Item.newItem(1L, "test", 2000, "説明", new Date());
	    // Exercise
	    // - 略 -
	    // Verify
	    verify(actual, expected);
	}

	static void verify(Item actual, Item expected) {
	    assertThat("id", actual.id, is(expected.id));
	    assertThat("name", actual.name, is(expected.name));
	    assertThat("price", actual.price, is(expected.price));
	    assertThat("description", actual.description, is(expected.description));
	}

}
