package �⸻�����.������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DeleteProduct {
	Scanner scan = new Scanner(System.in);
	ArrayList<CreateProduct> product2 = new ArrayList<CreateProduct>(10);

	public void deleteProduct(ArrayList<CreateProduct> product) {
		int getid;
		product2=product;
		sortedById();
		System.out.print("�Է�(produtid): ");
		getid = scan.nextInt();
		System.out.println("��ǰ" + getid + "��" + product.toString() + "�� �����Ͽ����ϴ�.");
		//if(product.get(getid).isChecked()==true)
		product.remove((Integer)getid);

	}

	public void sortedById() {

		Collections.sort(product2, new Comparator<CreateProduct>() {

			@Override
			public int compare(CreateProduct o1, CreateProduct o2) {

				return o1.getPreductId() - o2.getPreductId();

			}

		});
		System.out.print(product2);
	}
}
