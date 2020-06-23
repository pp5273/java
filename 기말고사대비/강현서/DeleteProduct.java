package 기말고사대비.강현서;

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
		System.out.print("입력(produtid): ");
		getid = scan.nextInt();
		System.out.println("제품" + getid + "번" + product.toString() + "를 삭제하였습니다.");
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
