package hiromitest.sample;

import java.util.Date;

public class Item {
    Long id;
    String name;
    Integer price;
    String description;
    Date createdAt;

	public static Item newItem(Long id, String name, Integer price, String desc, Date createdAt) {
	    Item obj = new Item();
	    obj.id = id;
	    obj.name = name;
	    obj.price = price;
	    obj.description = desc;
	    obj.createdAt = createdAt;
	    return obj;
	}

	@Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price
            + ", description=" + description + ", createdAt=" + createdAt
            + "]";
    }
}