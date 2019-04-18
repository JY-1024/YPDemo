package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("--------------------------商品库存清单-------------------------");
        System.out.println("品牌类型          尺寸          价格         库存数 ");

        //定义表格中的数据变量
        //品牌型号，String，尺寸，价格，double， 库存int
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        int    macCount = 5;

        String thinkBrand = "ThinkPadT450";
        double thinkSize = 14;
        double thinkPrice = 5999.99;
        int    thinkCount = 10;

        String asusBrand = "ASUS-FL5800";
        double asusSize = 15.6;
        double asusPrice = 4999.5;
        int    asusCount = 18;

        System.out.println(macBrand+"      "+macSize+"          "+macPrice+"      "+macCount);
        System.out.println(thinkBrand+"    "+thinkSize+"          "+thinkPrice+"      "+thinkCount);
        System.out.println(asusBrand+"     "+asusSize+"          "+asusPrice+"       "+asusCount);

        //计算库存总数，所有商品数量库存求和
        int totalCount = macCount+thinkCount+asusCount;
        //计算所有商品库存的总金额，每个商品价格*库存数
        double totalMoney = macCount*macPrice + thinkCount*thinkPrice + asusCount*asusPrice;
        //输出表格底部
        System.out.println("总库存数："+totalCount);
        System.out.println("商品库存总金额："+totalMoney);


    }
}
