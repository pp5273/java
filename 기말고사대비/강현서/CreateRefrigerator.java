package 기말고사대비.강현서;

public class CreateRefrigerator extends CreateProduct {

	private int volume;
	private String type;

	public CreateRefrigerator(int preductId, String modelName, String manufacturer, int receivingDate,
			int inventoryQuantity, int price, int volume, String type) {
		super(preductId, modelName, manufacturer, receivingDate, inventoryQuantity, price);
		this.volume = volume;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("냉장고: %d %s %s %d %d %d %d %s\n",getPreductId(),getModelName(),getManufacturer(),receivingDate,
				getInventoryQuantity(),getPrice(),volume,type);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(CreateProduct o) {
		if (super.getReceivingDate() < o.getReceivingDate()) {
			return -1;
		} else if (super.getReceivingDate() > o.getReceivingDate()) {
			return 1;
		}
		return 0;
		// return super.receivingDate.compareTo(o.receivingDate);
	}
}
