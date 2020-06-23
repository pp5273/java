package 기말고사대비.강현서;

public class CreateCPU extends CreateProduct{
	
	private String speed;
	private int sorket;
	
	public CreateCPU(int preductId, String modelName, String manufacturer, int receivingDate, int inventoryQuantity,
			int price, String speed, int sorket) {
		super(preductId, modelName, manufacturer, receivingDate, inventoryQuantity, price);
		this.speed =speed;
		this.sorket =sorket;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("CPU: %d %s %s %d %d %d %s %d\n",getPreductId(),getModelName(),getManufacturer(),receivingDate,
				getInventoryQuantity(),getPrice(),speed,sorket);
	}
	
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getSorket() {
		return sorket;
	}
	public void setSorket(int sorket) {
		this.sorket = sorket;
	}
	@Override
	public int compareTo(CreateProduct o) {
		if(super.getReceivingDate() <o.getReceivingDate()) {
			return -1;
		}else if(super.getReceivingDate()>o.getReceivingDate()) {
			return 1;
		}
		return 0;
		//return super.receivingDate.compareTo(o.receivingDate);
	}
	
}
