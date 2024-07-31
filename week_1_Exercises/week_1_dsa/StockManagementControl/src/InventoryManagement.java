import java.util.*;

public class InventoryManagement {
    static List<Product> inventory=new ArrayList<Product>(10);
    public static void add(Scanner sc){
        System.out.println("Do you want to enter at specific index?");
        if(sc.nextBoolean()){
            System.out.println("Enter the index to be added to and the productId, productName, quantity, price");
            inventory.add(sc.nextInt(),new Product(sc.nextInt(),sc.next()+sc.nextLine(), sc.nextInt(),sc.nextDouble()));
        }
        else{
            System.out.println("Enter the productId, productName, quantity, price");
            inventory.add(new Product(sc.nextInt(),sc.next()+sc.nextLine(), sc.nextInt(),sc.nextDouble()));
        }
    }

    public static void update(Scanner sc){
        System.out.println("Enter index of product to update");
        int index=sc.nextInt();

        if(inventory.size() >index && inventory.get(index)!=null){
            System.out.println("Enter new ProductId:");
            inventory.get(index).setProductId(sc.nextInt());
            System.out.println("Enter new ProductName:");
            inventory.get(index).setProductName(sc.next()+sc.nextLine());
            System.out.println("Enter new Quantity:");
            inventory.get(index).setQuantity(sc.nextInt());
            System.out.println("Enter new Price:");
            inventory.get(index).setPrice(sc.nextDouble());
        }
        else{
            System.out.println("No element found at that index to update");
        }

    }

    public static void delete(Scanner sc){
        System.out.println("Enter index of product to delete");
        int index=sc.nextInt();
        if(inventory.size() >index && inventory.get(index)!=null){
            inventory.remove(index);
        }else{
            System.out.println("No element found at that index to delete");
        }


    }

    public static void main(String[] args) {

        int chk;
        boolean flag;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("What do you want to do with the inventory? \n -> Add-1 \n -> Update-2\n -> Delete-3 \n Exit-4");
            chk= sc.nextInt();
            flag=true;
            switch(chk){
                case 1:
                    add(sc);
                    break;
                case 2:
                    update(sc);
                    break;
                case 3:
                    delete(sc);
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong Input try again");
            }
        }while(flag);
        System.out.println(inventory);
    }
}

