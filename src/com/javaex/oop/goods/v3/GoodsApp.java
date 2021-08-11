package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
			//Goods notebook = new Goods(); // 기본 생성자 없음
			Goods notebook = new Goods("LG gram", 1700000);
			
			// 필드에 접근
	    //  notebook.name = "LG gram";
		//	notebook.price = 1700000;
			notebook.setName("LG gram");
			notebook.setPrice(1700000);
			
			//Goods smartphone = new Goods();
			Goods smartphone = new Goods("iphone 12",800000);
			//smartphone.name = "iphone 12";
			//smartphone.price = 800000;
			smartphone.setName("iphone 12");
			smartphone.setPrice(800000);
			
			// 출력
			System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
			System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());
			notebook.showInfo();
			smartphone.showInfo();
			
			//notebook.setPrice(170); // price 필드는 read only
			//notebook.showInfo();
			
	}

}
