package �⸻�����.������;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInput {
	Scanner scan = new Scanner(System.in);

	ArrayList<CreateProduct> product = new ArrayList<CreateProduct>(10);

	//CreateRefrigerator cr = new CreateRefrigerator();
	//CreateAudio ca = new CreateAudio();
	public void inProduct() {

		while (true) {

			System.out.println("��ǰ ������? (c: CPU, r:�����, a:�����  x: ����)");
			String select = scan.next();
			switch (select) {

			case "c":
				inCPU();
				continue;
			case "r":
				inRefrigerator();
				continue;
			case "a":
				inAudio();
				continue;
			case "x":
				break;
			}
			break;
		}
	}

	public void inCPU() {

		System.out.println("���λ��� �Է�(��ǰ��ȣ, ���M��, ������, �԰�¥, ������, ����, Ŭ��, ��Ĺ)");
		CreateCPU cp = new CreateCPU(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.next(),scan.nextInt());
		product.add(cp);
	}

	public void inRefrigerator() {

		System.out.println("���λ��� �Է�(��ǰ��ȣ, ���M��, ������, �԰�¥, ������, ����, �뷮int, Ÿ��)");
		CreateRefrigerator cr = new CreateRefrigerator(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.nextInt(),scan.next());
		product.add(cr);
	}

	public void inAudio() {

		System.out.println("���λ��� �Է�(��ǰ��ȣ, ���M��, ������, �԰�¥, ������, ����, �������, Ʃ����������)");
		CreateAudio ca = new CreateAudio(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.next(),scan.next());
		product.add(ca);
	}
}
