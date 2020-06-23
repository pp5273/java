package 기말고사대비.강현서;

import java.util.Scanner;

public class ProductManagement {
	Scanner scan = new Scanner(System.in);
	ProductInput cp = new ProductInput();
	ProductListView pv = new ProductListView();
	DeleteProduct dp = new DeleteProduct();

	public void manuRun() {
		int select;

		while (true) {
			manuList();
			select = scan.nextInt();
			switch (select) {

			case 1:
				cp.inProduct();
				continue;
			case 2:
				pv.productListView(cp.product);
				continue;
			case 3:
				continue;
			case 4:
				continue;
			case 5:
				continue;
			case 6:
				continue;
			case 7:
				dp.deleteProduct(cp.product);
				continue;
			case 8:
				continue;
			case 9:
				break;

			}
		}
	}

	public void manuList() {
		System.out.println("실행할 메뉴 번호 입력");
		System.out.println("1. 제품 데이터 입력");
		System.out.println("2. 제품리스트 보기(날짜순)");
		System.out.println("3. 개별 제품가격 금액 조정");
		System.out.println("4. 모든 제품 가격 일괄 조정");
		System.out.println("5. 가격 범위로 검색(가격순)");
		System.out.println("6. 입고 날짜로 검색");
		System.out.println("7. 제품 삭제");
		System.out.println("8. 종료");
	}

	public static void main(String[] args) {
		ProductManagement start = new ProductManagement();
		start.manuRun();
	}

}
