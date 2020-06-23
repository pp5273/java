package 기말고사대비.강현서;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInput {
	Scanner scan = new Scanner(System.in);

	ArrayList<CreateProduct> product = new ArrayList<CreateProduct>(10);

	//CreateRefrigerator cr = new CreateRefrigerator();
	//CreateAudio ca = new CreateAudio();
	public void inProduct() {

		while (true) {

			System.out.println("제품 종류는? (c: CPU, r:냉장고, a:오디오  x: 종료)");
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

		System.out.println("세부사항 입력(제품번호, 모덺명, 제조사, 입고날짜, 재고수량, 가격, 클럭, 소캣)");
		CreateCPU cp = new CreateCPU(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.next(),scan.nextInt());
		product.add(cp);
	}

	public void inRefrigerator() {

		System.out.println("세부사항 입력(제품번호, 모덺명, 제조사, 입고날짜, 재고수량, 가격, 용량int, 타입)");
		CreateRefrigerator cr = new CreateRefrigerator(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.nextInt(),scan.next());
		product.add(cr);
	}

	public void inAudio() {

		System.out.println("세부사항 입력(제품번호, 모덺명, 제조사, 입고날짜, 재고수량, 가격, 앰프출력, 튜너지원여부)");
		CreateAudio ca = new CreateAudio(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.next(),scan.next());
		product.add(ca);
	}
}
