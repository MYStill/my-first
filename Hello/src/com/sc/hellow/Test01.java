package com.sc.hellow;

import java.util.Scanner;

public class Test01 {
	public int num=0;
	public String brand="爱国者F928";
	public double weight=12.4;
	public String type="内置锂电池";
	public int price=499;
/*	public static void main(String [] args) {
		System.out.println("商品名称  购买数量  商品单价  金额");
		System.out.println("鳄鱼夹克  1        1900     1900  ");
		System.out.println("ipodMP4  2        400      800");

	}*/
	public void printf() {
		System.out.println("品牌(brand):"+this.getBrand());
		System.out.println("重量(weight):"+this.getWeight());
		System.out.println("电池类型(type):"+this.getType());
		System.out.println("价格(price):"+this.getPrice());
	}
	public void sys() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输HTML成绩");
		double htmlscore = sc.nextDouble();
		System.out.println("请输java成绩");
		double javascore = sc.nextDouble();
		System.out.println("请输sql成绩");
		double SQLscore = sc.nextDouble();
		System.out.println("html成绩为："+htmlscore);
		System.out.println("java成绩为："+javascore);
		System.out.println("sql成绩为："+SQLscore);
		sc.close();
	}
	public void dayByDay(int day) {
		int i=day%7;
		int j=day/7;
		System.out.println("还有"+j+"周"+i+"天。");
	}
	public void areaByR(double r) {
		System.out.println(r*r*Math.PI);
	}
	public void custom() {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int i=0;
		System.out.println("****************商品单***************\n");
		System.out.println("购买物品           单价              选项            ");
		System.out.println("T恤                    ￥245       1         ");
		System.out.println("网球鞋               ￥570       2         ");
		System.out.println("网球拍               ￥320       3         ");
		System.out.println("请选择你要购买的物品");
		while(sc.nextInt()>0) {
			if(sc.hasNextInt()) {
				a[i]=sc.nextInt();
				System.out.println("请选择你要购买的物品的个数");
			}
			if(sc.hasNextInt()) {
				b[i]=sc.nextInt();
				System.out.println("请选择你要购买的物品");
			}
			i++;
		}
		for(int k=0;k<a.length;k++) {
			if(a[k]==1) {
				a[k]=245;
			}else if(a[k]==2){
				a[k]=570;
			}else if(a[k]==3) {
				a[k]=320;
			}
		}
		double sum=0;
		for(int j=0;j<a.length;j++) {
			sum=sum+a[j]*b[j];
		}
		double realsum=0.8*sum;		
		System.out.println("你一共花费  ￥"+sum+"元");
		System.out.println("请输入你要付款的金额");
		double pay=sc.nextDouble();
		double returnm=pay-realsum;
		sc.close();
		System.out.println("以下是你的订单：请走好");
		System.out.println("****************消费单***************\n");
		System.out.println("购买物品           单价              个数              金额\n");
		System.out.println("T恤                    ￥245       2          ￥249\n");
		System.out.println("网球鞋               ￥570       1          ￥570\n");
		System.out.println("网球拍               ￥320       1          ￥320\n\n");
		System.out.println("折扣：               8折\n");
		System.out.println("消费总额            ￥"+realsum+"\n");
		System.out.println("实际缴费             ￥"+pay+"\n");
		System.out.println("找钱                   ￥"+returnm+"\n");
		System.out.println("本次购物获的积分:     33\n");
		
	}
	public void sumByNumber(int a) {
		String str=String.valueOf(a);
		char c[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			sum=sum+c[i] -'0';
		}
		System.out.println(sum);
	}
	public void IntMul(int a,int b) {
		if(a+b>1000 || a%b==0) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
