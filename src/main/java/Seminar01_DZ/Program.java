package Seminar01_DZ;

import Seminar01_DZ.ChildrenProducts.Nipple;
import Seminar01_DZ.Drinks.*;
import Seminar01_DZ.FoodProducts.*;
import Seminar01_DZ.ChildrenProducts.Diapers;
import Seminar01_DZ.HygieneItems.*;
import Seminar01_DZ.Base.Product;

public class Program {
    public static void main(String[] args) {

        Milk milk1 = new Milk("Простоквашино", 85, 10, "бутылка", 930, 3.2, "09.03.2023");
        Lemonade lemonade1 = new Lemonade("Буратино", 79, 12, "бутылка", 450);
        Bread bread1 = new Bread("Ржаной край", 62, 13, "упак.", "07.03.2023", "ржаная");
        Eggs egg1 = new Eggs("Лето", 99, 6, "упак.", "19.03.2023", 10);
        Masks mask1 = new Masks("MyMask", 29,100,"шт.",1);
        ToiletPaper toiletPaper1 = new ToiletPaper("Ежик", 18, 40, "рулон");
        Diapers diaper1 = new Diapers("Pumpers", 1200, 10, "упак.", 0, true, 4, 8, 12, "Трусики");
        Nipple nipple1 = new Nipple("Philips", 1150, 5, "шт.", 0, true);

        Product[] products = new Product[]{milk1, lemonade1, bread1, egg1, mask1, toiletPaper1, diaper1, nipple1};

        for (Product product: products) {
            productInfo(product);
        }
    }

    public static void productInfo(Product product){
        System.out.println(product);
    }
}
