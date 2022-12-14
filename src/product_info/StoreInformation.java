package product_info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StoreInformation {
    public static void main(String[] args) {

        ArrayList<Price> priceArrayList = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Название магазина: ");
            String storeName = scn.nextLine();

            System.out.print("Название товара: ");
            String productName = scn.nextLine();

            System.out.print("Стоимость товара в гривнах: ");
            int productValue = scn.nextInt();

            priceArrayList.add(new Price(storeName, productName, productValue));
        }
        Collections.sort(priceArrayList);

        String arrayInfo = "";
        for (int i = 0; i < priceArrayList.size(); i++){
            arrayInfo += priceArrayList.get(i);
        }
        System.out.println(arrayInfo);

        System.out.print("Введите название магазина: ");
        Scanner scn = new Scanner(System.in);
        String shopName = scn.nextLine();

        boolean flag = false;
        for (Price par : priceArrayList) {

            if (shopName.equalsIgnoreCase(par.getStoreName())) {
                flag = true;
                System.out.println(shopName + ": " + par.getProductName() +
                                "; стоимость: " + par.getProductValue());
            }
        }
        if (!flag) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Магазина " + shopName + " в прайсе нет.");
            }
        }
    }//main
}//class