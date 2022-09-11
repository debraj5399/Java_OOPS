import java.util.ArrayList;
import java.util.List;

import model.ClothingItem;
import model.ClothingSize;
import model.Pant;
import model.Shirt;

public class Main{
    public static void main(String[] args) {
        List<ClothingItem> items = new ArrayList<>();
        items.add(new Shirt(ClothingSize.L, 19.99, 3));
        items.add(new Pant(ClothingSize.M, 23.35,4));

        for (ClothingItem clothingItem : items) {
            showAllDetails(clothingItem);
        }
        
    }

    public static void showAllDetails(ClothingItem item){
        var totalPrice = item.getPrice() * item.getQuantity();
        var output = String.format("Your %s %s order will cost %s", item.getSize(), item.getType(), totalPrice);
        System.out.println(output);
    }

}
