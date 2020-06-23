package 기말고사대비.강현서;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductListView {
	Scanner scan = new Scanner(System.in);
	ArrayList<CreateProduct> product2 = new ArrayList<CreateProduct>(10);

	public void productListView(ArrayList<CreateProduct> product) {
		int select;
		product2 = product;
		System.out.println("보고싶은 순서를 고르세요.\n1.날짜순보기  2.제품명  3.제품명 역순  4.가격순  5.가격역순");
		select = scan.nextInt();
		switch (select) {

		case 1:
			sortedByDate();
			break;
		case 2:
			sortedByName();
			break;
		case 3:
			sortedByReverseName();
			break;
		case 4:
			sortedByPrice();
			break;
		case 5:
			sortedByReversePrice();
			break;
		}
	}
	public void sortedByDate() {
		Collections.sort(product2);
		System.out.print(product2);
	}

	public void sortedByName() {

		Collections.sort(product2, new Comparator<CreateProduct>() {

			@Override
			public int compare(CreateProduct o1, CreateProduct o2) {
				// TODO Auto-generated method stub
				return o1.getModelName().compareTo(o2.getModelName());
			}

		});
		System.out.print(product2);
	}

	public void sortedByReverseName() {

		Collections.sort(product2, new Comparator<CreateProduct>() {

			@Override
			public int compare(CreateProduct o1, CreateProduct o2) {
				// TODO Auto-generated method stub
				return o2.getModelName().compareTo(o1.getModelName());
			}

		});
		System.out.print(product2);
	}

	public void sortedByPrice() {

		Collections.sort(product2, new Comparator<CreateProduct>() {

			@Override
			public int compare(CreateProduct o1, CreateProduct o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() - o2.getPrice();
			}
		});
		System.out.print(product2);
	}

	public void sortedByReversePrice() {

		Collections.sort(product2, new Comparator<CreateProduct>() {

			@Override
			public int compare(CreateProduct o1, CreateProduct o2) {
				// TODO Auto-generated method stub
				return o2.getPrice() - o1.getPrice();
			}
		});
		System.out.print(product2);
	}

}
