package �⸻�����.������;

public abstract class CreateProduct implements Comparable<CreateProduct>{
	private int preductId;			//��ǰ��ȣ
	private String modelName;		//�𵨸�
	private String manufacturer;	//������
	protected int receivingDate;	//�԰�¥
	private int inventoryQuantity;	//������
	private int price;				//����
	
	public CreateProduct(int preductId,String modelName, String manufacturer, 
			int receivingDate,int inventoryQuantity, int price) {
		this.preductId =preductId;
		this.modelName =modelName;
		this.manufacturer=manufacturer;
		this.receivingDate=receivingDate;
		this.inventoryQuantity=inventoryQuantity;
		this.price=price;
	}
	

	
	@Override
	public String toString() {
		return String.format("%d %s %s %d %d %d\n",preductId,modelName,manufacturer,receivingDate,
				inventoryQuantity,price);
	}
	@Override
	public int compareTo(CreateProduct o) {
		
		return this.receivingDate- o.getReceivingDate();
	}


	public int getPreductId() {
		return preductId;
	}
	public void setPreductId(int preductId) {
		this.preductId = preductId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getReceivingDate() {
		return receivingDate;
	}
	public void setReceivingDate(int receivingDate) {
		this.receivingDate = receivingDate;
	}
	public int getInventoryQuantity() {
		return inventoryQuantity;
	}
	public void setInventoryQuantity(int inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
