import java.util.Arrays;
import java.util.Scanner;
public class SearchDriver {

    static Scanner sc=new Scanner(System.in);
    static int linearSearch(Product[] prods,int targetProductID,int size){
        int itr=0;
        for(int i=0;i<size;i++){
            itr++;
            if(prods[i].getProductId()==targetProductID){
                System.out.println("Number of Iterations:"+itr);
                return i;
            }
        }
        System.out.println("Number of Iterations:"+itr);
        return -1;
    }

    static int binarySearch(Product[] prods,int target,int size){
        int start=0;
        int end=size-1;
        int mid,itr=0;
        while(start<=end) {
            itr++;
            mid = start + (end - start) / 2;
            if(prods[mid].getProductId()==target){
                System.out.println("Number of Iterations:"+itr);
                return mid;
            }
            else if(target>prods[mid].getProductId()){
                start=mid+1;
            }
            else if(target<prods[mid].getProductId()){
                end=mid-1;
            }
        }
        System.out.println("Number of Iterations:"+itr);
        return -1;
    }

//    static void populateInventory(Product[] prods,int size){
//        for(int i=0;i<size;i++){
//            System.out.println("Enter Product Id:");
//            prods[i].setProductId(sc.nextInt());
//            System.out.println("Enter Product Name:");
//            prods[i].setProductName(sc.nextLine());
//            System.out.println("Enter Product Category:");
//            prods[i].setCategory(sc.nextLine());
//        }
//
//    }


    public static void main(String[] args) {
        System.out.println("Enter the number of products to be stored in inventory");
        int size= sc.nextInt();
        Product[] products=new Product[]{
                new Product(15, "Laptop", "Electronics"),
                new Product(3, "Smartphone", "Electronics"),
                new Product(7, "Tablet", "Electronics"),
                new Product(12, "Headphones", "Accessories"),
                new Product(1, "Charger", "Accessories"),
                new Product(20, "Camera", "Electronics"),
                new Product(5, "Printer", "Office Supplies"),
                new Product(9, "Monitor", "Electronics"),
                new Product(14, "Keyboard", "Accessories"),
                new Product(4, "Mouse", "Accessories"),
                new Product(19, "Desk Lamp", "Furniture"),
                new Product(8, "Chair", "Furniture"),
                new Product(17, "Desk", "Furniture"),
                new Product(10, "Router", "Electronics"),
                new Product(2, "Switch", "Electronics"),
                new Product(11, "External Hard Drive", "Storage"),
                new Product(6, "USB Flash Drive", "Storage"),
                new Product(18, "Memory Card", "Storage"),
                new Product(13, "Smartwatch", "Electronics"),
                new Product(16, "Fitness Tracker", "Electronics")
        };
        //populateInventory(products,size);
        System.out.println("Unsorted: \n"+Arrays.toString(products));
        System.out.println("Enter the Id to search:");
        int target= sc.nextInt();
        int res=linearSearch(products,target,size);
        if(res!=-1){
            System.out.println("Item found at "+res);
        }

        Arrays.sort(products);
        System.out.println("Sorted: \n"+Arrays.toString(products));
        res=binarySearch(products,target,size);
        if(res!=-1){
            System.out.println("Item found at "+res);
        }

    }
}
