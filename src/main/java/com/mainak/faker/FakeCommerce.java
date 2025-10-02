package com.mainak.faker;

public class FakeCommerce {
    // Function to generate fake product names
    public String productName(){
        String[] productNames = {"Smartphone", "Laptop", "Headphones", "Smartwatch", "Camera", "Television", "Tablet", "Bluetooth Speaker", "Gaming Console", "E-reader",
                "Refrigerator", "Washing Machine", "Microwave Oven", "Air Conditioner", "Vacuum Cleaner", "Dishwasher", "Toaster", "Coffee Maker", "Blender", "Slow Cooker",
                "Sofa", "Dining Table", "Bed Frame", "Wardrobe", "Bookshelf", "Desk Chair", "TV Stand", "Nightstand", "Dresser", "Coffee Table",
                "T-shirt", "Jeans", "Sneakers", "Jacket", "Dress", "Skirt", "Sweater", "Boots", "Hat", "Scarf",
                "Action Figure", "Doll", "Puzzle", "Board Game", "Building Blocks", "Remote Control Car", "Stuffed Animal", "Toy Train Set", "Kite", "Water Gun"
        };
        return productNames[(int) (Math.random() * productNames.length)];
    }

    // Function to generate fake product categories
    public String productCategory(){
        String[] productCategories = {"Electronics", "Home Appliances", "Furniture", "Clothing", "Toys", "Books", "Sports Equipment", "Beauty Products", "Groceries", "Automotive", "Jewelry", "Musical Instruments", "Office Supplies", "Pet Supplies", "Garden Tools", "Health Products", "Footwear", "Accessories", "Baby Products", "Outdoor Gear"};
        return productCategories[(int) (Math.random() * productCategories.length)];
    }

    // Function to generate fake product brand names
    public String productBrand(){
        String[] productBrands = {"Sony", "Samsung", "Apple", "LG", "Dell", "HP", "Lenovo", "Asus", "Acer", "Microsoft",
                "Nike", "Adidas", "Puma", "Reebok", "Under Armour", "New Balance", "Skechers", "Vans", "Converse", "Fila",
                "Ikea", "Ashley Furniture", "Wayfair", "La-Z-Boy", "West Elm", "Crate & Barrel", "Pottery Barn", "Restoration Hardware", "CB2", "Ethan Allen",
                "Lego", "Mattel", "Hasbro", "Fisher-Price", "Nerf", "Barbie", "Hot Wheels", "Play-Doh", "Crayola", "Melissa & Doug"
        };
        return productBrands[(int) (Math.random() * productBrands.length)];
    }

    // Function to generate fake prices within range
    public double price(int min, int max){
        if(min < 0) min = 0;
        if(max <= min) max = min + 100;
        return min + Math.round((Math.random() * (max - min)) * 100.0) / 100.0;
    }

    // Function to generate fake discount codes
    public String discountCode(int length) {
        if (length <= 0) length = 8; // Default length
        if (length > 12) length = 12; // Max length
        StringBuilder discountCode = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (Math.random() < 0.5) {
                discountCode.append((char) ('A' + (int) (Math.random() * 26))); // Random letter
            } else {
                discountCode.append((int) (Math.random() * 10)); // Random digit
            }
        }

        return discountCode.toString();
    }
}
