package �⸻�����.������;

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
		System.out.println("������ �޴� ��ȣ �Է�");
		System.out.println("1. ��ǰ ������ �Է�");
		System.out.println("2. ��ǰ����Ʈ ����(��¥��)");
		System.out.println("3. ���� ��ǰ���� �ݾ� ����");
		System.out.println("4. ��� ��ǰ ���� �ϰ� ����");
		System.out.println("5. ���� ������ �˻�(���ݼ�)");
		System.out.println("6. �԰� ��¥�� �˻�");
		System.out.println("7. ��ǰ ����");
		System.out.println("8. ����");
	}

	public static void main(String[] args) {
		ProductManagement start = new ProductManagement();
		start.manuRun();
	}

}
