package 기말고사대비.강현서;

public class CreateAudio extends CreateProduct {
	private String output;
	private String tunerAid;

	public CreateAudio(int preductId, String modelName, String manufacturer, int receivingDate, int inventoryQuantity,
			int price, String output, String tunerAid) {
		super(preductId, modelName, manufacturer, receivingDate, inventoryQuantity, price);
		this.output = output;
		this.tunerAid = tunerAid;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("오디오: %d %s %s %d %d %d %s %s\n",getPreductId(),getModelName(),getManufacturer(),receivingDate,
				getInventoryQuantity(),getPrice(),output,tunerAid);
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getTunerAid() {
		return tunerAid;
	}

	public void setTunerAid(String tunerAid) {
		this.tunerAid = tunerAid;
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