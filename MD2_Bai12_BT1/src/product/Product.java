package product;

import java.util.Scanner;

public class Product {
    private int id;
    private  int price;
    private String name;
    private int quantity;
    private Boolean status;

    public Product() {
    }

    public Product(int id, int price, String name, int quantity, Boolean status) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void inputData(Scanner sc){
        System.out.print("Nhập mã sản phẩm: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        this.price = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập trạng thái sản phẩm: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayData(){
        System.out.printf("%-10d%-20s%-10d%-10d%-10b\n",this.id,this.name,this.price,this.quantity,this.status);
    }

}
