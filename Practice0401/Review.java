
public class Review {
	
	String item;
	int price; 
	int volume;
	
	
	Review(String item, int price, int volume) {
		this.item = item;
		this.price = price;
		this.volume = volume; 
	}
	
	
	Review(String item, int price) {
		this.item = item;
		this.price = price;
	}
	
}
